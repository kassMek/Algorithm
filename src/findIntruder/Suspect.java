package findIntruder;

public class Suspect {


    public static int getCountOfIntruder( String ciphered , String suspect){
          int count=0;
            char ch=Character.toLowerCase(suspect.charAt(0));
            int len=ciphered.length();
             String extracted="";
            for( int i=0;i<len;i++){

                if(Character.toLowerCase(ciphered.charAt(i))==ch){
                    extracted=ciphered.substring(i,i+suspect.length());
                    if(extracted.equalsIgnoreCase(suspect)){
                        count++;
                    }
                }

                if(ciphered.substring(i).length()<suspect.length()){
                    break;
                }

            }

          return count;

    }

    public static void main(String[] args) {

        String st1="heydawitrvomiedawithuDawit";
        String st2="DawiT";
        System.out.println(getCountOfIntruder(st1,st2));

    }
}
