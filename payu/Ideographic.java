import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ideographic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int fNum = sc.nextInt();
        System.out.println("Enter the second number: ");
        int sNum = sc.nextInt();
        System.out.println(ideogrphicSum(fNum, sNum));
//        System.out.println(findNumber(213)); //102
//        System.out.println(findNumber(123)); //102
    }

    public static int ideogrphicSum(int fNum, int sNum){
        int sum=0;
        for(int i=1; i<=fNum; i++){
            sum += (findNumber(i) % sNum);
        }
        return sum;
    }

    public static int findNumber(int i){
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        boolean firstDigit = true;
        int numberOfDigits = numberOfDigits(i);
        if(1==numberOfDigits)
            return 1;
        int result = 0;
        int pow = 1;
        int nextDigit=0;
        while(0!=i){
            int d = i / (int) (Math.pow(10,(numberOfDigits-(pow))));
            if(firstDigit){
                m.put(d,1);
                result = result + (1*(int) (Math.pow(10,(numberOfDigits-(pow)))));
                firstDigit = false;
            }
            else if(null!=m.get(d)) {
                result = result + m.get(d) * (int) (Math.pow(10, (numberOfDigits - (pow))));
            }else{
                result = result + nextDigit * (int) (Math.pow(10, (numberOfDigits - (pow))));
                m.put(d,nextDigit);
                while(m.values().contains(nextDigit)){
                    nextDigit++;
                }
            }
            i = i % (int) (Math.pow(10,(numberOfDigits-(pow))));
            pow++;
        }
        return result;
    }
    public static int numberOfDigits(int num){
        int count = 0;
        while(0!=num){
            num = num/10;
            count++;
        }
        return count;
    }
}
