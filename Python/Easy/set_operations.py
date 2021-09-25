n = int(input())
s = set(map(int, input().split()))

for i in range(int(input())):
    method, *parameter = input().split()
    func = getattr(s, method)
    
    if parameter != []:
        func(int(parameter[0]))
    else:
        func()
        
print(sum(s))