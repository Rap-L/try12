#Write a shell script that prompts the user for a name of a file or
#directory and reports if it is a regular file, a directory, or another type of
#file. Also perform an ls command against the file or directory with the
#long listing option.
#!/bin/bash

echo “Enter the file path”

read FILE

if [ -f “$FILE” ]; then

echo “$FILE is a reguler file”

elif [ -d “$FILE” ]; then

echo “$FILE is a directory”

else

echo “$FILE is another type of file”

fi

ls -l $FILE


##@Rap-L ➜ /workspaces/try12 (s2) $ ./arthim.sh
#“Enter the file path”
#/workspaces/try12/arthim.sh
#“/workspaces/try12/arthim.sh is another type of file”
#-rwxrwxrwx 1 codespace root 248 May 26 13:52 /workspaces/try12/arthim.sh
