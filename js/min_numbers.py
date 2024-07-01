def minimum(number):
	if not number:
		return None
	minimum = number[0]
	for num in number:
		if num < minimum:
			minimum = num
	return minimum