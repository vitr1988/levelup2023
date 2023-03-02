package ru.levelup.lesson9;

import ru.levelup.lesson9.dto.PersonDto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializator {

    public static void main(String[] args) {
        PersonDto vitalii = new PersonDto(12L, "Vitalii11", true);
        try(ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
            stream.writeObject(vitalii);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(ObjectInputStream stream = new ObjectInputStream(new FileInputStream("person.dat"))) {
            Object person = stream.readObject();
            System.out.println("Зовут сериализованный объект " + ((PersonDto) person).getName());
            System.out.println("Пол сериализованного объекта " + ((PersonDto) person).isSex());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
