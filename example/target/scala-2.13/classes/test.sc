
object testing {
  println("Hey, there!")

  val f: String => String = { case "ping" => "pong" }

  f("abc")

  for (i <- 0 to 9) {
    println(i)
  }
}