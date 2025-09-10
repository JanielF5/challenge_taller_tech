
public class CountAndSay {
    public static void main(String[] args) throws Exception {
        int position1 = 1;
        int position5 = 5;

        System.out.println(generateElementGivenAPosition(position1));
        System.out.println(generateElementGivenAPosition(position5));

    }

    public static String generateElementGivenAPosition(int position) {
        String element = "1";
        for(int i = 1; position > i; i++) {
            element = generateNextSequenceElement(element);
        }
        return element;
    }

    private static String generateNextSequenceElement(String element) {

        String elementAsString = String.valueOf(element);
        var result = new StringBuilder();
        int counter = 1;
        for (int i = 1; i < elementAsString.length(); i++) {
            if (elementAsString.charAt(i) == elementAsString.charAt(i - 1)) {
                counter++;
            } else {
                result.append(counter).append(elementAsString.charAt(i - 1));
                counter = 1;
            }
        }
        result.append(counter).append(elementAsString.charAt(elementAsString.length() - 1));
        return result.toString();
    }

}