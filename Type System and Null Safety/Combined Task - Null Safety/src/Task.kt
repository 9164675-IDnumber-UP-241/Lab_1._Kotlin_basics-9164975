fun generateGreeting(name: String?): String {
    val validName = name?.takeIf { it.isNotEmpty() } ?: "Guest"
    return "Welcome, $validName!"
}