def runner_up(arr):
    max_value = max(arr)
    
    while max_value in arr:
        arr.remove(max_value)
        
    else:
        return max(arr)
        

if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    arr = list(arr)
    
    print(runner_up(arr))