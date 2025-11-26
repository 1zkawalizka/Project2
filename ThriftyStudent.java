import dataStructures.*;

public class ThriftyStudent extends Student {
    private EatingService cheapestEat;
    private LodgingService cheapestLodge;
    public ThriftyStudent(String name, String country, LodgingService home, Service currentLoc,EatingService cheapestEat,LodgingService cheapestLodge) {
        super(name, country, home, currentLoc);
        this.cheapestEat=cheapestEat;
        this.cheapestLodge=cheapestLodge;
    }
//we use Binary serach tree mAP from area to iterate through all the services and fins the chepast options
    //key-String(name of the service) value-price of teh service
    public void findCheapestOptions(BSTMap<String, Service> allServices) {
        if(allServices==null) return;
        for(Service s: allServices.values()) {
            if (s instanceof EatingService) {
                EatingService eat = (EatingService) s;
                if (cheapestEat == null || cheapestEat.getCost() > eat.getCost()) {
                    cheapestEat = eat;
                }
            } else if (s instanceof LodgingService) {
                LodgingService lodge = (LodgingService) s;
                if (cheapestLodge == null || cheapestLodge.getCost() > lodge.getCost()) {
                    cheapestLodge = lodge;
                }
            }
        }
    }

    public EatingService getCheapestEat() {return cheapestEat;}

    public LodgingService getCheapestLodge(){return cheapestLodge;}

    @Override
    public String getType(){return "thrifty";}



}
