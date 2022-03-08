class Test:
    a = 20
    def __init__(self,b):
        print("cons")

    def mymethod(self,f):
        print(f);


obj = Test(2)
print(obj.a)
obj.mymethod("hello")
