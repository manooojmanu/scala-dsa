package com.manoj.dsa.problems.array

object RemoveElement {

  def remove(array: Array[Int], elementToRemove: Int): Array[Int] = {
    var indexToAdd = 0
    for (i <- array.indices) {
      if (array(i) != elementToRemove) {
        array(indexToAdd) = array(i)
        indexToAdd += 1
      }


    }
    array.take(indexToAdd)
  }
}

object RemoveElementTest extends App {

  println(RemoveElement.remove(Array(1, 3, 5, 7, 8, 7, 2, 3, 7, 8), 7).mkString("Array(", ", ", ")"))
}
