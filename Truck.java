
public class Truck extends Car {
    private int weight;

     

    public Truck(int speed, double regularPrice, String color, int weight){
        super(speed, regularPrice,color);
        this.weight = weight;
    }

   
    
    public  int getweight() {
        return weight;
    }

    public void setweight(int weight) {
        this.weight = weight;
    }
     public double getsalePrice(){
        return super.getsalePrice() *(weight > 2000 ? 0.90:0.80);
    }
}
