/*
Write a Java program to create an interface Sortable with a method sort() that sorts an array of integers in ascending
order. Create two classes BubbleSort and SelectionSort that implement the Sortable interface and provide their own
 implementations of the sort() method.
 */

interface Sortable{
    int []arr= {4,8,2,6,7};
    void sort();
}
class BubbleSort implements Sortable{
    int temp;
    public void sort(){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
}


class SelectionSort implements Sortable{
    int min;

    public void sort(){
        for(int i=0;i<arr.length;i++){
            min=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(min>arr[j]){
                    min=arr[j];
                }
                arr[i]=min;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }


}

public class sortablearr{
    public static void main(String [] args){
        System.out.print("The arr before sorting is :");
        for(int i=0;i<Sortable.arr.length;i++){
            System.out.print(" "+Sortable.arr[i]);
        }
        System.out.println();
        Sortable s1 = new BubbleSort();
        Sortable s2 = new SelectionSort();
        System.out.println("The sorted array due to Bubble sort :");
        s1.sort();

        System.out.println("The sorted array due to Selection sort :");
        s2.sort();
    }
}
