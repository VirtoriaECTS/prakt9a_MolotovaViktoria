//Diplim.kt
import Exam.*
import java.util.*

//open class Exam (var name:String, var lesson:String, var data:String, var grade:Int ){
class Diplom(var pages:Int, var diplom_student_name: String, var diplom_tema:String, var diplom_data: String, var diplom_grade:Int ) : Exam(diplom_student_name, diplom_tema, diplom_data, diplom_grade) {

    override fun get_info() {
        println("\nИнформация")
        println("Имя студента $name\nТема: $lesson\nДата: $data\nОценка: $grade\nКоличество страниц: $pages")
    }

    override fun info_grade() {
        println("\nПодробное описание оценки:")
        when(grade){
            0 -> println("Студент отчислился прежде чем защитить диплом")
            1 -> println("Диплом защищен отвратителен")
            2 -> println("Диплом защищен ужасно")
            3 -> println("Диплом защищен удовлетворительное")
            4 -> println("Диплом защищен хорошо")
            5 -> println("Диплон защищен отлично!")
        }
    }

    override fun retake() {
        println("Будущее студента:")
        if(grade < 3){
            val ret:Int = Random().nextInt((3- 1) + 1)
            when(ret){
                0 -> println("Студент не найдет работу без диплома")
                1 -> println("Студент не найдет работу без диплома")
                2 -> println("Студент откроет свое дело и станет богатым")

            }
        }
        else{
            println("Студент найдет работу")
        }
    }
    fun info_pages(){
        if(pages == 0) println("У студента нет дипломной работы")
        else if((pages > 0) && (pages < 50)) println("Дипломаная работа очень маленькая")
        else if((pages > 50) && (pages < 100)) println("Дипломная работа среднего размера")
        else println("Дипломная работа огромная")
    }
}