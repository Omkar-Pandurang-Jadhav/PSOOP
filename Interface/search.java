// Interface Searchable with a method search()
interface Searchable {
    boolean search(String text, String word);
}

// Class Document implementing the Searchable interface to search for a word in a text document
class Document implements Searchable {
    // Method to search for a word in a text document
    public boolean search(String text, String word) {
        // Convert text to lowercase for case-insensitive search
        text = text.toLowerCase();
        word = word.toLowerCase();

        // Perform search
        return text.contains(word);
    }
}

// Class WebPage implementing the Searchable interface to search for a number in a web page
class WebPage implements Searchable {
    // Method to search for a number in a web page
    public boolean search(String text, String number) {
        // Perform search
        return text.contains(number);
    }
}

public class search {
    public static void main(String[] args) {
        // Sample text document
        String documentText = "Java is a programming language.";

        // Sample web page content
        String webpageContent = "<html><body>12345</body></html>";

        // Creating instances of Document and WebPage
        Document document = new Document();
        WebPage webpage = new WebPage();

        // Searching for a word in the document
        String wordToSearch = "Java";
        boolean wordFoundInDocument = document.search(documentText, wordToSearch);
        System.out.println("Word '" + wordToSearch + "' found in document: " + wordFoundInDocument);

        // Searching for a number in the web page
        String numberToSearch = "123";
        boolean numberFoundInWebPage = webpage.search(webpageContent, numberToSearch);
        System.out.println("Number '" + numberToSearch + "' found in web page: " + numberFoundInWebPage);
    }
}
