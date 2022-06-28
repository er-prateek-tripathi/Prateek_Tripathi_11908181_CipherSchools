import java.util.*;

public class libraryMenu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("<----L I B R A R Y _ M E N U---->\n");
        System.out.println("\n**Please Use one of the options provided below : **\n\n");
        System.out.println("OPTION 1--ADD BOOK INFORMATION\n" +
                "OPTION 2--DISPLAY BOOK INFORMATION\n" +
                "OPTION 3--LIST ALL BOOKS OF GIVEN AUTHOR \n" +
                "OPTION 4--LIST THE COUNT OF BOOKS IN THE LIBRARY\n" +
                "OPTION 0--EXIT\n");
        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();

        int bookCnt = 0;
        switch(choice){
            case 1:
                System.out.println("Please Enter the name of the Books and The name of of its Author.\n Book Name");
                String bookName = sc.nextLine();
                System.out.println("\nAuthor Name : ");
                String authorName = sc.nextLine();
                bookCnt++;
                break;
            case 2:

        }
    }
}
