
pi = 'global pi variable'

def outer():
	#pi = 'outer pi variable'
	def inner():
		global pi
		pi = 'inner pi variable'
		print(pi)
	inner()
	print(pi)

outer()

