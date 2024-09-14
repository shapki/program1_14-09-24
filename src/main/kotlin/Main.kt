fun main() {
    // Создать программу, выполняющую следующий функционал:
    // - запрашивается количество строк и столбцов для двумерного массива
    // - вводится необходимое количество трехзначных чисел (числа могут повторяться)
    // - подсчитывается количество различных цифр в полученном массиве
    // - на консоль выводится двумерный массив из введенных чисел и количество различных цифр используемых в данном массиве
    // Например, для массива
    // 100   951   101   950
    // 519   999   155   501
    // 510   911   144   554
    // выведется результат: В массиве использовано 5 различных цифр

    println("Кол-во строк:")
    val rows = readln().toInt()

    println("Кол-во столбцов:")
    val cols = readln().toInt()

    val array = Array(rows) { IntArray(cols) }

    println("Введите 3-знач числа (построчно):")
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            array[i][j] = readln().toInt()
        }
    }

    for (i in 0 until rows) {
        for (j in 0 until cols) {
            print("${array[i][j]}  ")
        }
        println()
    }

    val digits = mutableSetOf<Char>()

    for (i in 0 until rows) {
        for (j in 0 until cols) {
            val number = array[i][j].toString()
            for (char in number) {
                digits.add(char)
            }
        }
    }

    println("В массиве исп. ${digits.size} различных цифр.")

}