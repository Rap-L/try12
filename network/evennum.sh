#!/bin/bash

echo "Even numbers b/w 1 and 20:"

# Loop through numbers from 1 to 20
for ((i=1; i<=20; i++))
do
    # Check if the current number is even
    # An even number has a remainder of 0 when divided by 2
    if ((i % 2 == 0)); then
        echo "$i" # Print the even number
    fi
done





# --- SCRIPT EXECUTION EXAMPLE ---
#
# To run this script (assuming it's saved as 'even_numbers.sh' and made executable):
#
# $ chmod +x even_numbers.sh
# $ ./even_numbers.sh
#
# Expected Output:
# Even numbers b/w 1 and 20:
# 2
# 4
# 6
# 8
# 10
# 12
# 14
# 16
# 18
# 20
#
# ----------------------------------
