###Write shell script to display all files in the
#directory to which the user has read write and
#execute permission.

#!/bin/bash

echo "Files with read, write, and execute permissions for the user in
the current directory:"

for file in *; do

if [ -f "$file" ] && [ -r "$file" ] && [ -w "$file" ] && [ -x "$file" ]; then

echo "$file"

fi

done

# $ ./arthim.sh
#Files with read, write, and execute permissions for the user in
#the current directory:
#arthim.sh
