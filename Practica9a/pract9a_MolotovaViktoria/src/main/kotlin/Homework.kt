//Homework.kt
import Exam.*
import java.util.*

class Homework(var complexity:Int, var hw_student_bame:String, var hw_lesson:String, var hw_data:String, var hw_grade:Int, ) : Exam(hw_student_bame, hw_lesson, hw_data, hw_grade){

    override fun get_info() {
        println("\nИнформация")
        println("Имя студента $name\nПредмет: $lesson\nДата: $data\nОценка: $grade\nУровень сложность: $complexity из 10")
    }

    override fun info_grade() {
        println("\nПодробное описание оценки:")
        if(grade < 3) println("Студент не сделал домашнее задание")
        else if(grade == 3) println("Студент сделал домашнее задание удовлетворительно")
        else if(grade == 4) println("Студент сделал домашнее задание хорошо")
        else println("Студент сделал домашнее задание отлично!")
    }

    override fun retake() {
        println("Будущее студента:")
        if(grade < 3){
            val ret:Int = Random().nextInt((3- 1) + 1)
            when(ret){
                0 -> println("Студент сделает домашнее задание позже")
                1 -> println("Студент сделает домашнее задание позже")
                2 -> println("Преподаватель поставил отрицательную оценку в журан. Студент будет плакать и не сможет доделать задание")

            }
        }
        else{
            println("Студент счастлив что смог сделать задание")
        }
    }
    fun info_complexy(){
        println("Сложность задания:")
        if (complexity < 4) println("Это задание простое")
        else if((complexity > 4) && (complexity < 8)) println("Это задание среднего уровня сложности")
        else println("Это очень трудное задание")
    }
}