package designParkingLot;

public class ParkingSystem {

    /*Design a parking system for a parking lot.
    The parking lot has three kinds of parking spaces: big, medium, and small, with a fixed number of slots for each size.

Implement the ParkingSystem class:

        .ParkingSystem(int big, int medium, int small) Initializes object of the ParkingSystem class.
        The number of slots for each parking space are given as part of the constructor.
        .bool addCar(int carType) Checks whether there is a parking space of carType for the car that wants to get into the parking lot.
        carType can be of three kinds: big, medium, or small, which are represented by 1, 2, and 3 respectively.
        A car can only park in a parking space of its carType.
        If there is no space available, return false, else park the car in that size space and return true

     */

    int bigCarSize;
    int mediumCarSize;
    int smallCarSize;
    public ParkingSystem(int big, int medium, int small) {
     this.bigCarSize=big;
     this.mediumCarSize=medium;
     this.smallCarSize=small;
    }

    public boolean addCar(int carType) {
        if(carType==1){
            if(bigCarSize>0){
                bigCarSize--;
                return true;
               }
          }
        else if(carType==2){
            if(mediumCarSize>0) {
                mediumCarSize--;
                return true;
                }
            }
            else if(carType==3){
                if(smallCarSize >0){
                    smallCarSize--;
                    return true;
                }
            }

      return false;
    }

    public static void main(String[] args) {

        ParkingSystem park= new ParkingSystem(1,1,0);
        System.out.println("Car can be added:?"+park.addCar(3));

    }
}
