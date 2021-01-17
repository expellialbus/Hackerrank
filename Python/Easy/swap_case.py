def swap_case(s):
    new_string = str()
    
    for character in s:
        if character.lower() == character:
            new_string += character.upper()
            
        else:
            new_string += character.lower()
            
    return new_string
            
if __name__ == '__main__':
    s = input()
    result = swap_case(s)
    print(result)
