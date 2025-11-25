import java.io.Serializable;

public class Bounds implements Serializable{
    private Location topLeft;
    private Location botomRight;

    public Bounds(Location topLeft, Location botomRight)
    {
        this.topLeft=topLeft;
        this.botomRight=botomRight;
    }

    //check the rectangular area
    public boolean contains(Location loc)
    {

        //we are checking if topLeft is "higher" than bottom right//if our rectangular area make actual sense
                //Lat ^ , Lon <->

              if( topLeft.getLat()>botomRight.getLat() &&//lefr must be more on"left" than bottom right
                topLeft.getLon()<botomRight.getLon())
                //loc not more on the left than our the most left point
              {
                  if(loc.getLat() <= topLeft.getLat() &&
                          //not higher than our highest
                          loc.getLon() <= botomRight.getLon()
                          //but higher or equal than our lowest
                          && loc.getLat() >= botomRight.getLat() &&
                          loc.getLon() >= topLeft.getLon())
                  {
                      return true;
                  }
              }
              return false;
    }


    public Location getTopLeft(){return topLeft;}
    public Location getBotomRight(){return botomRight;}

}
