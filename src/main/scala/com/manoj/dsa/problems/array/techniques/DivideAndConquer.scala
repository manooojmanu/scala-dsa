package com.manoj.dsa.problems.array.techniques

import com.manoj.dsa.problems.array.MergeSortedArrays

object DivideAndConquer extends App {

  //  Example sorting

  def sort(array: Array[Int]): Array[Int] = {
    //    println(s"Sorting array ${array.mkString("[", ",", "]")}")
    if (array.length <= 1)
      array
    else {
      val mid = array.length / 2
      val left = array.slice(0, mid)
      val right = array.slice(mid, array.length)
      val leftSorted = sort(left)
      val rightSorted = sort(right)
      MergeSortedArrays.merge(leftSorted, rightSorted)

    }
  }


  println(sort(Array(3, 5, 1, 2, 4, 8, 1, 3, 4,345345, 3, 44, 21, 133,0, 232, 45)).mkString("Array(", ", ", ")"))

}
