
# nums = [1, 2, 3, 4, 5]

# for num in nums: #'for' is used to create loop with a set of list (usually number using the conditionals)
# 	if num == 3:
# 		print('Found!')
# 		continue
# 	print (num)

# for num in nums:
# 	for letter in 'abc': #This will loop the num from 1 - 5 with each letter of str 'abc'
# 		print(num, letter)

# for i in range(10): #Loop the range starting from 0
# 	print(i)

# for i in range(1, 11): #Loop the range starting from 1 and ends at 10
# 	print(i)

x = 0

while x < 10: #Loop the function as long as the value x is below 10 (or True)
	if x == 5:
		break

	print(x)
	x += 1

while True: #Loop the function infinitely until defined a 'break' or until a specific data is obtained.
	if x == 5:
		break #In an infinite loop, click Ctrl + C to interupt// Click Ctrl + Break for windows

	print(x)
	x += 1