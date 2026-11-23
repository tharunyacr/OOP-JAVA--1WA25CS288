interface ParkingCharge
{
    void calculateCharge();
    void displayParkingDetails();
}

class VehicleParking
{
    String vehicleNumber;
    String vehicleType;
    int parkingHours;

    VehicleParking(String number, String type, int hours)
    {
        vehicleNumber = number;
        vehicleType = type;
        parkingHours = hours;
    }
}

class TwoWheeler extends VehicleParking implements ParkingCharge
{
    TwoWheeler(String number, String type, int hours)
    {
        super(number, type, hours);
    }

    public void calculateCharge()
    {
        int charge;

        if(parkingHours <= 2)
            charge = parkingHours * 20;
        else
            charge = 40 + (parkingHours - 2) * 10;

        System.out.println("Total Parking Charge: Rs." + charge);
    }

    public void displayParkingDetails()
    {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Parking Hours: " + parkingHours);
    }
}

class FourWheeler extends VehicleParking implements ParkingCharge
{
    FourWheeler(String number, String type, int hours)
    {
        super(number, type, hours);
    }

    public void calculateCharge()
    {
        int charge;

        if(parkingHours <= 2)
            charge = parkingHours * 50;
        else
            charge = 100 + (parkingHours - 2) * 30;

        System.out.println("Total Parking Charge: Rs." + charge);
    }

    public void displayParkingDetails()
    {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Parking Hours: " + parkingHours);
    }
}

class Main
{
    public static void main(String args[])
    {
        ParkingCharge p;

        p = new TwoWheeler("KA01AB1234", "Two Wheeler", 4);
        p.displayParkingDetails();
        p.calculateCharge();

        System.out.println();

        p = new FourWheeler("KA02CD5678", "Four Wheeler", 4);
        p.displayParkingDetails();
        p.calculateCharge();
    }
}