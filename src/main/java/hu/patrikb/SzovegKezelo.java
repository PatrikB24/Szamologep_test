package hu.patrikb;

public class SzovegKezelo {

    public static String megfordit(String szoveg){
        if (szoveg == null){
            throw new IllegalArgumentException("üres!");
        }
        return new StringBuilder(szoveg).reverse().toString();
    }

    public static boolean isPalindrom(String szoveg){
        if (szoveg == null){
            throw new IllegalArgumentException("üres!");
        }
        szoveg = szoveg.replaceAll("\\s", "");
        return szoveg.equals(megfordit(szoveg));
    }
}
