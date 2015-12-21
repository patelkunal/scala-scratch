package pack.calc

import org.junit.{After, Before, Test}

import scala.collection.immutable.Range

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
	def testSumIntListBad_withoutStackoverFlow(): Unit = {
		val sum = calc.sumIntListBad(Range.inclusive(1, 5).toList)
		assert(15 == sum)
	}

	@Test(expected = classOf[StackOverflowError])
	def testSumIntListBad_withStackoverFlow(): Unit = {
		assert(50005000 == calc.sumIntListBad(Range.inclusive(1, 10000).toList))
	}

	@Test
	def testSumIntListGood_upto10MList(): Unit = {
		assert(50005000 == calc.sumIntListGood(Range.inclusive(1, 10000).toList))
		assert(5000050000L == calc.sumIntListGood(Range.inclusive(1, 100000).toList))
		assert(500000500000L == calc.sumIntListGood(Range.inclusive(1, 1000000).toList))
		assert(50000005000000L == calc.sumIntListGood(Range.inclusive(1, 10000000).toList))
	}

	@Test(timeout = 1000000)
	def testSumIntListGood_upto1BList(): Unit = {
		assert(5000000050000000L == calc.sumIntListGood(Range.inclusive(1, 100000000).toList))
		assert(500000000500000000L == calc.sumIntListGood(Range.inclusive(1, 1000000000).toList))
	}

}
