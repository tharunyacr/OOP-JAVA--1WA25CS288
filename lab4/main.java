abstract class EnergySource
{
    int sourceId;
    String sourceName;
    double energyGenerated;

    EnergySource(int id, String name, double energy)
    {
        sourceId = id;
        sourceName = name;
        energyGenerated = energy;
    }

    abstract void calculateEfficiency();

    void display()
    {
        System.out.println("Source ID: " + sourceId);
        System.out.println("Source Name: " + sourceName);
        System.out.println("Energy Generated: " + energyGenerated + " kWh");
    }
}

class SolarEnergy extends EnergySource
{
    SolarEnergy(int id, String name, double energy)
    {
        super(id, name, energy);
    }

    void calculateEfficiency()
    {
        double efficiency = (energyGenerated / 5000) * 100;
        display();
        System.out.println("Efficiency: " + efficiency + "%");
    }
}

class WindEnergy extends EnergySource
{
    WindEnergy(int id, String name, double energy)
    {
        super(id, name, energy);
    }

    void calculateEfficiency()
    {
        double efficiency = (energyGenerated / 8000) * 100;
        display();
        System.out.println("Efficiency: " + efficiency + "%");
    }
}

class Main
{
    public static void main(String args[])
    {
        EnergySource e;

        e = new SolarEnergy(101, "Solar Panel", 4000);
        e.calculateEfficiency();

        System.out.println();

        e = new WindEnergy(102, "Wind Turbine", 6000);
        e.calculateEfficiency();
    }
}