import os

os.chdir('C:/Users/admin/Desktop/Wallpaper')

# print(os.getcwd()) #Print out the location of current working directory(cwd)

for f in os.listdir():
	# print(f) #To print out all the file in the directory
	# print(os.path.splitext(f))
	
	file_name, file_ext = os.path.splitext(f)
	# print(file_name.split(','))

	f_title, f_course, f_num = file_name.split(',')

	f_title = f_title.strip()
	f_course = f_course.strip()
	f_num = f_num.strip() [1:].zfill(2)

	# print('{}_{}_{}{}'.format(f_num, f_course, f_title, file_ext)) #Print out the rearranged file name (Rename) by our specific order (etc.)
	new_name = '{}_{}_{}{}'.format(f_num, f_course, f_title, file_ext) #Apply the new (rename) into a str

	os.rename(f,new_name) #Finalize the rename (str) onto the selected directory.




