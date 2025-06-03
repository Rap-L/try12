#!/bin/bash
echo "Enter the 10 numbers:"
for ((i=0;i<10;i++))
do
    read -p "Enter number $((i+1)): " num
    numbers[i]=$num
done
echo "Original array: ${numbers[@]}"
sum=0
for num in "${numbers[@]}";

do
    sum=$((sum + num))
done
average=$(echo "scale=2; $sum/ 10" | bc)
echo "Sum: $sum"
echo "Average: $average"
min=${numbers[0]}
max=${numbers[0]}
for num in "${numbers[@]}"; do
    if (( num < $min )); then
        min=$num
    fi
    if (( num > $max )); then
        max=$num
    fi
done
echo "Minimum: $min"
echo "Maximum: $max"
