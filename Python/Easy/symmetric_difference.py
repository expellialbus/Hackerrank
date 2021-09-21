def difference(m, n):
    return m.difference(n).union(n.difference(m))

if __name__ == "__main__":
    _, m = input(), set(map(int, input().split()))
    _, n = input(), set(map(int, input().split()))
    
    result = sorted(list(difference(m, n)))
    
    for item in result:
        print(item)
    