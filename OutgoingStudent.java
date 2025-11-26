import dataStructures.*;
public class OutgoingStudent extends Student {
    public OutgoingStudent(String name, String country, LodgingService home, Service currentLoc)
    {
        super(name,country,home,currentLoc);
    }

    @Override
    public String getType(){return "outgoing";}

    public boolean preferEvents(){return true;}

    //we record all the visited services
    public void visit(Service s){super.visit(s);}
}
