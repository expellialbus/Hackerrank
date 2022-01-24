# Enter your code here. Read input from STDIN. Print output to STDOUT

import collections

def main():
    X = int(input())
    input_list = list(map(int, input().split(' ')))
    
    shoes = collections.Counter(input_list)
    
    N = int(input())
    
    earned_money = 0
    for customer in range(N):
        size, price = list(map(int, input().split(' ')))
        
        if shoes.get(size, 0) > 0:
            earned_money += price
            shoes[size] -= 1
            
    print(earned_money)
    
if __name__ == "__main__":
    main()