package Test;

public class Plane {
    public static String modelName = "Airbus-320";

    private int passengers;

    private String flightNumber;

    private String from;

    private String to;


    public Plane(String c) {
        from = "A";
        to = "B";
        flightNumber = c;
    }


    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFlightNumber(){
        return flightNumber;
    }

}
