package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport extends Road {
public void transportForm() {
	System.out.println("Welcome To Transport Form");

}
public static void main(String[] args) {
    Transport t=new Transport();
    Road r=new Road();
    Air a=new Air();
    Water w=new Water();
    t.transportForm();
    r.bike();
    r.cycle();
    r.bus();
    r.car();
    a.Airplane();
    a.Helicopter();
    w.boat();
    w.ship();
    
    
}
}
