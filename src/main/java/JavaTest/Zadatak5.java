package JavaTest;

public class Zadatak5 {
    public static void main(String[] args) {
        String tekst1 = "Ovaj deo je bold";
        String tekst2 = "ovo je italic";
        String tekst3 = "Naravno samo je falio paragraf";
        System.out.print(formatiranje(tekst1 , "bold"));
        System.out.println(", a " + formatiranje(tekst2 , "italic"));
        System.out.print(formatiranje(tekst3 , "paragraph"));
    }
    public static String formatiranje(String tekst, String format){
        if(format.equals("bold")){
            String formatiranTekstBold = "<b>" + tekst + "</b>";
            return formatiranTekstBold;
        } else if (format.equals("italic")) {
            String formatiranTekstItalic = "<em>" + tekst + "</em>";
            return formatiranTekstItalic;
        } else if (format.equals("paragraph")) {
            String formatiranTekstParagraph = "<p>" + tekst + "</p>";
            return formatiranTekstParagraph;
        } else return tekst;
    }
}
