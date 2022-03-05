def sums(arr,i):
    i = i -1
    if(i<0):
        return 0
    else:
        return arr[i]+sums(arr,i)

arr = [1,2,3,4,5]
print(sums(arr,len(arr)))
