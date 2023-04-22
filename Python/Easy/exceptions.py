# Enter your code here. Read input from STDIN. Print output to STDOUT

def division(a, b):
    try:
        print(int(a) // int(b))
        
    except ZeroDivisionError as e:
        print("Error Code: integer division or modulo by zero")
        
    except ValueError as e:
        print("Error Code:", e)
        
if __name__ == "__main__":
    for t in range(int(input())):
        division(*input().split())
