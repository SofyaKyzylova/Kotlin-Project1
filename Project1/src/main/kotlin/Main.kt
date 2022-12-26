fun main() {
    //ЗАДАНИЕ 1
    println("Здравствуйте!")
    val name = "Кызылова Софья Андреевна"
    val spec = "Информатика и вычислительная техника"
    println("Меня зовут $name, я учусь в Тюменском индустриальном университете по специальности $spec \n")

    
    //ЗАДАНИЕ 2
    val a : Int = 100
    println("Переменная $a имеет тип ${a::class.java.typeName}")

    val pi : Double = 3.14
    println("Переменная $pi имеет тип ${pi::class.java.typeName}")

    val flag : Boolean = true
    println("Переменная $flag имеет  ${flag::class.java.typeName}")

    var myChar : Char = 'a'
    println("Переменная $myChar имеет тип ${myChar::class.java.typeName}")

    val str : String = "abcdefg"
    println("Переменная $str имеет тип ${str::class.java.typeName}")

    val bt : Byte = 64
    println("Переменная $bt имеет тип ${bt::class.java.typeName}")

    var arr = IntArray(5) { it + 1 }
    println("Массив переменных типа Int:")
    arr.forEach { println(it) }
    println("\n")
    
    
    //ЗАДАНИЕ 3
    val myString = readlnOrNull()
    println("Введенная строка: $myString")
    //val n : Int = myString.length()
    //println("Длина строки =  ${myString.length}")
    //println("Третий символ строки = ${myString.charAt(3)}")
    //myString.equals(str)
    //myString.equalsIgnoreCase(str)
    //val startsWith : Boolean = myString.startsWith("A")
    //val endsWith : Boolean = myString.endsWith("!")
    //val containsP = myString.contains("hi")
    //val newString : String = myString.concat(" . The end");
    //val newString : String = myString.replace('i', 'a');
}
