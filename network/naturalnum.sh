#!/bin/bash
echo "Enter the number N:"
read N
sum=0
i=1

while [ $i -le $N ]
do 
    sum=$((sum+i))
    i=$((i+1))
done
echo "sum:$sum"


#output
./arthim.sh
Enter the number N:
4
sum:10
@Rap-L ➜ /workspaces/try12 (s2) $ 



















-eq: Equal to (e.g., [ $i -eq $N ] means "is i equal to N?")
-ne: Not equal to
-gt: Greater than
-ge: Greater than or equal to (e.g., [ $i -ge $N ] means "is i greater than or equal to N?")
-lt: Less than
-le: Less than or equal to (e.g., [ $i -le $N ] means "is i less than or equal to N?")
