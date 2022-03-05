adj = ["red", "big","apple","tasty"]
fruits = ["apple", "banana", "cherry"]

for x in adj:
  for y in fruits:
    if x!=y:
      print(y, x)
    else:
      print("same")
      break;    
else:
	print("loop ends without break")

