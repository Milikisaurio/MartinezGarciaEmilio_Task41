// Emilio Martinez Garcia 2ºCFGS
public class TestVehicle {
    static public void main (String args []) {
        Vehicle myVehicle = new Vehicle (10000);

        System.out.printIn("Creating a truck with "+myVehicle.getMaxLoad()+" Kg");

        System.out.printIn(myVehicle.addbox(900));
        System.out.printIn(myVehicle.addbox(1000));
        System.out.printIn("___________________________");
        System.out.printIn("The total truck load is:"+myVehicle.getMaxLoad()+" Kg");
       }
}
