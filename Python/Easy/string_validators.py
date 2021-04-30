if __name__ == '__main__':
    s = input()
    methods = ["isalnum", "isalpha", "isdigit", "islower", "isupper"]
    
    for method in methods:
        flag = True
        for letter in s:
            if getattr(letter, method)():
                print(True)
                
                flag = False
                break
        
        if flag:
            print(False)
