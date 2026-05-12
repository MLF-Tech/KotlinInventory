fun main() {
    val items = mutableListOf(
        Product("Photo Book", 10),
        Product("Glossy Print", 50)
    )

    val searchName = "Canvas Print" // Prodotto che non esiste
    
    // find gives the product or 'null' if it cannot find it
    val product = items.find { it.name.equals(searchName, ignoreCase = true) }

    // Using operator Elvis ?: for altetrnatives if it is null
    product?.let {
        println("Product found: ${it.name} - Stock: ${it.stock}")
    } ?: println("ALERT: Product '$searchName' not found in inventory!")
}