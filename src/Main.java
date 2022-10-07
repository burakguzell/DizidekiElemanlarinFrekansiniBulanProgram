import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] counter = new int[list.length];

        System.out.println("Dizi : " + Arrays.toString(list));

        for (int i = 0; i < list.length; i++) {
            counter[i] = 1;
        }
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    counter[i]++;
                }
            }
        }

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    list[j] = 0;
                }
            }
        }
        System.out.println("Tekrar sayıları");
        for (int i = 0; i < list.length; i++) {
            if (counter[i] > 0) {
                if (list[i] != 0)
                    System.out.println(list[i] + " sayisi " + counter[i] + " kere tekrar edildi.");
            }
        }
    }
}
