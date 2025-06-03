#!/bin/bash
echo "enter filename:"
read filename
if [ -e "$filename" ];then
    lines=$(wc -l < "$filename")
    words=$(wc -w < "$filename")
    charater=$(wc -m < "$filename")
    echo "file:$filename"
    echo "words:'$words' lines:'$lines' character:'$charater'"
else
    echo "file not exist"
fi

#output
@Rap-L ➜ /workspaces/try12 (s2) $ ./arthim.sh
enter filename:
example.txt
file:example.txt
words:'1' lines:'0' character:'40'
@Rap-L ➜ /workspaces/try12 (s2) $ 
