def print_formatted(number):
    length = str(len(bin(number)[2:]) + 1)
    
    result = "{:" + str(int(length) - 1) + "d}{:" + length + "o}{:" + length + "X}{:" + length + "b}"

    for i in range(1, number + 1):
        print(result.format(i, i, i, i))
        
if __name__ == '__main__':
    n = int(input())
    print_formatted(n)