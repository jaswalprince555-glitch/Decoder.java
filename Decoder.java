public class Decoder {
    public static void main(String[] args){
        //go to creat a binary liter
        int a = 0b1010;
        // go to creat a hexadecimal literal
        int b = 0xff;
        // go to creat a octal literal
        int c = 010;
       // sun of all the a ,b,c 
       char symbol = '\u0024';

        int totalMask  = a+b+c;
       System.out.println("TotalMask:" + totalMask);
       System.out.println("symbol:" + symbol);
       
    




    }

} 
