import java.util.Scanner;

public class InsertionSortByStep {
    public static void insertionSortByStep(int[] list){
        for(int i = 1; i<list.length;i++){
            int currentElement = list[i];
            int k;
            for( k = i-1;k>=0 && list[k]>currentElement;k--){
                list[k+1]=list[k];
            }
            list[k+1]=currentElement;
            System.out.println("List after"+i+"' sort:");
            for(int j =0;j<list.length;j++){
                System.out.println(list[j]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size list:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter elements list:");
        for(int i =0; i<list.length;i++ ){
            list[i]= scanner.nextInt();
        }
        System.out.println("List Before Sort:");
        for(int i =0; i<list.length;i++){
            System.out.println(list[i]);
        }
        System.out.println("Begin sort processing...");
        insertionSortByStep(list);
    }
}
