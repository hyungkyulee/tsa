fun main(args: Array<String>) {

  val message: List<String> = listOf("x", "y", "z")
  println("Hello Kotlin")

  println("O(1): null check -> return: ${isFirstElementNull(message)}")
  println("O(N): foreach -> return: ${containsValue(message, "x")}")
}

fun isFirstElementNull(list: List<String?>) = list[0]==null

fun containsValue(list: List<String>, value: String): Boolean {
    list.forEach { it ->
        if (it == value) return true
    }
    return false
} 