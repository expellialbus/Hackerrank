# Enter your code here. Read input from STDIN. Print output to STDOUT

import itertools

def main():
    S, k = input().split()
    S = sorted(S)
    k = int(k)
    
    for permutation in itertools.permutations(S, k):
        print(''.join(permutation))
    
if __name__ == "__main__":
    main()
