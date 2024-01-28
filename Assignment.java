public class Assignment {
    public static void main(String[] args) {
        float price =9.9f;
        int round =0;

        round = (int) price;
        System.out.println("Price in Integer : " + round);
        
        String priceAsString = null;


        priceAsString = Float.toString(price);
        System.out.println("Price as String :" +priceAsString);
        System.out.println("instanceof String : " + priceAsString instanceof String);

        int number = 0;
        float priceAsFloat;
        priceAsFloat = Float.parseFloat(priceAsString);
        number = (int) priceAsFloat;
        System.out.println("Cast String as Number :" +number);

    }
}