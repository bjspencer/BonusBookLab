
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String userTitle;
		String userAuthor;
		String userISBN;
		String choice = "y";
		double userPrice;
		int userNum;
		int sel = -1;
		NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);

		ArrayList<Book> bookList = new ArrayList<>();
		bookList.add(new Book("Green Eggs & Ham", "Dr. Seuss", "5674819309", 9.99));
		bookList.add(new Book("The Miss Nelson Collection", "Allard and Marshall", "0089725276", 15.99));
		bookList.add(new Book("The Cat in the Hat", "Dr. Seuss", "567324152", 9.99));
		bookList.add(new Book("Goodnight Moon", "Margaret Wise Brown", "8372003845", 7.99));
		bookList.add(new Book("The Rainbow Fish", "Marcus Pfister", "7832764923", 12.99));
		bookList.add(new UsedBook("James and the Giant Peach", "Roald Dahl", "98892342", 7.99, "Like New"));
		bookList.add(new UsedBook("The Giver", "Lois Lowry", "8945783221", 4.99, "Good"));
		bookList.add(new UsedBook("Charlotte's Web", "E.B. White", "7784839023", 5.99, "Very good"));

		System.out.println("Welcome to the Book List App!");
		System.out.println();
		userNum = Validator.getInt(scan, "How many books would you like to enter? ");

		for (int i = 0; i < userNum; i++) {
			userTitle = Validator.getString(scan, "Enter the title: ");
			userAuthor = Validator.getString(scan, "Enter the author: ");
			userISBN = Validator.getString(scan, "Enter the ISBN: ");
			userPrice = Validator.getDouble(scan, "Enter the price: ");
			Book newBook = new Book(userTitle, userAuthor, userISBN, userPrice);

			bookList.add(newBook);
		}
		display(bookList);

		do {
			sel = Validator.getInt(scan, "Select a book: ");
			System.out.println();
			System.out.println("You selected: " + "\n" + bookList.get(sel - 1).getTitle());
			System.out.println();
			choice = Validator.getString(scan, "Would you like to buy this book? (y/n)");

			if (choice.equalsIgnoreCase("y")) {
				bookList.remove(bookList.get(sel - 1));
				display(bookList);
			} else
				display(bookList);
		} while (true);
	}

	public static void display(ArrayList<Book> books) {
		for (int i = 0; i < books.size(); i++) {
			System.out.println("Book " + (i + 1) + ": " + books.get(i));
		}
	}
}
