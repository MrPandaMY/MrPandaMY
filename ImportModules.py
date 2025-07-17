
#Importing modules from a different file/modules.
#Multiple modules can be combined to be used at a different point in time.

# import my_module as mm #'as' is used to declare the modules (E.g:my_module) as a different name/shortcut.

# courses = ['History', 'Math', 'Physics', 'CompSci']

# index = mm.find_index(courses, 'Math')
# print(index)


#'from' a method to import the function from the module directly.

# from my_module import find_index, test
# import sys #To find the location the modules is called from.

# courses = ['History', 'Math', 'Physics', 'CompSci']

# index = find_index(courses, 'Math')
# # print(index)
# # print(test)

# print(sys.path)


#'*' to import everything (E.g: All and any variable within the module)
#Not a recommended method, due to not able to identify which variable is called upon within the function.
#Any error would cause an extra step to check.

# from my_module import *

# courses = ['History', 'Math', 'Physics', 'CompSci']

# index = find_index(courses, 'Math')
# print(index)
# print(test)

#Method to upload a module to the sys.path
#Method (1)

# import sys
# sys.path.append('Location of module in the laptop/computer')

#Method (2)
#Refer to CoreySchaferYoutube "Python playlist"


#Random module

# import random

# courses = ['History', 'Math', 'Physics', 'CompSci']

# random_courses = random.choice(courses)

# print(random_courses)

#Math module

# import math

# courses = ['History', 'Math', 'Physics', 'CompSci']

# rads = math.radians(90)

# print(rads)
# print(math.sin(rads))

#Date/Time modules

# import datetime
# import calendar

# courses = ['History', 'Math', 'Physics', 'CompSci']

# today = datetime.date.today()
# print(today)

# print(calendar.isleap(2020))

#OS module

# import os

# courses = ['History', 'Math', 'Physics', 'CompSci']

# print(os.getcwd())
# print(os.__file__)

#AntiGravity module (Joke in python comunity)

# import antigravity
