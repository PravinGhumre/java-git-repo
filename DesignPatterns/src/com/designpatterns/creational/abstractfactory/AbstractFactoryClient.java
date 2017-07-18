package com.designpatterns.creational.abstractfactory;

public class AbstractFactoryClient {

	public static void main(String[] args) {

		//
		VehicleFactory luxuryVehicleFactory = VehicleFactory
				.getVehicleFactory(VehicleFactory.LUXURY_VEHICLE);

		Car luxuryCar = luxuryVehicleFactory.getCar();
		SUV luxurySuv = luxuryVehicleFactory.getSUV();

		System.out.println("--luxuryCar-Name >>> " + luxuryCar.getCarName());
		System.out.println("--luxuryCar-Features>>> "
				+ luxuryCar.getCarFeatures());

		System.out.println("--luxurySuv-Name >>> " + luxurySuv.getSUVName());
		System.out.println("--luxurySuv-Features>>> "
				+ luxurySuv.getSUVFeatures());

		//
		VehicleFactory nonLuxuryVehicleFactory = VehicleFactory
				.getVehicleFactory(VehicleFactory.NON_LUXURY_VEHICLE);

		Car nonLuxuryCar = nonLuxuryVehicleFactory.getCar();
		SUV nonLuxurySuv = nonLuxuryVehicleFactory.getSUV();

		System.out.println("--nonLuxuryCar-Name >>> "
				+ nonLuxuryCar.getCarName());
		System.out.println("--nonLuxuryCar-Features>>> "
				+ nonLuxuryCar.getCarFeatures());

		System.out.println("--nonLuxurySuv-Name >>> "
				+ nonLuxurySuv.getSUVName());
		System.out.println("--nonLuxurySuv-Features>>> "
				+ nonLuxurySuv.getSUVFeatures());

	}

}
