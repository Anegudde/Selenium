package main.java;  
   
 public class Car {  
   private Integer fuelLevel;  
   
   public Car(int initialFuelLevel) {  
     fuelLevel = initialFuelLevel;  
   }  
   
   public void addFuel(int addedFuel) {  
     fuelLevel = fuelLevel + addedFuel;  
   }  
   
   public static int getFuelLevel() {  
     return fuelLevel;  
   }  
 }  