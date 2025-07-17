import csv

# with open('names.csv', 'r') as csv_file:
# 	csv_reader = csv.reader(csv_file)

	# next(csv_reader) #To skip the first iteration within the csv file.
	# print(csv_reader) #Print out the file as memory.

	# with open('new_names.csv', 'w') as new_file:
	# 	# csv_writer = csv.writer(new_file, delimiter='-') 
	# 	csv_writer = csv.writer(new_file, delimiter='\t') #"\t" = Tab.
	# 	#Delimiter is used to determine the separation between the values within the file. 

	# 	for line in csv_reader:
	# 		csv_writer.writerow(line)


# with open('new_names.csv', 'r') as csv_file:
# 	csv_reader = csv.reader(csv_file, delimiter='\t') #Have to input delimiter to ensure the file is read without the current delimiter.

# 	for line in csv_reader:
# 		print(line)


#Dictionary reader.
# with open('names.csv', 'r') as csv_file:
# 	csv_reader = csv.DictReader(csv_file)

	# for line in csv_reader:
	# 	print(line['email'])


#Dictionary writer.
with open('names.csv', 'r') as csv_file:
	csv_reader = csv.DictReader(csv_file)

	with open('new_names.csv', 'w') as new_file:
		fieldnames = ['first_name', 'last_name', 'email']
 		# fieldnames = ['first_name', 'last_name'] # If we would like to create only 2 parameters.

		csv_writer = csv.DictWriter(new_file, fieldnames=fieldnames, delimiter='\t')

		csv_writer.writeheader() 

		for line in csv_reader:
			# del line['email'] #Delete the email line within the csv file.
			csv_writer.writerow(line)










#Differences between the standard reader and writer and the dictionary reader and writer is;
#Standard reader and writer is more towards editing the original file to fit into new file.
#Dictionary reader and writer is creating a new set of file based on a fomulated field/header into new file.