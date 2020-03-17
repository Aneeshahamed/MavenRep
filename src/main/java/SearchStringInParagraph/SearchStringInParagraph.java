package SearchStringInParagraph;

public class SearchStringInParagraph {

	public static void main(String[] args) {
		String word = "table";
		String text = "The cat is on the table";
		Boolean found;

		found = text.contains(word);
		System.out.println("Present or not ? = "+found);

	}

}
