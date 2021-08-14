package enums.phones;

public enum ClientEnum implements HTTPMethodConvertable{
     huawei("huawei OS"),apple("ios"),google("android one");

     String operatingSystem;

    ClientEnum(String str){
        operatingSystem=str;
    }
    @Override
    public String getHttpMethod () {
        return operatingSystem;
    }
}
