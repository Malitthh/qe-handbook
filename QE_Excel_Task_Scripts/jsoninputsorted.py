import json

# Read the input JSON file
with open('formatted.json', 'r') as file:
    data = json.load(file)

# Process the data and create a new list of dictionaries
output_data = []

for item in data:
    output_item = {
        "Title": item["Title"],
        "URL": item["LinkURL"],
        "CONTENT_TYPE": item["Content Type"],
        "LANG": "en" if item["Language"] == "English" else None,
        "BODY_ID": item["BodyId"],
        "BODY": item["Body"],
        "SOURCEID": item["SourceId"],
        "BOOK_ID": "",  # Empty string
        "CONTENT": item["Content"]
    }
    output_data.append(output_item)

# Write the processed data to a new JSON file
with open('output.json', 'w') as outfile:
    json.dump(output_data, outfile, indent=2)

print("Data has been processed and saved to output.json")
