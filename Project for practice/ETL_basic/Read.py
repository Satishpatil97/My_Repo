import csv
import os
print(os.getcwd()) # get current working directory

# Step 1: Extract (Read CSV)
try:
    with open(r'E:\Satish\Study material\Python\Project for practice\CSV\Sample.csv','r') as file:
        reader= csv.reader(file)
        data=list(reader)
    print(data)
except FileNotFoundError:
    print("file not found")

# Step 2: Transform (Clean Data)

cleaned_data=[] # create empty list to store cleaned data

header=data[0] # get header row
cleaned_data.append(header) # add header to cleaned data

for row in data[1:]: # Give me all elements starting from index 1 till the end
    if "" in row: # check if any value in the row is empty
       #row[1] = ['Rahul', '', 'Mumbai', '60000']
       # "Rahul" ≠ ""
       # "" = "" (empty value found)
       # Since there is an empty value in the row, we will skip it and not add it to the cleaned data
        continue # skip rows with empty values
    else:
         #row[0] = ['Satish', '25', 'Pune', '50000']
        #  "Satish" ≠ ""
        # "25" ≠ ""
        # "Pune" ≠ ""
        # "50000" ≠ "" 
        # There are no empty values in the row, so we can add it to the cleaned data
        cleaned_data.append(row) # add cleaned row to cleaned data

print("Cleaned Data:")
print(cleaned_data)

# Step 3: Load (Save Cleaned CSV)

with open(r"E:\Satish\Study material\Python\Project for practice\CSV\Cleaned_data.csv",'w',newline='') as file:
    writer=csv.writer(file)
    writer.writerows(cleaned_data)


