# Enter your code here. Read input from STDIN. Print output to STDOUT

def get_inputs():
    n,m = list(map(int, input().split()))
    array = list(map(int, input().split()))
    A = set(map(int, input().split()))
    B = set(map(int, input().split()))
    
    return n, m, array, A, B

def main():
    n, m, array, A, B = get_inputs()
    
    count = 0
    for i in array:
        if i in A:
            count += 1
        elif i in B:
            count -= 1
    
    print(count)
    
if __name__ == "__main__":
    main()