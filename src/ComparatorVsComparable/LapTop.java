package ComparatorVsComparable;

public class LapTop implements Comparable<LapTop> {

    private String brand;
    private int ram;
    private  int price;

    public LapTop (String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public String getBrand () {
        return brand;
    }

    public void setBrand (String brand) {
        this.brand = brand;
    }

    public int getRam () {
        return ram;
    }

    public void setRam (int ram) {
        this.ram = ram;
    }

    public int getPrice () {
        return price;
    }

    public void setPrice (int price) {
        this.price = price;
    }

    @Override
    public String toString () {
        return "{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                "}";
    }

    @Override
    public int compareTo (LapTop lapTop) {
        if(this.getRam()>lapTop.getRam()){
            return 1;
        }
        else
            return -1;

        //return this.ram-lapTop.ram;
    }


}
