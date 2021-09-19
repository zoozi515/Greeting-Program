fun main() {
    var message = "Hello user, welcome to my program!\n";
    print("$message")

    print("Enter your name: ")
    val name = readLine()
    message = message.replace("user","$name")

    print("$message")
}