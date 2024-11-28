package com.manoj.dsa.sorting

object BubbleSort extends App {

  def sort(array: Array[Int]): Array[Int] = {
    println(array.mkString("Array(", ", ", ")"))
    for (i <- array.indices) {
      var swapped = false
      for (j <- 0 until array.length - 1 - i) {
        if (array(j) > array(j + 1)) {
          val temp = array(j)
          array(j) = array(j + 1)
          array(j + 1) = temp
          println(array.mkString("Array(", ", ", ")"))
          swapped = true
        }
      }
      if (!swapped) {
        return array
      }
    }
    array

  }

  println(sort(Array(200, 5, 1, 3, 4, 7, 5, 1, 3, 8, 6, 9, 2)).mkString("Array(", ", ", ")"))
}
