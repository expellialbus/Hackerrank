# Enter your code here. Read input from STDIN. Print output to STDOUT

import itertools

if __name__ == "__main__":
    A = list(map(int, str(input()).split()))
    B = list(map(int, str(input()).split()))
    
    for a_tuple in itertools.product(A, B):
        print(a_tuple, end=" ")
