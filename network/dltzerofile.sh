#Prompt the name of the folder and delete all
#subfolders with file size 0

#! /bin/bash

echo -n "Enter name of the directory : "

read directory_name

if [ -d "$directory_name" ]; then

echo "Directory exist"

for i in `find $directory_name -size 0`

do

rm $i

rm -rf $i

echo "Zero-sized files are Successfully deleted"

done

else

echo "Directory does not exist"

fi

#@Rap-L ➜ /workspaces/try12 (s2) $ ./arthim.sh
#Enter name of the directory : /workspaces/try12/new
#Directory exist
