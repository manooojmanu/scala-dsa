package com.manoj.dsa.systemDesign.examples.parkingLot

class ParkingLotService(name: String, floors: List[Floor]) {

  def park(vehicle: Vehicle) = {
    floors.iterator.flatMap(_.findSlot(vehicle))
  }

}

