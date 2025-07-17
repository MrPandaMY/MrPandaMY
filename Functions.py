
# def hello_func(): #Defining a function to call back this function for multi purpose usage.
# 	print('Hello Function!')

# hello_func()
# hello_func()
# hello_func()
# hello_func()

#DRY = Dont repeat yourself
#Using function enables you to make multiple changes on multiple file by just changing the main function



# def hello_func():
# 	return 'Hello Function!' #Using 'return' it will return the value to the function called back.

# print (hello_func().upper()) #'.upper()' is used to Capitalize the string within the function.

# def hello_func(greeting, name = 'You'):
# 	return '{}, {}'.format(greeting, name) #'{}' is used to insert the string/declared value into the location. '.format' is used to pull the string value.

# print(hello_func('Hi', name = 'Corey'))

# def student_info(*args, **kwargs): #This '*args' and '**kwargs' are used to accept the unpacks values.
# 	print(args)
# 	print(kwargs)

# courses = ['Math', 'Art']
# info = {'name': 'John', 'age':22}

# student_info(*courses, **info)  #'*' Used to unpack list of set value. '**' used to unpack those keywords value.


# Number of days per month. First value placeholder for indexing purposes.
month_days = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

def is_leap(year):
	"""Return True for leap years, False for non-leap years."""

	return year % 4 == 0 and (year % 100 != 0 or year % 400 == 0)

def days_in_month(year, month):
	"""Return number of days in that month in that year."""

	if not 1 <= month <= 12:
		return 'Invalid Month'

	if month == 2 and is_leap(year):
		return 29

	return month_days[month]

print(days_in_month(2017, 2))