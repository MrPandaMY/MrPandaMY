/* game.js  [Fixed by ChatGPT]

const canvas = document.getElementById('pong');
const ctx = canvas.getContext('2d');

let PADDLE_WIDTH = 10;
let PADDLE_HEIGHT = 100;
let BALL_SIZE = 12;
let PLAYER_X = 20;
let AI_X = canvas.width - 20 - PADDLE_WIDTH;
let PADDLE_SPEED = 6;
let BALL_SPEED = 5;
let gameRunning = false;

const startBtn = document.getElementById('startBtn');
const restartBtn = document.getElementById('restartBtn');
const difficultySelect = document.getElementById('difficulty');
const statusMessage = document.getElementById('statusMessage');

let playerY, aiY, ballX, ballY, ballVX, ballVY, playerScore, aiScore;

const WINNING_SCORE = 5;

function setDifficulty(level) {
    if (level === 'easy') {
        PADDLE_SPEED = 4;
        BALL_SPEED = 4;
        PADDLE_HEIGHT = 120;
    } else if (level === 'medium') {
        PADDLE_SPEED = 6;
        BALL_SPEED = 10;
        PADDLE_HEIGHT = 100;
    } else if (level === 'hard') {
        PADDLE_SPEED = 8;
        BALL_SPEED = 16;
        PADDLE_HEIGHT = 80;
    }
}

function startGame() {
    setDifficulty(difficultySelect.value);
    canvas.style.display = 'block';
    startBtn.style.display = 'none';
    restartBtn.style.display = 'inline-block';
    statusMessage.textContent = '';
    resetGameState();
    if (!gameRunning) {
        gameRunning = true;
        requestAnimationFrame(game);
    }
}

function resetGameState() {
    playerScore = 0;
    aiScore = 0;
    playerY = (canvas.height - PADDLE_HEIGHT) / 2;
    aiY = (canvas.height - PADDLE_HEIGHT) / 2;
    resetBall(Math.random() > 0.5 ? 1 : -1);
}

function resetBall(direction) {
    ballX = canvas.width / 2 - BALL_SIZE / 2;
    ballY = canvas.height / 2 - BALL_SIZE / 2;
    ballVX = BALL_SPEED * direction;
    ballVY = BALL_SPEED * (Math.random() * 2 - 1);
}

function drawRect(x, y, w, h, color) {
    ctx.fillStyle = color;
    ctx.fillRect(x, y, w, h);
}

function drawText(text, x, y, color) {
    ctx.fillStyle = color;
    ctx.font = "40px Arial";
    ctx.textAlign = "center";
    ctx.fillText(text, x, y);
}

canvas.addEventListener('mousemove', function(evt) {
    const rect = canvas.getBoundingClientRect();
    const mouseY = evt.clientY - rect.top;
    playerY = Math.max(0, Math.min(canvas.height - PADDLE_HEIGHT, mouseY - PADDLE_HEIGHT / 2));
});

function moveAI() {
    const aiCenter = aiY + PADDLE_HEIGHT / 2;
    if (aiCenter < ballY) {
        aiY += PADDLE_SPEED;
    } else if (aiCenter > ballY + BALL_SIZE) {
        aiY -= PADDLE_SPEED;
    }
    aiY = Math.max(0, Math.min(canvas.height - PADDLE_HEIGHT, aiY));
}

function moveBall() {
    ballX += ballVX;
    ballY += ballVY;

    if (ballY <= 0 || ballY + BALL_SIZE >= canvas.height) {
        ballVY = -ballVY;
    }

    if (
        ballX <= PLAYER_X + PADDLE_WIDTH &&
        ballY + BALL_SIZE >= playerY &&
        ballY <= playerY + PADDLE_HEIGHT
    ) {
        ballVX = -ballVX;
        let hitPoint = (ballY + BALL_SIZE / 2) - (playerY + PADDLE_HEIGHT / 2);
        ballVY = hitPoint * 0.2;
        ballX = PLAYER_X + PADDLE_WIDTH;
    }

    if (
        ballX + BALL_SIZE >= AI_X &&
        ballY + BALL_SIZE >= aiY &&
        ballY <= aiY + PADDLE_HEIGHT
    ) {
        ballVX = -ballVX;
        let hitPoint = (ballY + BALL_SIZE / 2) - (aiY + PADDLE_HEIGHT / 2);
        ballVY = hitPoint * 0.2;
        ballX = AI_X - BALL_SIZE;
    }

    if (ballX < 0) {
        aiScore++;
        resetBall(1);
    } else if (ballX + BALL_SIZE > canvas.width) {
        playerScore++;
        resetBall(-1);
    }

    if (playerScore === WINNING_SCORE || aiScore === WINNING_SCORE) {
        gameRunning = false;
        let winner = playerScore === WINNING_SCORE ? "You Win!" : "AI Wins!";
        statusMessage.textContent = winner + " Click Restart to play again.";
        startBtn.style.display = 'block';
        restartBtn.style.display = 'inline-block';
        return;
    }
}

function game() {
    if (!gameRunning) return;

    moveAI();
    moveBall();

    ctx.clearRect(0, 0, canvas.width, canvas.height);

    for (let i = 0; i < canvas.height; i += 30) {
        drawRect(canvas.width / 2 - 1, i, 2, 20, "#fff");
    }

    drawRect(PLAYER_X, playerY, PADDLE_WIDTH, PADDLE_HEIGHT, "#fff");
    drawRect(AI_X, aiY, PADDLE_WIDTH, PADDLE_HEIGHT, "#fff");
    drawRect(ballX, ballY, BALL_SIZE, BALL_SIZE, "#fff");
    drawText(playerScore, canvas.width / 4, 50, "#fff");
    drawText(aiScore, 3 * canvas.width / 4, 50, "#fff");

    requestAnimationFrame(game);
}

startBtn.addEventListener('click', startGame);
restartBtn.addEventListener('click', () => {
    resetGameState();
    statusMessage.textContent = '';
    if (!gameRunning) {
        gameRunning = true;
        requestAnimationFrame(game);
    }
});
*/

// game.js (clean fix for difficulty selector) [Fixed by ChatGPT]

const canvas = document.getElementById('pong');
const ctx = canvas.getContext('2d');

let PADDLE_WIDTH = 10;
let PADDLE_HEIGHT = 100;
let BALL_SIZE = 12;
let PLAYER_X = 20;
let AI_X;
let PADDLE_SPEED = 6;
let BALL_SPEED = 5;
let gameRunning = false;

const startBtn = document.getElementById('startBtn');
const restartBtn = document.getElementById('restartBtn');
const difficultySelect = document.getElementById('difficulty');
const statusMessage = document.getElementById('statusMessage');

let playerY, aiY, ballX, ballY, ballVX, ballVY, playerScore, aiScore;

const WINNING_SCORE = 5;

function setDifficulty(level) {
    if (level === 'easy') {
        PADDLE_SPEED = 4;
        BALL_SPEED = 4;
        PADDLE_HEIGHT = 120;
    } else if (level === 'medium') {
        PADDLE_SPEED = 6;
        BALL_SPEED = 6;
        PADDLE_HEIGHT = 100;
    } else if (level === 'hard') {
        PADDLE_SPEED = 8;
        BALL_SPEED = 8;
        PADDLE_HEIGHT = 80;
    }
    AI_X = canvas.width - 20 - PADDLE_WIDTH; // Recalculate AI position
}

function startGame() {
    setDifficulty(difficultySelect.value);
    canvas.style.display = 'block';
    startBtn.style.display = 'none';
    restartBtn.style.display = 'inline-block';
    statusMessage.textContent = '';
    resetGameState();
    if (!gameRunning) {
        gameRunning = true;
        requestAnimationFrame(game);
    }
}

function resetGameState() {
    playerScore = 0;
    aiScore = 0;
    playerY = (canvas.height - PADDLE_HEIGHT) / 2;
    aiY = (canvas.height - PADDLE_HEIGHT) / 2;
    resetBall(Math.random() > 0.5 ? 1 : -1);
}

function resetBall(direction) {
    ballX = canvas.width / 2 - BALL_SIZE / 2;
    ballY = canvas.height / 2 - BALL_SIZE / 2;
    ballVX = BALL_SPEED * direction; // Apply current BALL_SPEED
    ballVY = BALL_SPEED * (Math.random() * 2 - 1);
}

function drawRect(x, y, w, h, color) {
    ctx.fillStyle = color;
    ctx.fillRect(x, y, w, h);
}

function drawText(text, x, y, color) {
    ctx.fillStyle = color;
    ctx.font = "40px Arial";
    ctx.textAlign = "center";
    ctx.fillText(text, x, y);
}

canvas.addEventListener('mousemove', function(evt) {
    const rect = canvas.getBoundingClientRect();
    const mouseY = evt.clientY - rect.top;
    playerY = Math.max(0, Math.min(canvas.height - PADDLE_HEIGHT, mouseY - PADDLE_HEIGHT / 2));
});

function moveAI() {
    const aiCenter = aiY + PADDLE_HEIGHT / 2;
    if (aiCenter < ballY) {
        aiY += PADDLE_SPEED;
    } else if (aiCenter > ballY + BALL_SIZE) {
        aiY -= PADDLE_SPEED;
    }
    aiY = Math.max(0, Math.min(canvas.height - PADDLE_HEIGHT, aiY));
}

function moveBall() {
    ballX += ballVX;
    ballY += ballVY;

    if (ballY <= 0 || ballY + BALL_SIZE >= canvas.height) {
        ballVY = -ballVY;
    }

    if (
        ballX <= PLAYER_X + PADDLE_WIDTH &&
        ballY + BALL_SIZE >= playerY &&
        ballY <= playerY + PADDLE_HEIGHT
    ) {
        ballVX = -ballVX;
        let hitPoint = (ballY + BALL_SIZE / 2) - (playerY + PADDLE_HEIGHT / 2);
        ballVY = hitPoint * 0.2;
        ballX = PLAYER_X + PADDLE_WIDTH;
    }

    if (
        ballX + BALL_SIZE >= AI_X &&
        ballY + BALL_SIZE >= aiY &&
        ballY <= aiY + PADDLE_HEIGHT
    ) {
        ballVX = -ballVX;
        let hitPoint = (ballY + BALL_SIZE / 2) - (aiY + PADDLE_HEIGHT / 2);
        ballVY = hitPoint * 0.2;
        ballX = AI_X - BALL_SIZE;
    }

    if (ballX < 0) {
        aiScore++;
        resetBall(1);
    } else if (ballX + BALL_SIZE > canvas.width) {
        playerScore++;
        resetBall(-1);
    }

    if (playerScore === WINNING_SCORE || aiScore === WINNING_SCORE) {
        gameRunning = false;
        let winner = playerScore === WINNING_SCORE ? "You Win!" : "AI Wins!";
        statusMessage.textContent = winner + " Click Restart to play again.";
        startBtn.style.display = 'block';
        restartBtn.style.display = 'inline-block';
        return;
    }
}

function game() {
    if (!gameRunning) return;

    moveAI();
    moveBall();

    ctx.clearRect(0, 0, canvas.width, canvas.height);

    for (let i = 0; i < canvas.height; i += 30) {
        drawRect(canvas.width / 2 - 1, i, 2, 20, "#fff");
    }

    drawRect(PLAYER_X, playerY, PADDLE_WIDTH, PADDLE_HEIGHT, "#fff");
    drawRect(AI_X, aiY, PADDLE_WIDTH, PADDLE_HEIGHT, "#fff");
    drawRect(ballX, ballY, BALL_SIZE, BALL_SIZE, "#fff");
    drawText(playerScore, canvas.width / 4, 50, "#fff");
    drawText(aiScore, 3 * canvas.width / 4, 50, "#fff");

    requestAnimationFrame(game);
}

startBtn.addEventListener('click', startGame);
restartBtn.addEventListener('click', () => {
    setDifficulty(difficultySelect.value);
    resetGameState();
    statusMessage.textContent = '';
    if (!gameRunning) {
        gameRunning = true;
        requestAnimationFrame(game);
    }
});

