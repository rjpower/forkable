package org.allenai

object ProcessIt {
  def main(args: Array[String]): Unit = {
    import scala.sys.process._
    for (i <- 1 to 100) {
      println(s"Parent $i")
      Process("scala", Seq("-J-Xmx1g", "-J-Xms1g", "org.allenai.ProcessChild"))!
    }
  }
}

object ProcessChild {
  def main(args: Array[String]): Unit = {
    println("Child")
  }
}
