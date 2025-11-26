import java.io.Serializable;

public class Location implements Serializable{
    private long lat;
    private long lon;

    public Location(long lat, long lon)
    {
        this.lat=lat;
        this.lon=lon;
    }

    public long getLat(){return lat;}

    public long getLon(){return lon;}

    //if the locations are the same- fi we want to compare them with the list etc

    public boolean sameLoc(Location other)
    {
        return this.lon==other.lon && this.lat==other.lat;
    }

    public String getCoordinates()
    {
        return "("+lat+","+lon+")";
    }
}


