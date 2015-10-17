package hello;

import org.joda.time.LocalTime;

public class HelloWorld{

  public static void main(String[] agrs){
    LocalTime lt = new LocalTime();
    System.out.println("The current local time is : "+lt);
    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());

  }
}
