def print_rangoli(size):
    result = ""
    for i in range(1, size * 2):
        blank = abs(size - i)
        
        result += "".join(["-" for j in range(blank * 2)])
        
        value = 0
        for k in range(size - abs(size - i)):
            value = 96 + size - k
            result += chr(value) + "-"
        
        for k in range((96 + size) - value):
            value += 1 
            result += chr(value) + "-"
        
        result = result[: -1]
        result += "".join(["-" for j in range(blank * 2)])
        result += "\n"
    
    result = result[: -1]
    print(result)

if __name__ == '__main__':
    n = int(input())
    print_rangoli(n)