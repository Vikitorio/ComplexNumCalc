import ComlexNumbers.ComplexNum

import scala.io.StdIn.readLine
import scala.runtime.Nothing$
object Main {
  def main(args: Array[String]): Unit = {
    var command: String = "1"
    while(command != "0"){
      println("0: end programm")
      println("+")
      println("-")
      println("*")
      println("/")
      command =  readLine("Enter Command : ")
      println("Enter first number")
      var num = new ComplexNum(readLine("Enter real part :").toInt, readLine("Enter imaginary part without i : ").toInt)
      println("Enter second number")
      var num2 = new ComplexNum(readLine("Enter real part :").toInt, readLine("Enter imaginary part without i : ").toInt)

     val Result:ComplexNum = command match {
       case "+" => num + num2
       case "-" => num - num2
       case "*" => num * num2
       case "/" => num / num2
     }
      println( "Result = " + Result)
      readLine()
    }

  }
}