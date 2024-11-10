package com.manoj.dsa.dataStructures

import scala.annotation.tailrec
import scala.util.control.Breaks.{break, breakable}


/*

HEAD ->  +-------+    +-------+    +-------+
         | 10    |    | 20    |    | 30    |
         | Next  | -> | Next  | -> | NULL  |
         +-------+    +-------+    +-------+
*/


case class Node[T](var data: T, var next: Option[Node[T]]) {

  override def toString: String = {
    s"$data -> ${next.toString}"
  }
}

/*
Operation	Time Complexity
Creating a Linked List	O(1)
Traversing a Linked List	O(n)
Adding an Element (Beginning)	O(1)
Adding an Element (End)	O(n)
Adding an Element (Position)	O(n)
Removing an Element (Beginning)	O(1)
Removing an Element (End)	O(n)
Removing an Element (Position)	O(n)
Searching for an Element	O(n)
Reversing the List	O(n)
Checking if the List is Empty	O(1)
Getting the Length	O(n)
Updating an Element	O(n)
*/

class LinkedList[T] {
  var head: Option[Node[T]] = None

  def insertHead(value: T): Unit = {
    val node = new Node[T](value, head)
    head = Some(node)
  }

  def findLast: Option[Node[T]] = {
    @tailrec
    def findLast(head: Option[Node[T]], acc: Option[Node[T]] = None): Option[Node[T]] = {
      head match {
        case None => acc
        case Some(value) => findLast(value.next, Some(value))
      }
    }

    findLast(head)
  }

  def _length: Int = {
    var length = 0
    var current = head
    while (current.isDefined) {
      length += 1
      current = current.get.next
    }
    length
  }

  def find(value: T): Option[T] = {
    var current = head
    var node: Option[T] = None
    breakable {
      while (current.isDefined) {
        if (current.get.data == value) {
          node = Some(current.get.data)
          break()
        }
        current = current.get.next
      }
    }
    node
  }

  def insertAtLast(value: T): Unit = {
    findLast.foreach(s => s.next = Some(Node(value, None)))
  }


  def deleteAtHead(): Unit = {
    head = head.flatMap(_.next)
  }

  def insertAt(position: Int, value: T): Unit = {

    if (position == 0)
      insertHead(value)
    else {
      var currentPosition = 0
      var current = head
      while (currentPosition < position - 1 && current.isDefined) {
        currentPosition += 1
        current = current.get.next
      }

      current match {
        case Some(node) =>
          node.next = Some(Node(value, node.next))
        case None =>
          println("Position not found, Inserting at last")
          insertAtLast(value)
      }
    }

  }


  def reverse(): Unit = {
    var current = head
    var reverse: Option[Node[T]] = None
    while (current.isDefined) {
      var tempNode = current.get.next
      current.get.next = reverse
      reverse = current
      current = tempNode

    }
    head = reverse

  }

  def display(): Unit = {
    var current = head
    while (current.isDefined) {
      print(current.get.data + " -> ")
      current = current.get.next
    }
    println("None")
  }

}

object LinkedList {
  def apply[T](elements: T*): LinkedList[T] = {
    val list = new LinkedList[T]()
    elements.reverse.foreach(elm => list.insertHead(elm))
    list
  }

}

object LinkedListTest extends App {
  val list: LinkedList[Int] = LinkedList(1 to 10: _*)
  println(s"Length of the list: ${list._length}")
  list.display()
  println("Deleting Head")
  list.deleteAtHead()
  println(s"Length of the list: ${list._length}")
  list.display()
  println("Insert at End")
  list.insertAtLast(11)
  list.display()
  println(s"Length of the list: ${list._length}")
  println("Find Last")
  println(list.findLast)
  println("Insert 20 at position 9")
  list.insertAt(0, 1)
  println(s"Length of the list: ${list._length}")
  list.display()
  println("Find 5 in list")
  println(list.find(5))
  println("Reversing a list")
  list.reverse()
  list.display()


}

