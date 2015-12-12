def operate(operation: (Int, Int) => Int, a: Int, b: Int): Int = {
	operation(a, b)
}

def sumOp(a: Int, b: Int): Int = a + b
sumOp(1, 4)

def subOp(a: Int, b: Int): Int = a - b
subOp(3, 9)

def mulOp(a: Int, b: Int): Int = a * b
mulOp(3, 4)

def divOp(a: Int, b: Int): Float = {
	require(b != 0, "b cannot be zero !!")
	a / b.toFloat
}
divOp(9, 2)

println("function passed to function to be operated on functions !!")
operate(sumOp, 2, 5)
operate(subOp, 3, 5)
operate(mulOp, 4, 5)
