#Write a shell script that consists of a function that displays the
#number of files in the present working directory. Name this function
#“file_count” and call it in your script. If you use variable in your
#function, remember to make it a local variable.

#!/bin/bash

function count_items() {

local files=$(find . -maxdepth 1 -type f | wc -l)

local dirs=$(find . -maxdepth 1 -type d | wc -l)

echo "Files: $files"

echo "Directories: $dirs"

}

count_items



###@Rap-L ➜ /workspaces/try12 (s2) $ ./arthim.sh
#Files: 3
#Directories: 3
