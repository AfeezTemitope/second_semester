def maximum(number):
	if not number:
		return None
	maximum = number[0]
	for num in number:
		if num > maximum:
			maximum = num
	return maximum