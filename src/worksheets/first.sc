import scala.collection.immutable.HashMap

val m = new HashMap[Int, String];

def foo(n: Int,name: String) = {
	require(n != 0, "n cannot be zero !!")
	println(name)
}

//foo(0, "kp")

foo(1, "kp")