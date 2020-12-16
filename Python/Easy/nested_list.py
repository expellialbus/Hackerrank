def second_lowest(grades):
    min_value = find_min(grades)
    second_min = grades[0][1]
    count = 1
    
    while second_min == min_value:
        second_min = grades[count][1]
        count += 1
                
    names = list()
    
    for i in range(count - 1, len(grades)):
        if grades[i][1] > min_value:
            if grades[i][1] < second_min:
                second_min = grades[i][1]
                names = [grades[i][0]]
                
            elif grades[i][1] == second_min:
                names.append(grades[i][0])
    
    for name in sorted(names):
        print(name)
            
def find_min(grades):
    min_value = grades[0][1]
    
    for i in range(1, len(grades)):
        if grades[i][1] < min_value:
            min_value = grades[i][1]
            
    return min_value

if __name__ == '__main__':
    grades = list()
    
    for _ in range(int(input())):
        name = input()
        score = float(input())
        
        grades.append([name, score])
        
    second_lowest(grades)
        
