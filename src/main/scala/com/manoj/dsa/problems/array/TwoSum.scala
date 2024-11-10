package com.manoj.dsa.problems.array

object TwoSum extends App {
  /*  Problem: Given an array of integers nums and an integer target,
    return indices of the two numbers such that they add up to target.
    */
  def twoSum(array: Array[Int], target: Int): Array[Int] = {

    var map: Map[Int, Int] = Map.empty
    for (i <- array.indices) {
      val valueAtI = array(i)
      val diff = target - valueAtI
      if (map.contains(diff)) {
        val anotherIndex = map(diff)
        return Array(anotherIndex, i)
      } else {
        map = map.updated(valueAtI, i)
      }

    }
    Array()

  }

  println(twoSum(Array(1, 2, 3, 6, 8), 10).mkString("[", ", ", "]"))


}
