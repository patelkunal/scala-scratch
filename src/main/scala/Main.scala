object Main {
	
	def main(args: Array[String]) {
		// args.foreach(println)
		// val name:type = initialization
		val x = 7 // may ommit Type for var/val
		val n: Int = 7
		greet();
		println(square(n))
		println(squareWithBlock(n))
		println(squareWithBlockAndReturnType(n))
		println(squareWithBlockAndReturnTypeAndReturnStmt(n))


		val kppatel = new Student("kppatel", "05-JUNE-1989")
		println(kppatel.toString)
		
		var nirali = new Student("nkpatel", "18-SEPT-1988")
		println(nirali.toString)
		// nirali.dob = "18-sept-1988" // this should fail because Student.dob is immutable
		println(nirali.toString)
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

	class Student(val name:String, val dob:String) {
		override
		def toString() = java.lang.String.format("%s, %s", name, dob)
	}
}

