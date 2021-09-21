#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the solve function below.
def solve(s):
    words = "".join([word.capitalize() for word in s.split()])
    result = ""
    
    i = 0
    for c in s:
        if c == " ":
            result += " "
            
        else:
            result += words[i]
            i += 1
    
    return result

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = solve(s)

    fptr.write(result + '\n')

    fptr.close()
