# Enter your code here. Read input from STDIN. Print output to STDOUT

if __name__ == "__main__":
    stamps = set()
    for stamp in range(int(input())):
        stamps.add(input())
        
    print(len(stamps))