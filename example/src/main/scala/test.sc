
object testing {
  println("Hey, there!")

  val f: String => String = { case "ping" => "pong" }

  f("ping")
  //f("abc")

  for (i <- 0 to 9) {
    println(i+2)
  }
}

testing

// Create a string and check if it has a uppercase letter
val name: String = "Pablo Lozano"
val hasUpperCase: Boolean = name.exists(_.isUpper)

// Creating a class
class Programmer(var name: String, var language: String, var favDrink: String)

// Read the number of lines in a file
var src = scala.io.Source.fromFile("/home/palozano/Documents/funcprog_scala/example/src/main/scala/SomeFile.txt")
val count = src.getLines().map(x => 1).sum

val bookName = "Scala in \"Action\""

val book = <book>
           <title>Scala in Action</title>
           <author>Nilanjan Raychaudhuri</author>
           </book>