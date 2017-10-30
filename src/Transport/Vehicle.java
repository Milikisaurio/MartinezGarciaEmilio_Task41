package Transport;

public class Vehicle{
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
        return true;
    }
    else{
        return false;
    }
}