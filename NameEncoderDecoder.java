public class NameEncoderDecoder {
    public String encode(String name) {
        String name1 = name
                           .replace("e", "1")
                           .replace("u", "2")
                           .replace("i", "3")
                           .replace("o", "4")
                           .replace("a", "5");
      return "NOTFORYOU" + name1 + "YESNOTFORYOU";
    }
    public String decode(String name) {
        String name2 = name
                           .replace("1", "e")
                           .replace("2", "u")
                           .replace("3", "i")
                           .replace("4", "o")
                           .replace("5", "a");
        return name2.substring(9, name2.length()-12);
    }
public static void main(String[] args) {
    NameEncoderDecoder call = new NameEncoderDecoder();
    String encodedName = call.encode("Crab");
    System.out.println("encode(Crab) = " + encodedName);
    
    String decodedName = call.decode("NOTFORYOUCr5bYESNOTFORYOU");
    System.out.println("decode (NOTFORYOUCr5bYESNOTFORYOU) = " + decodedName);

}
  
}