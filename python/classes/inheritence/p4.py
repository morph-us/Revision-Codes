class Person:
    firstname = "matt"
    lastname = "damon"
    def __init__(self, fname, lname):
        self.firstname = fname
        self.lastname = lname

    def printname(self):
        print(self.firstname, self.lastname)


class Student(Person):
    def __init__(self,fname,lname):
        print("const")



x = Person("John", "Doe")
x.printname()


y = Student("x","y")
y.printname()
