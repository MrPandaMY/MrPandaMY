const chatDisplay = document.getElementById('chat-display');
const userInput = document.getElementById('user-input');
const sendBtn = document.getElementById('send-btn');

// Replace with your OpenAI API key securely for testing
// Never push your api key to public repositories/Github

const OPENAI_API_KEY = 'REMOVE-FOR-SECURITY-PURPOSES'; // Replace with your OpenAI API key

// OpenAI model to use
// const OPENAI_MODEL = 'gpt-3.5-turbo'; // Default model
const OPENAI_MODEL = 'gpt-4o-preview'; // Uncomment to use GPT-4 if available

// Add event listeners for button click and Enter key

sendBtn.addEventListener("click", sendMessage);
userInput.addEventListener("keydown", function (e) {
    if (e.key === "Enter") sendMessage();
})

function appendMessage(message, className) {
    const messageElem = document.createElement("div");
    messageElem.classList.add("message", className);
    messageElem.textContent = message;
    chatDisplay.appendChild(messageElem);
    chatDisplay.scrollTop = chatDisplay.scrollHeight;
}

async function sendMessage() {
    const message = userInput.value.trim();
    if (message === "") return;

    appendMessage(message, "user-message");
    userInput.value = "";

    appendMessage("...", "bot-message");

    try {
        const response = await fetch("https://api.openai.com/v1/chat/completions", {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
                "Authorization": `Bearer ${OPENAI_API_KEY}`
            },
            body: JSON.stringify({
                model: OPENAI_MODEL,
                messages: [{ role: "user", content: message}]
            })
        });
        const data = await response.json();
        let botReply = "Error: Unable to get a response.";

            if (data && data.choices && data.choices[0] && data.choices[0].message) {
            botReply = data.choices[0].message.content.trim();
            }


        // Remove the loading indicator
        const loadingElem = chatDisplay.querySelector(".bot-message:last-child");
        if (loadingElem) loadingElem.remove();

        appendMessage(botReply, "bot-message");
    } 
    catch (error) {
        console.error(error);
        const loadingElem = chatDisplay.querySelector(".bot-message:last-child");
        if (loadingElem) loadingElem.remove();
        appendMessage("Error: Unable to fetch response.", "bot-message");
    }
}