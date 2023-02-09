package ru.levelup.lesson3;

public class StringExample {

    public static void main(String[] args) {
        String value = "Это \t стр\\ока \n \"" + 100;
        String text = """
                gsf,lgsf,gsfl; 
                gsfgs gfsggdsgs
                gdsgsgsf
                gdsfgsgsgs gsfgsggsf gds
                """;
        System.out.println(text);
        System.out.println(value);
        System.out.println("Длина " +  value.length());
//        System.out.println("Это строка 100" == "Это строка " + 100);
        System.out.println(value.indexOf("к"));
    }
}
