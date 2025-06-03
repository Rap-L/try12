#!/bin/bash
read -p "Enter a string:" inpstr
len=${#inpstr}
echo "The length of the string is: $len"
rev=""
for((i=$len-1;i>=0;i--)); do
    rev="$rev${inpstr:$i:1}"
done
echo "The reverse of the string is: $rev"
if [ "$inpstr" == "$rev" ]; then
    echo "The string is a palindrome"
else
    echo "The string is not a palindrome"
fi
read -p "Enter a substring to search for: " substr
if [[ $inpstr == *$substr* ]]; then
    echo "The substring '$substr' is found in the string."
else
    echo "The substring '$substr' is not found in the string."
fi
