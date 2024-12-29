fun main() {

    /*
    Создать класс Registration с полями email и password.
    Для этого свойства email написать геттер, который возвращает значение этого поля в верхнем регистре.
    Для поля password написать сеттер, который контролирует, чтобы длина пароля была не менее 6 символов,
    иначе выводит сообщение, что не соответствует его длина.
    */
    val registration = Registration()
    registration.email = "aaaaaa"
    registration.password = "ssss"
    println(registration.toString())
    println()

    val array = arrayOf(
        arrayOf(5, 8, 15, 6),
        arrayOf(6, 4, 15, 13),
        arrayOf(55, 8, 3, 25),
        arrayOf(6, 7, 8, 9)
    )
    println(array.contentDeepToString())
    println("Четные числа двумерного массива: " + findingEvenNumbersInTwoDimensionalArray(array))
    println()

    println("Заполнение двумерного массива 4 х 4 числами от 1 до 16 включительно")
    fillingTwoDimensionalArrayWithNumbers(array)
    println(array.contentDeepToString())
    println()

    val arrayTwo = arrayOf(5, -8, -15, 6, 0)
    println(arrayTwo.contentDeepToString())
    println("Вывод в консоль положительных элементов массива: ")
    outputtingPositiveArrayElementsToConsole(arrayTwo)

}

/*
Написать функцию поиска четных чисел двумерного массива размерностью 4 х 4.
*/
fun findingEvenNumbersInTwoDimensionalArray(array: Array<Array<Int>>): List<Int> {
    val list: ArrayList<Int> = ArrayList()
    for (a in array.indices) {
        for (b in array[a].indices) if (array[a][b] % 2 == 0) list.add(array[a][b])
    }
    return list
}

/*
Написать функцию заполнения двумерного массива 4 х 4 числами от 1 до 16 включительно.
*/
fun fillingTwoDimensionalArrayWithNumbers(array: Array<Array<Int>>) {
    var count = 1
    for (a in array.indices) for (b in array[a].indices) array[a][b] = count++
}

/*
Написать функцию вывода в консоль положительных элементов массива.
Проверка на положительность числа выполняется локальной функцией внутри вышеуказанной.
*/
fun outputtingPositiveArrayElementsToConsole(array: Array<Int>) {
    fun checkingIfNumberIsPositive(a: Int): Boolean = a > 0
    for (a in array) if (checkingIfNumberIsPositive(a)) println(a)
}

/*
Примечания:
Для вывода значений на экран используйте функцию println().
*/