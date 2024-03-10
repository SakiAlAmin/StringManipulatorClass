public class StringManipulatorClass3 {
    // This Function checks whether a string is palindrome or not
    public boolean isPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // Compare the cleaned string with its reverse
        return cleanedStr.equals(new StringBuilder(cleanedStr).reverse().toString());
    }

    // This Function removes unnecessary spaces from the string
    public String removeExtraSpaces(String str) {
        return str.replaceAll("\\s+", " ").trim();
    }
}
