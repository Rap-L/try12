#!/bin/bash
echo "Enter the file name"
read filename
if [ -e "$filename" ];then
    echo "files '$filename' exist"
    
else
    echo "'$filename' doesn't exist"
fi

#output
@Rap-L ➜ /workspaces/try12 (s2) $ ./arthim.sh
Enter the file name
example.txt
files 'example.txt' exist
