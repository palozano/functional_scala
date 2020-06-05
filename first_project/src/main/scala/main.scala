object main {

    def foo(s: Int): Int = s*3

    def getCurrentTime(): IO[String] = ???

    def main(args: Array[String]): Unit ={
        val s = foo(10)
        println(s)
    }

}
