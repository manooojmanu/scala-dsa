package com.manoj.dsa.problems.array

object MergeSortedArrays {

  def merge(array1: Array[Int], array2: Array[Int]): Array[Int] = {
    if (array1.isEmpty) array2
    else if (array2.isEmpty) array1
    else {

      val merged: Array[Int] = Array.ofDim[Int](array1.length + array2.length)
      var j = 0
      var i = 0

      while (i < array1.length) {
        val arrayAtI = array1(i)
        while (j < array2.length && array2(j) < arrayAtI) {
          merged(i + j) = array2(j)
          j += 1
        }
        merged(i + j) = arrayAtI
        i += 1
      }
      while (j < array2.length) {
        merged(i + j) = array2(j)
        j += 1
      }

      merged
    }
  }

}

object MergeSortedArraysTest extends App {

  val array1 = Array(1, 2, 3, 100, 200, 300)

  val array2 = Array(3, 4, 7, 8, 20)

  println(MergeSortedArrays.merge(array1, array2).mkString("Array(", ", ", ")"))
}