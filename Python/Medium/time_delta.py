#!/bin/python3

import math
import os
import random
import re
import sys

from datetime import datetime
from datetime import timedelta

# Complete the time_delta function below.
def time_delta(t1, t2):
    def time_supress(time_str, time_zone):
        full_time = datetime.strptime(time_str, "%a %d %b %Y %H:%M:%S")
        
        if time_zone[0] == "-":
            return full_time + timedelta(hours=int(time_zone[1:3]), minutes=int(time_zone[3:]))

        else:
            return full_time - timedelta(hours=int(time_zone[1:3]), minutes=int(time_zone[3:]))
        
    t1 = time_supress(t1[:-6], t1[-5:])
    t2 = time_supress(t2[:-6], t2[-5:])
    
    return str(int(abs(t1 - t2).total_seconds()))

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        t1 = input()

        t2 = input()

        delta = time_delta(t1, t2)

        fptr.write(delta + '\n')

    fptr.close()
