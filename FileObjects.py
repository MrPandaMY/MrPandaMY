#File Objects
#Opening the file through this method (1)

# f = open('test', 'r') #Second argument depending on the letter. "a:Appending, r:Read, r+:Read and Write, w:Write"

# print(f.mode) #'f.mode' = the mode of opening of file. 'f.name' is name of file.

# f.close()

#Opening the file using a context manager 'with'

# with open('test', 'r') as f:
# 	f_contents = f.read()
# 	'''Read all contents in the file as written'''
# 	print(f_contents)

# with open('test', 'r') as f:
# 	f_contents = f.readlines()
# 	'''Read all contents in the file in 1 long sentence'''

# 	print(f_contents)

# with open('test', 'r') as f:
# 	f_contents = f.readline()
# 	'''Read the first line contents in the file'''

# 	print(f_contents, end ='') #'end =''' is used to remove spacing between printed variable.

# 	f_contents = f.readline()
# 	'''Read the second line contents in the file'''

# 	print(f_contents, end ='')

# with open('test', 'r') as f:
	
# 	for line in f:
# 		'''Print all contents in the file, more efficient method (No memory issue**)'''
		
# 		print(line, end ='')


# with open('test', 'r') as f:
	
# 	f_contents = f.read(100)
# 	'''Print out the first 100 characters within the file.'''
# 	print(f_contents)

# 	f_contents = f.read(100)
# 	'''Print out the second 100 characters within the file.'''
# 	print(f_contents)

# 	f_contents = f.read(100)
# 	'''Print out the third 100 characters within the file.'''
# 	print(f_contents) #But no changes due to no additional characters within the file.

# with open('test', 'r') as f:
	
# 	size_to_read = 10

# 	f_contents = f.read(size_to_read)
# 	print(f_contents, end = '')

# 	f.seek(0) #Reset the position back to the beginning of the file (Or any position in the file)

# 	f_contents = f.read(size_to_read)
# 	print(f_contents)

	# print(f.tell())

	# while len(f_contents) > 0:
	# 	print(f_contents, end = '*')
	# 	f_contents = f.read(size_to_read)

# To create a new text file !!

# with open('test2', 'w') as f: 
# 	f.write('Test')
# 	f.seek(0)
# 	f.write('R')

# To create a copy of a picture file !!!

# with open('Wallpaper_R25.jpg', 'rb') as rf:
# 	with open('Wallpaper_R25_copy.jpg', 'wb') as wf:
# 		for line in rf:
# 			wf.write(line)


# To provide more control over exactly what you are reading and writing.
# Maybe need to study more about this part ?!

# with open('Wallpaper_R25.jpg', 'rb') as rf:
# 	with open('Wallpaper_R25_copy.jpg', 'wb') as wf:
# 		chunk_size = 4096
# 		rf_chunk = rf.read(chunk_size)
# 		while len(rf_chunk) > 0:
# 			wf.write(rf_chunk)
# 			rf_chunk = rf.read(chunk_size)

