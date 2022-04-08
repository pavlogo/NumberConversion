import java.math.RoundingMode
import java.util.Scanner

fun main(args: Array<String>) {
    run()
}

fun run() {
    val sc = Scanner(System.`in`)
    var from = ""
    while (from != "/exit") {
        println("Enter two numbers in format: {source base} {target base} (To quit type /exit)")
        println("( min base is 2, max base is 36 )")
        from = sc.next()
        if (from == "/exit" || from == "exit") break
        val to = sc.next()
        if (to == "/exit" || to == "exit") break
        var num = ""
        while (num != "/back") {
            println("Enter number in base $from to convert to base $to (To go back type /back)")
            num = sc.next()
            if (num == "/back" || num == "back") break
            print("Conversion result: ")
            println(fromDec(toDec(num, from), to))
            println()
        }
    }
}

fun fromDec(n: String, b: String): String {
    val check = n
    val base = b.toBigInteger()
    var stro = (1).toBigDecimal()
    var decResult = ""
    var result = ""
    var num = check.substringBefore(".").toBigInteger()
    var dec = check.toBigDecimal() - num.toBigDecimal()
    if (num < base) {
        result = num.toString()
    } else {
        var a = ""
        var o = ""
        while (base <= num) {
            o = (num % base).toString()
            when (o) {
                "10" -> o = "A"
                "11" -> o = "B"
                "12" -> o = "C"
                "13" -> o = "D"
                "14" -> o = "E"
                "15" -> o = "F"
                "16" -> o = "G"
                "17" -> o = "H"
                "18" -> o = "I"
                "19" -> o = "J"
                "20" -> o = "K"
                "21" -> o = "L"
                "22" -> o = "M"
                "23" -> o = "N"
                "24" -> o = "O"
                "25" -> o = "P"
                "26" -> o = "Q"
                "27" -> o = "R"
                "28" -> o = "S"
                "29" -> o = "T"
                "30" -> o = "U"
                "31" -> o = "V"
                "32" -> o = "W"
                "33" -> o = "X"
                "34" -> o = "Y"
                "35" -> o = "Z"
            }
            result += o
            num /= base
            a = num.toString()
            when (a) {
                "10" -> a = "A"
                "11" -> a = "B"
                "12" -> a = "C"
                "13" -> a = "D"
                "14" -> a = "E"
                "15" -> a = "F"
                "16" -> a = "G"
                "17" -> a = "H"
                "18" -> a = "I"
                "19" -> a = "J"
                "20" -> a = "K"
                "21" -> a = "L"
                "22" -> a = "M"
                "23" -> a = "N"
                "24" -> a = "O"
                "25" -> a = "P"
                "26" -> a = "Q"
                "27" -> a = "R"
                "28" -> a = "S"
                "29" -> a = "T"
                "30" -> a = "U"
                "31" -> a = "V"
                "32" -> a = "W"
                "33" -> a = "X"
                "34" -> a = "Y"
                "35" -> a = "Z"
            }
        }
        result = (result + a).reversed()
    }
    var j = 5
    while (j > 0) {
        stro = dec * base.toBigDecimal()
        val rea = stro.toString().substringBefore(".")
        var des = rea
        when (des) {
            "10" -> des = "A"
            "11" -> des = "B"
            "12" -> des = "C"
            "13" -> des = "D"
            "14" -> des = "E"
            "15" -> des = "F"
            "16" -> des = "G"
            "17" -> des = "H"
            "18" -> des = "I"
            "19" -> des = "J"
            "20" -> des = "K"
            "21" -> des = "L"
            "22" -> des = "M"
            "23" -> des = "N"
            "24" -> des = "O"
            "25" -> des = "P"
            "26" -> des = "Q"
            "27" -> des = "R"
            "28" -> des = "S"
            "29" -> des = "T"
            "30" -> des = "U"
            "31" -> des = "V"
            "32" -> des = "W"
            "33" -> des = "X"
            "34" -> des = "Y"
            "35" -> des = "Z"
        }
        decResult += des
        dec = stro - rea.toBigDecimal()
        j--
    }
    if (!check.contains('.')) {
        return result
    } else {
        return result + "." + decResult
    }
}

fun toDec(n: String, b: String): String {
    val base = b.toBigInteger()
    var result = 0.toBigInteger()
    var decResult = 0.toBigDecimal()
    val check = n.uppercase()
    var dec = ""
    val num = check.substringBefore(".").reversed()
    if (check.contains(".")) {
        dec = check.substringAfter(".")
    }
    for (i in 0..num.lastIndex) {
        var a = num[i].toString()
        when (a) {
            "A" -> a = "10"
            "B" -> a = "11"
            "C" -> a = "12"
            "D" -> a = "13"
            "E" -> a = "14"
            "F" -> a = "15"
            "G" -> a = "16"
            "H" -> a = "17"
            "I" -> a = "18"
            "J" -> a = "19"
            "K" -> a = "20"
            "L" -> a = "21"
            "M" -> a = "22"
            "N" -> a = "23"
            "O" -> a = "24"
            "P" -> a = "25"
            "Q" -> a = "26"
            "R" -> a = "27"
            "S" -> a = "28"
            "T" -> a = "29"
            "U" -> a = "30"
            "V" -> a = "31"
            "W" -> a = "32"
            "X" -> a = "33"
            "Y" -> a = "34"
            "Z" -> a = "35"
        }
        result += base.pow(i) * a.toBigInteger()
    }
    for (i in dec.lastIndex downTo 0) {
        var a = dec[i].toString()
        when (a) {
            "A" -> a = "10"
            "B" -> a = "11"
            "C" -> a = "12"
            "D" -> a = "13"
            "E" -> a = "14"
            "F" -> a = "15"
            "G" -> a = "16"
            "H" -> a = "17"
            "I" -> a = "18"
            "J" -> a = "19"
            "K" -> a = "20"
            "L" -> a = "21"
            "M" -> a = "22"
            "N" -> a = "23"
            "O" -> a = "24"
            "P" -> a = "25"
            "Q" -> a = "26"
            "R" -> a = "27"
            "S" -> a = "28"
            "T" -> a = "29"
            "U" -> a = "30"
            "V" -> a = "31"
            "W" -> a = "32"
            "X" -> a = "33"
            "Y" -> a = "34"
            "Z" -> a = "35"
        }
        decResult = (decResult + a.toBigDecimal().setScale(5, RoundingMode.HALF_UP)) / base.toBigDecimal()
    }
    return result.toString() + decResult.toString().substring(1)
}

