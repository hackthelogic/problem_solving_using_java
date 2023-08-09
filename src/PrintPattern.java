public class PrintPattern {
    public static void printPattern(int n){
        for(int i=n;i>0;i--){
            for(int j=n;j>0;j--){
                for(int count=i;count>0;count--){
                    System.out.print(j+" ");
                }
            }
            System.out.print("$"+" ");
        }
    }
    public static void main(String[] args){
        printPattern(2);// TO change the arguments value to check the multiple test cases
    }
}
