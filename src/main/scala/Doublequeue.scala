//package Knoldus
import java.util.Collections.list
import scala.collection.mutable.ListBuffer
trait Queue{
  var bufferItem = new ListBuffer[Int]()
  def enqueue(item:Int)
  def dequeue(): Unit ={
    bufferItem.remove(0)
    val list =bufferItem.toList
    println(list)
  }
}
class DoubleQueue extends Queue {
  override def enqueue(item:Int): Unit = {
    bufferItem+=item*2
    val list = bufferItem.toList
    println(list)
  }
}
class SquareQueue extends Queue {
  override def enqueue(item:Int): Unit = {
    bufferItem+=item*item
    val list = bufferItem.toList
    println(list)
  }
}
object AssignmetOOPs {
  def main(args: Array[String]): Unit = {
    val doubleQ = new DoubleQueue()
    val squareQ = new SquareQueue()
    print("Added after doubling item at 2nd position :- "+doubleQ.enqueue(1))
    print("Adding at 3rd position :- "+doubleQ.enqueue(2))
    print("Adding at 4th position :- "+doubleQ.enqueue(3))
    print("This doubles the entered value :- "+doubleQ.enqueue(4))
    print("It's removing 1st item : " + squareQ.enqueue(-6))
    print("Now removing 2nd item:- "+doubleQ.dequeue())
    doubleQ.dequeue()
  }
}