package twoDimensionalArray;

public class StringLiteralVsStringObject {
    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();
         for(int i=0;i<10000;i++){
             String s1 = "GeeksForGeeks";
             String s2 = "Welcome";
         }
       long end1=System.currentTimeMillis();
        long total_time1 = end1 - start1;
       // System.out.println("Time using String literals:"+total_time1);


        long start2 = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            String s3 = new String ("GeeksForGeeks");
            String s4 = new String("Welcome");
        }

        long end2=System.currentTimeMillis();
        long total_time2 = end1 - start1;
        //System.out.println("Time using String Object:"+total_time2);

        String s1 = "abcde";
        String s2 = new String("abcde");
        String s3 = "abcde";

        System.out.println(s1==s2);
        System.out.println("comparing objects?:"+s1.equals(s2));
        System.out.println(s1==s3);


    }
}
