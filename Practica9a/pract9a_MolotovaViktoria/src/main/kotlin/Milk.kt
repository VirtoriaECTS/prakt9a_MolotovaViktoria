//Milk.kt
import Milk_product.*
class Milk (var view : String, var cooking_method:String, var milk_name:String, var milk_weight:Double, var milk_fat_content:Double, var milk_prosucer:String, var milk_price:Double):
    Milk_product(milk_name, milk_weight, milk_fat_content, milk_prosucer, milk_price){
    private var plotnoct : Double = 0.971
    public fun P() : Double{
        return plotnoct
    }

    override fun weigt_info() {
        val pl:Double = P();
        val litr = milk_weight * pl
        println("Молоко имеет обьем $litr литр(а, ов)")
    }
    override fun price_info() {
        val gramm_price = weight / price
        println("Цена одного грамма молока равна $gramm_price рублей")
    }

    override fun get_info() {
        super.get_info()
        println("Вид молока: $view\nМетод приготовления: $cooking_method")
    }

}