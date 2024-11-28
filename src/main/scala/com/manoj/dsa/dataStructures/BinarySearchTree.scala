package com.manoj.dsa.dataStructures

import scala.math.Ordered.orderingToOrdered


case class TreeNode[T](
                        var value: T,
                        var left: Option[TreeNode[T]] = Option.empty[TreeNode[T]],
                        var right: Option[TreeNode[T]] = Option.empty[TreeNode[T]]
                      )


class BinarySearchTree[T: Ordering] {

  var rootNode: Option[TreeNode[T]] = Option.empty[TreeNode[T]]


  def insert(value: T): BinarySearchTree[T] = {
    var temp = rootNode
    val node = TreeNode(value, Option.empty[TreeNode[T]], Option.empty[TreeNode[T]])
    lazy val result: BinarySearchTree[T] = this
    if (rootNode.isEmpty) {
      rootNode = Some(node)
      this
    } else {
      while (true) {
        val currentNodeValue = temp.get.value
        if (value < currentNodeValue) {
          if (temp.get.left.isEmpty) {
            temp.get.left = Some(node)
            return this
          }
          temp = temp.get.left
        } else {
          if (temp.get.right.isEmpty) {
            temp.get.right = Some(node)
            return this
          }
          temp = temp.get.right
        }
      }

    }
    this

  }

}

object BinarySearchTreeTest extends App {
  val tree = new BinarySearchTree[Int]()
  List(2, 90, 300, 234, 234565, 34, 1).foreach(i => tree.insert(i))
  println(tree)

  val tree1 = TreeNode(1, Some(TreeNode(2)), Some(TreeNode(3)))

  def inOrderTravarsal[T](node: Option[TreeNode[T]]): List[T] = {
    node match {
      case None => Nil
      case Some(node) =>
        inOrderTravarsal(node.left) ++ List(node.value) ++ inOrderTravarsal(node.right)
    }
  }

  println(inOrderTravarsal(Some(tree1)))

}
