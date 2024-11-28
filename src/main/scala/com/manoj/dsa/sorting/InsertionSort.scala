package com.manoj.dsa.sorting

object InsertionSort extends App {
  def sort(array: Array[Int]) = {

    for (i <- array.indices) {
      val key = array(i)
      var j = i - 1
      while (j >= 0 && array(j) > key) {
        array(j + 1) = array(j)
        j = j - 1
      }
      array(j + 1) = key
      println(array.mkString("Array(", ", ", ")"))
    }

    array

  }


  println(sort(Array(2, 3, 4, 1, 6)).mkString("Array(", ", ", ")"))

}
