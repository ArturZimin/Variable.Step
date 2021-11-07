package task1;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Variable {

	public static DecimalFormat df = new DecimalFormat("0.000");

	public static void main(String[] args) {
		/*
		 * Car specification
		 */

		int engineVolume = 2000;
		int numberOfGears = 5;
		int tireRadius = 16;
		int torque = 6000;
		int lenthOfTheCar = 4600;

		int fullTankRange = 1000;
		int carPriceInDollars = 7000;
		int numberDoor = 5;
		int maxSpeed = 220;
		int fullMass = 1980;

		double fuelTankCapacity = 70.0;
		double minBatteryChargingCurrentInVolt = 13.6;
		double maxBatteryChargingCurrentInVolt = 14.6;
		double averageFuelConsumptionInCityInLitr = 7.8;
		double averageFuelConsumptionOutsideCityInLitr = 5.2;
		double accelerationTimeTo100KilometersInSecond = 9.2;
		double oilTransmission = 7.9;
		double oilEngine = 4.4;
		double oilSteeringWheel = 1.4;
		double airConditionPressure = 6.6;
		double fuelPumpPressure = 3.6;

		boolean doYouLikeRedACar = false;
		boolean doYouLikeBlackACar = true;
		boolean youDriveMoreThen200KM = true;
		boolean maxSpeedInCity60 = true;
		boolean theCarHas4Wheels = true;
		boolean doYouHaveAnAutomaticTransmission = true;
		boolean doYouHaveRights = true;
		boolean doYouHaveADrivingExperience = true;
		boolean doYouKnowSchumacher = false;
		boolean youViolatedPDD = true;

		/*
		 * The car can drive one thousand kilometers on 70 liters.How many kilometers
		 * will drive a car on 50 liters?
		 */
		double theCarWillDriveOn50KM = (fullTankRange / fuelTankCapacity) * 50;
		String temp = df.format(theCarWillDriveOn50KM);

		System.out.println("The car can drive on 50 liters :" + temp + " km");

		double mixedFuelConsumption = (averageFuelConsumptionInCityInLitr - averageFuelConsumptionOutsideCityInLitr) / 2
				+ averageFuelConsumptionOutsideCityInLitr;

		System.out.println("Mixed fuel consumptin : " + mixedFuelConsumption + " l/100km");
	}
}
