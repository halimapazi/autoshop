
public class Ford extends Car {
    private int year;
    private int manufactureDiscount;

     

    public Ford(int speed, double regularPrice, String color, int year, int manufactureDiscount){
        super(speed, regularPrice,color);
        this.year = year;
        this.manufactureDiscount = manufactureDiscount;
    }

    
    public int getyear() {
        return year;
    }

    public void setyear(int year) {
        this.year = year;
    }


    public int manufactureDiscount() {
        return manufactureDiscount;
    }

    public void setmanufactureDiscount(int manufactureDiscount) {
        this.manufactureDiscount = manufactureDiscount;
    }

    public double getsalePrice(){
        return super.getsalePrice()- manufactureDiscount;
    }

}