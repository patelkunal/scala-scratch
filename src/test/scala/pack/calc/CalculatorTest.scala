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
		println("inside setup()")
		assert(calc.ne(Nil), "Calculator instance cannot be null !!")
	}

	@After
	def destroy(): Unit = {
		println("finished test !!")
	}

	@Test
	def testGetRangeList(): Unit = {
		val list = calc.getRangeList(1, 5)
		assert(list == inclusive(1, 5).toList, "Lists should be equal !!")
	}

	@Test
	def testSumIntListBad(): Unit = {
		val sum = calc.sumIntListBad(inclusive(1, 5).toList)
		println(sum)
	}
}
