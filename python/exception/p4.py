x = 10
try:
    print(x)
except NameError:
    print("name error")
except:
    print("some error")
else:
    print("no error")
