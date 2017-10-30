// Emilio Martínez García 2ºCFGS
package Transport;
// Clase Vehicle y attrs.
public class Vehicle{
    // maxLoad = peso máximo del vehículo
    // getLoad = carga del vehículo
    private double maxLoad;
    private double load;
    
    public Vehicle (double maxLoad){
        this.maxLoad = maxLoad;
    }
    public double getLoad(){
        return load;
    }
    public double getMaxLoad(){
        return maxLoad;
    }
    public boolean addBox(double weight){
        if (weight + this.load < this.maxLoad)
            this.load = weight + this.load;
            System.out.printIn("We add a "+weight+" Kg box.");
        return true;
    }
    else{
        return false;
    }
}
