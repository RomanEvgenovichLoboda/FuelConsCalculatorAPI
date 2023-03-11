package Controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FuelController {
    @GetMapping("costOfTravel")
    public String costOfTravel(double Distance,double AverFuelCons, double FuelCost){
        double Fuel = (Distance/100)*AverFuelCons;
        double TravelCost = FuelCost * Fuel;
        return "Required Amount Of Fuel = " + Fuel + "l." +
                "\nThe Cost Of Travel = " + TravelCost + "hrn.";
    }
    @GetMapping("averageFuelConsumption")
    public String averageFuelConsumption(double Fuel,double Distance){
        double FuelCons = (Fuel/Distance)*100;
        return "The Fuel Consumption Of Your Car Is " + (Fuel/Distance)*100 + " l. Per 100km.";
    }
    @GetMapping("howMuchFuelIsEnough")
    public String howMuchFuelIsEnough(double Vehicle,double Fuel){
        double Distance = Fuel/(Vehicle/100);
        return "You can drive  " + Distance + "km.";
    }
}
