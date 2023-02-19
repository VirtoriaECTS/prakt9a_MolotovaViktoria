//Exam.kt
package Exam
import java.util.*
open class Exam (var name:String, var lesson:String, var data:String, var grade:Int ){

    open fun get_info(){
        println("\nИнформация")
        println("Имя студента $name\nПредмет: $lesson\nДата: $data\nОценка: $grade")
    }

    open fun info_grade(){
        println("\nПодробное описание оценки:")
        when(grade){
            0 -> println("Прогул")
            1 -> println("Экзамен не сдан")
            2 -> println("Экзамен не сдан")
            3 -> println("Экзамен сдан удовлетворительное")
            4 -> println("Экзамен сдан хорошо")
            5 -> println("Экзамен сдан отлично!")
        }
    }

    open fun retake(){
        println("\nСудьба студента:")
        if(grade < 3){
            val ret:Int = Random().nextInt((3- 1) + 1)
            when(ret){
                0 -> println("Пересдачи нет. Студент отчислен")
                1 -> println("Студент может пойти на пересдачу")
                2 -> println("Пересдачи нет. Студент отчислен")

            }
        }
        else if(grade == 3) println("Студент остался без степендии")
        else{
            println("Студент счастлив. У него есть стипендия!")
        }
    }
}