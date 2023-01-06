
public class Sedan extends Car {
    private int length;
    

     public Sedan(int speed, double regularPrice, String color, int length){
        super(speed, regularPrice,color);
        this.length = length;
    }


     

    

    
    public  int length() {
        return length;
    }

    public void setlength(int length) {
        this.length = length;
    }

    

    public double getsalePrice(){
        return super.getsalePrice()*(length< 20 ? 0.95:0.90);
    }

}