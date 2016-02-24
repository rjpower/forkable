package org.allenai

object ForkIt {
  def main(args: Array[String]): Unit = {
    import com.sun.akuma.CLibrary

    for (i <- 1 to 100) {
      val result = CLibrary.LIBC.fork()
      if (result == 0) {
        println("Child")
        System.exit(0)
      } else {
        println(s"Parent $i")
      }
    }
  }
}
