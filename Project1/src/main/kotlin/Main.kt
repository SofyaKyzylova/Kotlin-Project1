fun main() {
    //ЗАДАНИЕ 1
    println("Здравствуйте!")
    var name = "Кызылова Софья Андреевна"
    var spec = "Информатика и вычислительная техника"
    println("Меня зовут $name, я учусь на 3 курсе в Тюменском индустриальном университете на специальности $spec \n")

    
    //ЗАДАНИЕ 2
    var a : Int = 100
    println("Переменная $a имеет тип ${a::class.java.typeName}")

    var pi : Double = 3.14
    println("Переменная $pi имеет тип ${pi::class.java.typeName}")

    var flag : Boolean = true
    println("Переменная $flag имеет  ${flag::class.java.typeName}")

    var myChar : Char = 'a'
    println("Переменная $myChar имеет тип ${myChar::class.java.typeName}")

    val str : String = "abcdefg"
    println("Переменная $str имеет тип ${str::class.java.typeName}")

    var bt : Byte = 64
    println("Переменная $bt имеет тип ${bt::class.java.typeName}")

    var arr = IntArray(5) { it + 1 }
    println("Массив переменных типа Int:")
    arr.forEach { println(it) }
    println("\n")

    
    //ЗАДАНИЕ 3
    println("Введите строку: ")
    val myString = readlnOrNull()
    println("Введенная строка: $myString \n")

    if(myString!!.isEmpty())
        println("Строка пустая! \n")
    else
    {
        println("Строка не пустая! \n")

        println("${myString!!.uppercase()}")
        println("${myString!!.lowercase()} \n")

        println("Длина строки =  ${myString!!.length} \n")
        //println("Третий символ строки = ${myString!!.get(2)} \n")

        var startsWith : Boolean = myString.startsWith("A")
        if(startsWith) println("Введенная строка начинается с символа А")
        else println("Введенная строка НЕ начинается с символа А")

        var endsWith : Boolean = myString.endsWith("!")
        if(endsWith) println("Введенная строка заканчивается символом ! \n")
        else println("Введенная строка НЕ заканчивается символом ! \n")

        var containsHi = myString.contains("hi")
        if(containsHi)
            println("myString содержит подстроку hi \n")
        else println("myString НЕ содержит подстроку hi \n")

        val addString = "... The end";
        val sb = StringBuilder()
        sb.append(myString).append(addString)
        val newString = sb.toString()
        println("Новая строка: $newString \n")

        val nString : String = myString!!.replace('i', 'a');
        print(nString)
    }
}
