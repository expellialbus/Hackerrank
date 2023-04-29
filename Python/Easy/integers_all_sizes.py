# Enter your code here. Read input from STDIN. Print output to STDOUT

if __name__ == "__main__":
    values = [int(input()) for _ in range(4)]

    print(pow(values[0], values[1]) + pow(values[2], values[3]))
