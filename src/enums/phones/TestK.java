package enums.phones;

import java.util.ArrayList;
import java.util.List;

public class TestK {

    public static void main (String[] args) {
        List<HTTPMethodConvertable> inherit=new ArrayList<>();
          inherit.add(LibraryEnum.FIRST);
          inherit.add(ClientEnum.google);
          //inherit.add(LibraryEnum.SECOND);
          for(HTTPMethodConvertable hh:inherit){
              System.out.println(hh.getHttpMethod());
          }
    }
}
