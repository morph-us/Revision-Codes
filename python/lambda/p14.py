from functools import reduce

li = [1,2,3,4,5]

sum_ = reduce((lambda x,y:x+y),li)
print(sum_)
