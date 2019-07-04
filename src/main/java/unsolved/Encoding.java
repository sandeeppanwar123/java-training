package unsolved;

public class Encoding {

    public static void main(String[] args) {
        String text = "sandeep";
        String encoded = encode(text);

        System.out.println(encoded);




    }

    private static String decode(String str)
    {
        StringBuilder encoded = new StringBuilder();
        StringBuilder sb = new StringBuilder(str);
        sb = sb.reverse();
        for (int i = 0; i <str.length()  ; ) {
         encoded.append(sb.charAt(i+2));

         i = i+2;
        }
        return encoded.toString();
    }

    private static String encode(String text) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            System.out.println(c);
           System.out.println(c += c + i);
        }
        return b.reverse().toString();
    }
}
