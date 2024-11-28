package com.manoj.dsa.systemDesign.examples.parkingLot

case class Slot(id: String, floor_id: String, vehicleType: Class[_ <: Vehicle], isAvailable: Boolean = true)


