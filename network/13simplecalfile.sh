#!/bin/bash

echo "Simple Calculator - Multiple Operations"
read -p "Enter the first number: " num1
read -p "Enter the second number: " num2

echo "Select operations to perform (separate choices with space):"
echo "1. Addition"
echo "2. Subtraction"
echo "3. Multiplication"
echo "4. Division"
read -p "Enter choices (e.g., 1 3 4): " -a choices

outfile="calc.txt"
> "$outfile"  # Clear file before writing

for choice in "${choices[@]}"
do
  case $choice in
    1)
      echo "Result: $num1 + $num2 = $((num1 + num2))" >> "$outfile"
      ;;
    2)
      echo "Result: $num1 - $num2 = $((num1 - num2))" >> "$outfile"
      ;;
    3)
      echo "Result: $num1 * $num2 = $((num1 * num2))" >> "$outfile"
      ;;
    4)
      if [ "$num2" -eq 0 ]; then
        echo "Error: Division by zero is not allowed." >> "$outfile"
      else
        echo "Result: $num1 / $num2 = $((num1 / num2))" >> "$outfile"
      fi
      ;;
    *)
      echo "Invalid choice: $choice" >> "$outfile"
      ;;
  esac
done
