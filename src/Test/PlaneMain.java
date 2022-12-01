package Test;

public class PlaneMain {
    public static void main(String[] args) {
        System.out.println("Plane model: " + Plane.modelName);
        System.out.println("==================================");
        System.out.println("Flights history:");
        System.out.println("==================================");

        Plane flight777 = new Plane("Flight777");
        Plane flight745 = new Plane("Flight745");
        Plane flight733 = new Plane("Flight733");

        flight777.setFrom("Kyiv");
        flight777.setTo("NY");

        flight745.setFrom(flight777.getTo());
        flight745.setTo("London");

        flight733.setFrom(flight745.getTo());
        flight733.setTo(flight777.getFrom());

        System.out.println("Information about " + flight777.getFlightNumber() + ":");
        System.out.println("FROM " + flight777.getFrom() + " TO " + flight777.getTo());

        System.out.println("Information about " + flight745.getFlightNumber() + ":");
        System.out.println("FROM " + flight745.getFrom() + " TO " + flight745.getTo());

        System.out.println("Information about " + flight733.getFlightNumber() + ":");
        System.out.println("FROM " + flight733.getFrom() + " TO " + flight733.getTo());
    }
}