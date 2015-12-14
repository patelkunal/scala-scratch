package pack.calc

import org.junit.{After, Before, Test}

import scala.collection.immutable.Range.inclusive

/**
  * Created by kunal_patel on 12/12/15.
  */
class CalculatorTest {

	private val calc = Calculator

	@Before
	def setup(): Unit = {
		assert(calc.ne(Nil), "Calculator instance cannot be null !!")
	}

	@After
	def destroy(): Unit = {

	}

	@Test
	def testGetRangeList(): Unit = {
		val list = calc.getRangeList(1, 5)
		assert(list == inclusive(1, 5).toList, "Lists should be equal !!")
	}

	@Test
	def testSumIntListBad_withoutStackoverFlow(): Unit = {
		val sum = calc.sumIntListBad(inclusive(1, 5).toList)
		assert(15 == sum)
	}

	@Test(expected = classOf[StackOverflowError])
	def testSumIntListBad_withStackoverFlow(): Unit = {
		assert(50005000 == calc.sumIntListBad(inclusive(1, 10000).toList))
	}

	@Test
	def testSumIntListGood(): Unit = {
		assert(50005000 == calc.sumIntListGood(inclusive(1, 10000).toList))
		assert(5000050000L == calc.sumIntListGood(inclusive(1, 100000).toList))
		assert(500000500000L == calc.sumIntListGood(inclusive(1, 1000000).toList))
		assert(50000005000000L == calc.sumIntListGood(inclusive(1, 10000000).toList))
		assert(5000000050000000L == calc.sumIntListGood(inclusive(1, 100000000).toList))
		assert(500000000500000000L == calc.sumIntListGood(inclusive(1, 1000000000).toList))
	}

}
