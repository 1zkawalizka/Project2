import dataStructures.*;

public class BookishStudent extends Student {
    public BookishStudent(String name, String country, LodgingService home, Service currentLoc)
    {
        super(name,country,home,currentLoc);
    }

    @Override
    public String getType(){return "bookish"; }

    public boolean preferBooks() {return true;}


    //we have to check if our visited place is on list of leisure services, if not we are not listing it
    //cause we only want list of leisure
    public void visit(Service s)
    {
        if(s instanceof LeisureService)
        {
            //we are adding s to list of visited services
            super.visit(s);
        }
    }

}

