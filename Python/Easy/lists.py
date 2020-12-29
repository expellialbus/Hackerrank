if __name__ == '__main__':
    N = int(input())
    arr = list()
    
    for i in range(N):
        input_arr = str(input()).split()
        length = len(input_arr)
        
        if length == 1:
            if input_arr[0] == "print":
                print(arr)
            
            else:
                getattr(arr, input_arr[0])()
            
        elif length == 2:
            getattr(arr, input_arr[0])(int(input_arr[1]))
            
            
        else:
            getattr(arr, input_arr[0])(int(input_arr[1]), int(input_arr[2]))
