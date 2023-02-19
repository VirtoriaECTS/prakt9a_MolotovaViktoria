//main.kt
import Milk_product.Milk_product
import Exam.Exam
fun main(args: Array<String>) {
    //Вариант 5

    val product1 = Milk_product("Творог", 200.0, 2.6, "Кунгурский", 67.9)
    product1.weigt_info()
    product1.price_info()
    product1.get_info()
    println()

    val product2 = Cheese("Козье", "Твердый", "Светло желтый", "Сыр Гауда премиум", 300.0, 0.0, "Село зеленое", 250.0)
    product2.weigt_info()
    product2.price_info()
    product2.get_info()
    println()

    val product3 = Milk("Козье", "Стерилизованное", "Молоко Свежее", 500.0, 4.5, "Ирбитское", 70.99)
    product3.weigt_info()
    product3.price_info()
    product3.get_info()
    println()


    //Вариант 15
    //(var name:String, var lesson:String, var data:String, var grade:Int )\

    val student1 = Exam("Молотова Виктория Анатольевна", "Математика", "29.12.2022", 2)
    student1.get_info()
    student1.info_grade()
    student1.retake()
    println()

    val student2 = Diplom(60, "Иван Иванович Иванов", "Разработка мобильной игры", "21.07.2022", 4)
    student2.get_info()
    student2.info_grade()
    student2.retake()
    student2.info_pages()
    println()

    val student3 = Homework(5, "Александ Александрович Баринов", "Математика", "30.09.2022", 2)
    student3.get_info()
    student3.info_grade()
    student3.retake()
    student3.info_complexy()
    println()

}