// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(text: String, sensitive: String, replacement: Char = 'X'): String {
    return text.replace(sensitive, replacement.toString().repeat(sensitive.length))
}