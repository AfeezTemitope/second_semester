from calculator import add, subtract, multiply, divide

def test_add_function():
    assert add(1, 2) == 3
    assert add(-1, -2) == -3

def test_subtract_function():
    assert subtract(2, 1) == 1
    assert subtract(-2, -1) == -1

def test_multiply_function():
    assert multiply(2, 3) == 6
    assert multiply(-2, -3) == 6

def test_divide_function():
    assert abs(divide(10, 3) - 3.33) < 0.01
    assert divide(-6, -3) == 2
    assert divide(1, 0) == "Error: Division by zero!"
