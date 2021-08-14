package factoryDesignPattern;

import factoryDesignPattern.phone.Android;
import factoryDesignPattern.phone.IOS;
import factoryDesignPattern.phone.OS;
import factoryDesignPattern.phone.Window;

public class FactoryMain {
    public static OS getOSInstance(String str){
          if(str.equals("window")){
              return new Window();
          }

          else if(str.equals("ios")){
              return new IOS();
          }

          else{
              return new Android();
          }
    }
    public static void main (String[] args) {

        OS os= FactoryMain.getOSInstance("android");
        os.getSpec();

    }
}
