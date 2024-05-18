package encapsulation.copyconstructor;

public class Car {
	
	private String carBrand;
	private String carModel;
	private int manufacturedYear;
	private String carType;
	private String transmissionType;
	
	
	public Car(String carBrand, String carModel, int manufacturedYear, String carType, String transmissionType) {
		this.carBrand = carBrand;
		this.carModel = carModel;
		this.manufacturedYear = manufacturedYear;
		this.carType = carType;
		this.transmissionType = transmissionType;
	}
	
	//copy constructor
	Car(Car otherCar){
		this.carBrand = otherCar.carBrand;
		this.carModel = otherCar.carModel;
		this.manufacturedYear = otherCar.manufacturedYear;
		this.carType = otherCar.carType;
		this.transmissionType = otherCar.transmissionType;
		
		
	}

	public String getCarBrand() {
		return carBrand;
	}


	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}


	public String getCarModel() {
		return carModel;
	}


	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}


	public int getManufacturedYear() {
		return manufacturedYear;
	}


	public void setManufacturedYear(int manufacturedYear) {
		this.manufacturedYear = manufacturedYear;
	}


	public String getCarType() {
		return carType;
	}


	public void setCarType(String carType) {
		this.carType = carType;
	}


	public String getTransmissionType() {
		return transmissionType;
	}


	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}


	public String toString() {
		return "Car [carBrand=" + carBrand + ", carModel=" + carModel + ", manufacturedYear=" + manufacturedYear
				+ ", carType=" + carType + ", transmissionType=" + transmissionType + "]";
	}
	
	

}
