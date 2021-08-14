package enums;

public class Main {

    public static void main (String[] args) {
        Transport tt=Transport.AUTOMOBILE;

        System.out.println("speed is:"+tt.getSpeed());
        Transport[] trans=Transport.values();

        for(Transport mm:trans){
            System.out.println(mm.getSpeed());
        }
    }
}
