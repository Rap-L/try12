#!/bin/bash
echo "enter filename:"
read filename
echo "Type content of file"
cat > "$filename"
lines=$(wc -l < "$filename")
words=$(wc -w < "$filename")
charater=$(wc -m < "$filename")
spcount=$(grep -o '[^a-zA-Z0-9[:space:]]' "$filename" | wc -l)
echo "file:$filename"
echo "words:'$words' lines:'$lines' character:'$charater' special character:'$spcount'"


