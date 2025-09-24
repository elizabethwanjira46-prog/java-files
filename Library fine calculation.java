//program to compute library fine calcution
//Name: Elizabeth Wanjira
// REG NO: S08-8408-2024
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LibraryFineCalculation {
    public static void main(String[] args) {
        Scanner  = new Scanner(System.in);
        DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");

        // Input
        System.out.print("Enter Book ID: ");
        String bookID = sc.nextLine();

        System.out.print("Enter Due Date (yyyy-mm-dd): ");
        String dueDateStr = scanner.nextLine();
        LocalDate dueDate = LocalDate.parse(dueDateStr, formatter);

        System.out.print("Enter Return Date (yyyy-mm-dd): ");
        String returnDateStr = scanner.nextLine();
        LocalDate returnDate = LocalDate.parse(returnDateStr, formatter);

        // Calculate days overdue
        long daysOverdue = ChronoUnit.DAYS.between(dueDate, returnDate);

        int fineRate = 0;
        long fineAmount = 0;

        if (daysOverdue > 0) { // Only charge if overdue
            if (daysOverdue <= 7) {
                fineRate = 20;
            } else if (daysOverdue <= 14) {
                fineRate = 50;
            } else {
                fineRate = 100;
            }
            fineAmount = fineRate * daysOverdue;
        }

        // Output
        System.out.println("\n--- Library Fine Details ---");
        System.out.println("Book ID: " + bookID);
        System.out.println("Due Date: " + dueDate);
        System.out.println("Return Date: " + returnDate);
        System.out.println("Days Overdue: " + daysOverdue);
        System.out.println("Fine Rate (per day): Ksh. " + fineRate);
        System.out.println("Total Fine Amount: Ksh. " + fineAmount);

        scanner.close();
    }
}
