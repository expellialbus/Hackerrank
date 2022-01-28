# Enter your code here. Read input from STDIN. Print output to STDOUT

import collections

def main():
    N = int(input())
    
    deque = collections.deque()
    for line in range(N):
        method, *parameter = input().split()
        function = getattr(deque, method)
        
        if parameter != list():
            function(parameter[0])
        else:
            function()
            
    print(' '.join(deque))
    
if __name__ == "__main__":
    main()