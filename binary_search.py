def BinarySearch(arr, start, length, find):
    if length >= start:
        
        mid = start+(length-start)//2

        if arr[mid] == find:
            return mid

        elif arr[mid] > find:
            return BinarySearch(arr, start, mid-1, find)

        else:
            return BinarySearch(arr, mid+1, length, find)
    
    else:
        return -1


array = [24,1,5,48,59,65,28,96,94,920]
array.sort()
print(array)
find = 59

#BinarySearch(arr,starting_index,length,finding_elemant)
result = BinarySearch(array,0,len(array)-1,find)

if result == -1:
    print("Not Found")
else:
    print(f"{array[result]} number is at index {result}")