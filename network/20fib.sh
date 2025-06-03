#!/bin/bash
# Initialize first two Fibonacci numbers
echo "enter no"
read n
a=0

b=1
echo "series are:"

# Iterate from 2 to n

for (( i=0; i<=n; i++ ))

do
echo "$a"
fib=$((a + b))

a=$b

b=$fib

done

# /workspaces/try12 (s2) $ ./arthim.sh
#enter no
#5
#series are:
#0
#1
#1
#2
#3
#5
