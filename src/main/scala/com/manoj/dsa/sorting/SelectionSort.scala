package com.manoj.dsa.sorting

object SelectionSort extends App {

  def sort(array: Array[Int]): Array[Int] = {
    println(s"Lenth:${array.length}")
    for (i <- array.indices) {
      println(s"I: $i")
      var minValueIndex = i
      var j = i
      while (j < array.length) {
        if (array(j) < array(minValueIndex)) {
          minValueIndex = j
        }
        j += 1
      }
      val temp = array(i)
      array(i) = array(minValueIndex)
      array(minValueIndex) = temp
      println(array.mkString("Array(", ", ", ")"))
    }

    array

  }

  println(sort(Array(200, 5, 1, 3, 4, 7, 5, 1, 3, 8, 6, 9, 2, 201)).mkString("Array(", ", ", ")"))

}
