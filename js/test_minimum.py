from min_numbers import minimum


def test_minimum():
	assert minimum([1, 2, 3]) == 1
	assert minimum([3, 2, 1]) == 1
	assert minimum([1, 3, 2]) == 1
	assert minimum([0, -1, -2]) == -2
	assert minimum([-1, -1, -1]) == -1
	assert minimum([]) == None
	assert minimum([5, 5, 5, 2, 5, 5, 5]) == 2



