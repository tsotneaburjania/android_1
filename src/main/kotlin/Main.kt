fun main(args: Array<String>) {
//    TASK_1
    val task1 = evenIndexAVG(arrayOf(1, 2, 3, 4, 5, 6))
    println("AVG: $task1")

//    TASK_2
    println(palindromeDetector("Evangelion"))
    println(palindromeDetector("racecar"))
}

private fun evenIndexAVG(arr: Array<Int>) : Int {
    val avg: Int
    var sum = 0
    var count = 0
    for (item in arr.indices) {
        if (item % 2 == 0) {
            count++
            sum += arr[item]
        }
    }
    avg = sum / count
    return avg
}

private fun palindromeDetector(str: String) : Boolean {
//    შეიძლება პირდაპირ ასე
//    return str == str.reversed()

//    ან ასე
    val charArray = str.toCharArray()
    var reversed = "";
    for (n in charArray.size - 1 downTo 0) {
        reversed += charArray[n];
    }
    return str == reversed
}