public class FlightManager {

    // No properties, therefore using default constructor


    public int calculateBaggageAllowance(Flight flight) {
        return (int) Math.floor((flight.getPlane().getTotalWeight() / 2)
                                                    / flight.getPlane().getCapacity());
    }

    public int totalBaggageWeight(Flight flight) {

        // Count the total number of bags booked on the flight
        int totalNumOfBags = 0;
        for (Passenger passenger : flight.getPassengers()) {
            totalNumOfBags += passenger.getNumOfBags();
        }

        // Return the total weight of bags booked on the flight
        return totalNumOfBags * calculateBaggageAllowance(flight);
    }

    public int remainingBaggageWeight(Flight flight ) {

        // Calculate and return baggage weight still available on the flight
        return (calculateBaggageAllowance(flight) * flight.getPlane().getCapacity())
                                                                - totalBaggageWeight(flight);
    }

}
