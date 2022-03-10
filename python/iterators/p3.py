#this creation of our own oterator is valid in python3 but not in python2

class MySet:
    def __iter__(self):
        self.a = 1
        return self

    def __next__(self):
        x = self.a
        self.a += 1
        return x



obj = MySet()
myitr = iter(obj)
print(next(myitr))


for i in range(30):
    print(next(myitr))
    
