package org.bike;

public class Ktm implements Bike {
      @Override
    public void speed(String no) {
    	System.out.println("Speed ="+"\t"+ no);
    }
      @Override
    public void cost(long no) {
         System.out.println("Cost ="+"\t"+ no);
    }
      public static void main(String[] args) {
		Ktm k = new Ktm();
		k.cost(175000l);
		k.speed("250 km/hr");
	}
}
