
# Comparison:
# Equal:			==
# Not Equal:		!=
# Greater Than:		>
# Less Than:		<
# Greater or Equal:	>=
# Less or Equal:	<=
# Object Identity:	is

language = 'Java'

if language == 'Python':
	print('Language is Python')

elif language == 'Java':
	print('Language is Java')

elif language == 'Javascript':
	print('Language is Javascript')

else:
	print('No Match')

# and
# or
# not

user = 'Admin'
logged_in = False

if user == 'Admin' or logged_in: #'and' or 'or' can be used to identify factors
	print('Admin Page')

else:
	print('Bad Creds')

user = 'Admin'
logged_in = False

if not logged_in:
	print('Please Log In')

else:
	print('Bad Creds')

a = [1, 2, 3]
b = [1, 2, 3]

print(id(a))
print(id(b))
print(a is b) #Difference between == and 'is' ; Same element but different declaration location/factor.

# False Values:
# 	False
# 	None
# 	Zero of any numeric type
# 	Any empty sequence. For example, '', (), [].
# 	Any empty mapping. For example, {}

condition = 'Test'

if condition:
	print('Evaluated to True')

else:
	print('Evaluated to False')