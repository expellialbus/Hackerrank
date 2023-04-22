def remove_duplicates(arr):
    # your code goes here
    
    i = 0
    
    while i < len(arr) - 1:
        j = i + 1
        while j < len(arr):
            if arr[i] == arr[j]:
                arr.pop(j)
            else:
                j += 1
        
        i += 1
    
    return arr

def merge_the_tools(string, k):
    characters = [letter for letter in string]
    
    i, j = 0, k
    while i < len(string):
        result = remove_duplicates(characters[i: j])
        
        for character in result:
            print(character, end="")
        
        print()
        
        i, j = j, (j + k)

if __name__ == '__main__':
    string, k = input(), int(input())
    merge_the_tools(string, k)
