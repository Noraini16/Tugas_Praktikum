import java.math.BigInteger;

class even_odd {
    public static boolean odd(BigInteger i){
        return i.testBit(0);
    }

    public static void main(String[] args) {
        BigInteger[] test_case = {new BigInteger("1"), new BigInteger("2"), new BigInteger("3"), new BigInteger("123124235"), new BigInteger("43641235436236"), new BigInteger("2634645856295803463"), new BigInteger("138246093486289507235"), new BigInteger("32894702358729356237598275"), new BigInteger("1928309127482365834759870"), new BigInteger("10927389015678329650198364076302576"), new BigInteger("109749283652093786523"), new BigInteger("5"), new BigInteger("1"), new BigInteger("7"), new BigInteger("4"), new BigInteger("2390975189365823765"), new BigInteger("2839572803652780356"), new BigInteger("9840912370928365726"), new BigInteger("983407629365028765"), new BigInteger("23870592863508726"), new BigInteger("38267502983640187365"), new BigInteger("8974309857239857235"), new BigInteger("238970918635280375235"), new BigInteger("283657235689236502365"), new BigInteger("325896209867203765023523"), new BigInteger("2385720698270498732535"), new BigInteger("2835720938572093857209835726"), new BigInteger("235872098375209385723985235")};
        for (BigInteger i : test_case) {
            if (odd(i)) {
                System.out.println(i+" Adalah bilangan ganjil");
            }
            else {
                System.out.println(i+" Adalah bilangan genap");
            }
        }
    }
}