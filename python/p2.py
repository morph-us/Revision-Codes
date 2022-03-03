
pi = 'global pi variable'

def outer():
	pi = 'outer pi variable'
	def inner():
		nonlocal pi
		pi = 'inner pi variable'
		print(pi)
	inner()
	print(pi)

outer()

