fun main() {
    var str = "12.3"
    var strDoub = str.toDouble()
    var strInt = strDoub.toInt()
    var strBin = Integer.toBinaryString(strInt)

    println(strDoub)
    println(strInt)
    println(strBin)
}