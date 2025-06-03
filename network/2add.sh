#!/bin/bash

echo "Addition of two numbers"

read -p "Enter the first number:" num1
read -p "Enter the second number:" num2

# Perform the addition using Bash's arithmetic expansion
summ=$((num1 + num2))

echo "Sum:$summ"









# --- Example Output ---
# To run this script (assuming it's saved as 'arthim.sh' and made executable):
#
# $ ./arthim.sh
# Addition of two numbers
# Enter the first number:3
# Enter the second number:4
# Sum:7
