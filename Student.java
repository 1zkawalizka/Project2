import dataStructures.*;
import java.io.Serializable;

//astract cause we have the same behaviours for different students
public abstract class Student implements Serializable {
    private String name;
    private String country;
    //object  to represent this lodgingservce
    private LodgingService home;
    //current location of the servce
    private Service currentLoc;
    //LIFO so the most recent place  will be at the top
    private Stack<Service> history;

    public Student(String name, String country, LodgingService home, Service currentLoc)
    {
        this.name=name;
        this.country=country;
        this.home=home;
        this.currentLoc=currentLoc;
        this.history=new Stack<>();//every student have new history records
    }

    public void visit(Service s){
        //we are adding to our hstory stack the place we visited
        history.push(s);
        //we are changing currentloc to the place we are visiting now
        this.currentLoc=s;
    }
    //every clas (thrifty , bookish, outgoing) has their own implementation with the type of student
    //we use abstarct because every student has to define his/her own preferences
    public abstract String getType();

    public Stack<Service> getHistory(){return history;}

    public Service getCurrentLoc(){return currentLoc;}

    public LodgingService getHome(){return home;}

    public void moveTo(Service loc){this.currentLoc=loc;}

}


