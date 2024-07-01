from max_numbers import maximum


def test_maximum():
	assert maximum([1, 2, 2, 2, 3]) == 3
	assert maximum([2,3,5,1,2]) == 5
	assert maximum([1, 3, 2]) == 3
	assert maximum([0, -1, -2]) == 0
	assert maximum([-1, -1, -1]) == -1
	assert maximum([]) == None
	assert maximum([5, 5, 5, 2, 5, 5, 5]) == 5



