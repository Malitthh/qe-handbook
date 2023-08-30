import csv
import json
//These lines are importing the necessary Python modules: csv for working with CSV files and json for handling JSON data.

def categorize_Population_Count(word_count):
    if word_count <= 500:
        return "small"
    elif word_count <= 1000:
        return "medium"
    else:
        return "large"
//This function categorize_Population_Count takes an input Population_Count (an integer) and categorizes it as "small", "medium", or "large" based on certain criteria. If the word_count is less than or equal to 500, it's categorized as "small". If it's between 501 and 1000, it's categorized as "medium". If it's above 1000, it's categorized as "large".
def csv_to_json(csv_file, json_file):
    csv.field_size_limit(100000000)  
//This function csv_to_json takes two arguments: csv_file (the path to the input CSV file) and json_file (the path to the output JSON file). It's used to convert data from a CSV file to a JSON file. The line csv.field_size_limit(100000000) increases the field size limit for CSV parsing. This is done to handle potentially large fields in the CSV.
    data = []
    with open(csv_file, 'r', encoding='utf-8') as csvfile:
        reader = csv.reader(csvfile)
        for row in reader:
            if len(row) >= 5:  
                word_count = len(row[4].split())  
                category = categorize_word_count(word_count)
                entry = {
                    "Data": row[4],
                    "Country": row[2],
                    "Capital": row[3],
                    "Currnecy": row[1],
                    "Ethnicity": row[0],
                    "Population_Count": word_count,
                    "category": category
                }
                data.append(entry)

    
    sorted_data = sorted(data, key=lambda x: x["word_count"])

    with open(json_file, 'w') as jsonfile:
        json.dump(sorted_data, jsonfile, indent=4)

csv_to_json("C:\\Users\\malitthh\\Downloads\\data-for-test.csv", 'data-for-test.json')