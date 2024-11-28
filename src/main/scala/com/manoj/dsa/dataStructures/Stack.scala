package com.manoj.dsa.dataStructures

class Stack[T] {
  private var stack = List.empty[T]

  def pop(): T = {
    val head = stack.head
    stack = stack.tail
    head
  }

  def push(item: T): Unit = {
    stack = item :: stack
  }

  def head(): T = {
    stack.head
  }

  override def toString: String = stack.mkString("Stack(", " ,", ")")

}

object Stack {
  def apply[T](elements: T*): Stack[T] = {
    val stack = new Stack[T]
    elements.reverse.foreach(stack.push)
    stack
  }
}

object TestStack extends App {

  private val stack = Stack(1, 2, 7, 8)
  println(stack)
  println("stack.pop()")
  println(stack.pop())
  println(stack)
  println("stack.push(10)")
  println(stack.push(10))
  println(stack)
  println("stack.pop()")
  println(stack.pop())
  println(stack)
  println("stack.head()")
  println(stack.head())
  println(stack)

}
