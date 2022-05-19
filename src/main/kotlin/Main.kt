import java.math.RoundingMode
import java.text.DecimalFormat

fun main(args: Array<String>) {

    val result = listOfCharA(list = listOf('a', 'b', 'b'))
    println(result)

}

fun listOfCharA(list: List<Char>): Double {
    val listSize = list.size
    var count: Double = 0.0
    for (i in list) {
        if (i == 'a') {
            count++
        }
    }
    val result = count / listSize * 100
    val df = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.CEILING
    return if (result == 0.0 || result.isNaN()) {
        -1.0
    } else {
        df.format(result).toDouble()
    }
}