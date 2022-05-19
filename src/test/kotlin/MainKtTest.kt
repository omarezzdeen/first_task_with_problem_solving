import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun should_ReturnCharPercentage_When_ListOfChar_AllInput() {
        // given a list of chars
        val listOfChars = listOf('a', 'a', 'a')
        // when calculate the percentage of each char
        val percentageOfEachChar = listOfCharA(listOfChars)
        // then
        assertEquals(percentageOfEachChar, 100.0)
    }

    @Test
    fun should_ReturnCharPercentage_When_ListOfChar_HalfInput() {
        // given a list of chars
        val listOfChars = listOf('a', 'a', 'c')
        // when calculate the percentage of each char
        val percentageOfEachChar = listOfCharA(listOfChars)
        // then
        assertEquals(percentageOfEachChar, 66.67)
    }

    @Test
    fun should_ReturnCharPercentage_When_ListOfChar_Single_A() {
        // given a list of chars
        val listOfChars = listOf('a', 'b', 'c')
        // when calculate the percentage of each char
        val percentageOfEachChar = listOfCharA(listOfChars)
        // then
        assertEquals(percentageOfEachChar, 33.34)
    }


    @Test
    fun should_ReturnNegativeOfOneForThereNoA_When_ListOfChar_Without_A(){
        // given a list of chars
        val listOfChars = listOf('b', 'b', 'c')
        // when calculate the percentage of each char
        val percentageOfEachChar = listOfCharA(listOfChars)
        // then
        assertEquals(percentageOfEachChar, -1.0)
    }
}