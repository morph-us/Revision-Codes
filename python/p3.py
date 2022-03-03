pi = 'global pi variable'
def outer():
	global pi
	pi = 'outer pi variable'
	print(pi)

outer()
print(pi)

