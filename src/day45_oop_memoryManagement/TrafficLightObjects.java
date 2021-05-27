package day45_oop_memoryManagement;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TrafficLightObjects {
    public static void main(String[] args) {


        //create traffic light object
        TrafficLight trafficLight = new TrafficLight();
        //trafficLight.color = red", NOT THIS WAY TODAY
        //we will assign/update the value of color using a method in a class

        trafficLight.changeColor("red");

        //   System.out.println("current color = " +trafficLight.color);//direct access   to variable
        //call method to access the variable:
        trafficLight.showColor();

        trafficLight.changeColor("green");

        trafficLight.showColor();

        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight2.color = " brown";
        trafficLight2.showColor();
    }
}