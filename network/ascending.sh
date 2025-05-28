#!/bin/bash
echo "Enter the numbers seperated by space"
read -a numbers
sorted=($(printf "%s\n" "${numbers[@]}" | sort -n))
echo "Numbers:"
echo "${sorted[@]}"

#output
@Rap-L ➜ /workspaces/try12 (s2) $ ./arthim.sh
Enter the numbers seperated by space
3 5 1 8 10
Numbers:
1 3 5 8 10
