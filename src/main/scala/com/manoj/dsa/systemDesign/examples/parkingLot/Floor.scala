package com.manoj.dsa.systemDesign.examples.parkingLot

case class Floor(id: String, slots: List[Slot]) {
  def findSlot(vehicle: Vehicle): Option[Slot] = {

    slots.find(s => s.vehicleType == vehicle.getClass && s.isAvailable)

  }
}
