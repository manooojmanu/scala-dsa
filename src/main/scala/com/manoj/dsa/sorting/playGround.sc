val array = Array(200, 5, 1, 3, 4, 7, 5, 1, 3, 8, 6, 9, 2)

def bubbleSort(array: Array[Int]) = {

  for (i <- array.indices) {

    for (j <- 0 until array.length - 1) {
      if (array(j) > array(j + 1)) {
        val temp = array(i)
        array(i) = array(j)
        array(j) = temp
      }
    }
  }
  array

}

bubbleSort(array)

def selection(array: Array[Int]) = {


  for (i <- array.indices) {
    var smallestItem = array(i)
    var smallestItemIndex = i
    for (j <- i + 1 until array.length) {
      if (array(j) < smallestItem) {
        smallestItem = array(j)
        smallestItemIndex = j
      }
    }
    val temp = array(i)
    array(i) = array(smallestItemIndex)
    array(smallestItemIndex) = temp
  }
  array
}

selection(array)