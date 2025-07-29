package daily_class_for_java.eightdayclass;

import java.sql.SQLOutput;

public class Sample {

    /* constructor is same as class name
       constructor does not have return type
       constructor can be overloaded but not overridden
       constructor is used to initialize the object of the class
     */

public Sample(int a){
    this();
    System.out.println("Constructor with parameter called, value: " + a);
}
public Sample() {
    System.out.println("Default constructor called");}


public Sample(String   name, int a) {
    this(a); // calling default constructor
    System.out.println("Constructor with String parameter called, value: " + name);}




}
