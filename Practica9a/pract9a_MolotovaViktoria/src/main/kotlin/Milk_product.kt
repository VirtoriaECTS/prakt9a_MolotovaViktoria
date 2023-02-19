//Milk_product.kt
package Milk_product
//вес указывается в граммах
open class Milk_product (var name: String, var weight : Double, var fat_content:Double, var producer:String, var price:Double  ){

    open fun weigt_info(){
        println("Вес молочного продукта состовляет:")
        val kg: Double = weight / 1000
        println("$weight грамм или $kg килограмм")
    }

    open fun price_info(){
        val gramm_price = weight / price
        println("Цена одного грамма молочного изделия равна $gramm_price рублей")
    }

    open fun get_info(){
        println("Информация  о молочном продукте:")
        println("Название: $name\nВес: $weight грамм\nЖирность: $fat_content%\nПроизводитель: $producer\nЦена: $price")
    }
}