//Cheese.kt
import Milk_product.*
class Cheese(var whoose_milk : String, var consistency:String, var color: String, var chees_name:String, var chees_weight:Double, var chees_fat_content:Double, var chees_prosucer:String, var chees_price:Double):
    Milk_product(chees_name, chees_weight, chees_fat_content, chees_prosucer, chees_price) {
    //whoose_milk чьё молоко использовалось для приготовления

    override fun weigt_info() {
        println("Вес сыра состовляет:")
        val kg: Double = weight / 1000
        println("$weight грамм или $kg килограмм")
    }

    override fun price_info() {
        val gramm_price = weight / price
        println("Цена одного грамма сыра равна $gramm_price рублей")
    }

    override fun get_info() {
        super.get_info()
        println("Для изготовления cыра используется молоко: $whoose_milk\nКонсистенция: $consistency\nЦвет: $color")
    }
}