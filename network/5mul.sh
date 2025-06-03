#!/bin/bash
echo "Multiplication"
read num
for ((i=1;i<=10;i++))
do 
    result=$((i*num))
    echo "$num*$i=$result"
done

#output
./arthim.sh
Multiplication
5
5*1=5
5*2=10
5*3=15
5*4=20
5*5=25
5*6=30
5*7=35
5*8=40
5*9=45
5*10=50
@Rap-L ➜ /workspaces/try12 (s2) $ 
