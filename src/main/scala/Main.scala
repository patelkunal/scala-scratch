object Main {
	
	def main(args: Array[String]) {
		// args.foreach(println)
		val x = 7 // may ommit Type for var/val
		val n: Int = 7
		greet();
		println(square(n))
		println(squareWithBlock(n))
		println(squareWithBlockAndReturnType(n))
		println(squareWithBlockAndReturnTypeAndReturnStmt(n))
	}

	def greet(): Unit = println("hello, world !!")

	def square(a: Int) = a * a

	def squareWithBlock(a: Int) = {
		a * a
	}
	
	def squareWithBlockAndReturnType(a: Int): Int = {
		a * a
	}
	
	def squareWithBlockAndReturnTypeAndReturnStmt(a: Int): Int = {
		return a * a
	}
}

