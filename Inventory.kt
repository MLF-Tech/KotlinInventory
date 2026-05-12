data class Product(val name: String, var stock: Int)

fun main() {
    val items = mutableListOf(
        Product("Photo Book", 10),
        Product("Glossy Print", 50)
    )

    println("--- My First Kotlin Project ---")
    
    val orderQty = 5
    val product = items[0]

    if (product.stock >= orderQty) {
        product.stock -= orderQty
        println("Order successful! New stock for ${product.name}: ${product.stock}")
    } else {
        println("Error: Not enough stock.")
    }
}