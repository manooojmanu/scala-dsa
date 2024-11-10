package com.manoj.dsa.problems.array

object RemoveDuplicatedFromSortedArray {

  def removeDuplicate(array: Array[Int]): Int = {
    var i = 0
    var length = array.length
    while (i + 1 < array.length) {
      if (array(i) == array(i + 1)) {
        length -= 1
      }
      i += 1

    }
    length
  }

}

object RemoveDuplicatedFromSortedArrayTest extends App {
  println(RemoveDuplicatedFromSortedArray.removeDuplicate(Array(1, 2, 33, 33, 44, 44, 55, 55, 66)))
}
