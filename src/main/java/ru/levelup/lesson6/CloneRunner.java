package ru.levelup.lesson6;

public class CloneRunner {
    public static void main(String[] args) throws Exception {
        CloneExample cloneExample = new CloneExample(11, false, "Text");
        CloneExample anotherCloneExample = (CloneExample) cloneExample.clone();

        System.out.println(anotherCloneExample);
        System.out.println("Сравнению по ссылке:" + (cloneExample == anotherCloneExample)); //сравниваем сами объекты
        System.out.println(cloneExample.getExample() == anotherCloneExample.getExample());//сравниваем поля этих объекты

        System.out.println("Сравнению по значению:" + cloneExample.equals(anotherCloneExample));

//        CloneExample example = null;
//        System.out.println(example.equals(cloneExample));
    }
}
