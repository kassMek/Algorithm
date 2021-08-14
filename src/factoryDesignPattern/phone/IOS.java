package factoryDesignPattern.phone;

public class IOS implements OS{
    @Override
    public void getSpec () {
        System.out.println("Most secured OS");
    }
}
