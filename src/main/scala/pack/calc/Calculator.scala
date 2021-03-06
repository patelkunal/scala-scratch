package pack.calc

/**
  * Created by kunal_patel on 09/12/15.
  */
object Calculator {

	def sumIntListBad(intList: List[Int]): Int = {
		if (intList == Nil) return 0
		else return intList.head + sumIntListBad(intList.tail)
	}

	def sumIntListGood(intList: List[Int]): BigInt = {

		def sumIntListHelper(ints: List[Int], currSum: BigInt): BigInt = {
			if (ints == Nil) currSum
			else sumIntListHelper(ints.tail, currSum.+(ints.head))
		}
		return sumIntListHelper(intList, BigInt(0))
	}

}
