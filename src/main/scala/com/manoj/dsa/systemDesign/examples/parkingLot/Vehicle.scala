package com.manoj.dsa.systemDesign.examples.parkingLot

trait Vehicle {
  val id: String
}

case class Car(id: String) extends Vehicle

case class Bike(id: String) extends Vehicle



