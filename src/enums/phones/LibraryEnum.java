package enums.phones;

public enum LibraryEnum implements HTTPMethodConvertable{
    FIRST("Google pixel"),SECOND("Huawei"),THIRD("Apple 11 pro");

    String httpMethodType;
    LibraryEnum( String str){
        httpMethodType=str;
    }

    @Override
    public String getHttpMethod () {
        return httpMethodType;
    }
}
