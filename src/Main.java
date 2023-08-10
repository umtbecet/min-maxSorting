import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] valueList = {15,12,788,1,-1,-778,2,0};

        Scanner inp = new Scanner(System.in);
        System.out.println("Dizi: " + Arrays.toString(valueList));

        System.out.println("Bir Sayı Giriniz: ");
        int number = inp.nextInt();
        int min = number;
        int max = number;
        Arrays.sort(valueList);

        System.out.println("Sıralı Dizi: " + Arrays.toString(valueList));

        // En yakın büyük sayıyı

        for(int item: valueList){
            if (item>number){
                max = item;
                break;
            }
        }
        //En yakın kücük sayıyı bulalım.
        for (int i = valueList.length-1; i >= 0; i--) {
            if (valueList[i] < number) {
                min = valueList[i];
                break;
            }
        }
        System.out.println("En yakın büyük sayı :" +max);
        System.out.println("En yakın küçük sayı :" +min);

    }
}



