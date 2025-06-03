#Write a shell script that asks for a word and filename in command
#line and tells how many times that word occurred in the file

#!/bin/bash

read -p "Enter the word to search: " word

read -p "Enter the filename: " file

# Check if the file exists

if [ ! -f "$file" ]; then

echo "Error: File '$file' not found."

exit 1

fi

# Count the number of occurrences (case-sensitive, exact word match)

count=$(grep -o -w "$word" "$file" | wc -l)

echo "The word '$word' occurred $count times in the file '$file'."


#@Rap-L ➜ /workspaces/try12 (s2) $ ./arthim.sh
#Enter the word to search: word
#Enter the filename: arthim.sh
#The word 'word' occurred 8 times in the file 'arthim.sh'.
