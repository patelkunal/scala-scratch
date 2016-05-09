import scala.collection.immutable.HashMap

val m = new HashMap[Int, String];

def foo(n: Int,name: String) = {
	require(n != 0, "n cannot be zero !!")
	println(name)
}

//foo(0, "kp")

foo(1, "kp")


val list = Range.apply(1, 5).toList
list(0)

val foo: (String, Int) => String = (acc: String, x: Int) => acc.concat((x * x).toString + ",")
list.foldLeft("")(foo)

val indexedList: List[(Int, Int)] = list.zipWithIndex;

indexedList.toSeq
