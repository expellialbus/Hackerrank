# Enter your code here. Read input from STDIN. Print output to STDOUT

def find_room(K, room_list):
    counter = dict()
    
    for room_number in room_list:
        counter[room_number] = counter.get(room_number, 0) + 1
        
    for room_number, member in counter.items():
        if member == 1:
            return room_number


if __name__ == "__main__":
    K = int(input())
    room_list = list(map(int, input().split()))
    
    print(find_room(K, room_list))
