import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] books = new int[10];
        for (int i = 0; i < books.length; i++) {
            books[i] = ((int)(Math.random()*10));

        }
        System.out.println("Полиця з книгами :"+Arrays.toString(books));

        int[] sortBooks = insertionSort(books);
        System.out.println("Полиця з посортованими книгами :"+Arrays.toString(sortBooks));
    }
    public static int[] insertionSort(int[] books){
        int i ,j, newBooks;
        for (i = 1; i < books.length; i++){
            newBooks = books[i];
            j = i;
            while (j>0&& books[j-1] > newBooks) {
                books[j] = books[j-1];
                j--;
            }
            books[j] = newBooks;
        }
        return books;
    }
}