package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.commons.Address;
import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.models.Person;

public class Main {

     public static void main (String [] args) {

        /*
         * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
         */

        Person ivanov = new Person ("Иван"); // создаем ссылки на обьекты иванова и смита 
        Person smith = new Person("John");
        
        Passport ivanovPassportName = new Passport ("Иванов", "Иван", "Иванвич"); //пмещаем в ссылки класса паспорт данные об именах смита и иванова,
        Passport smithPassportName = new Passport ("Smith", "John", null, "Edvard");
        
        ivanov.setPassport(ivanovPassportName);//передаем паспортные имена в ссылки иванова и смита
        smith.setPassport(smithPassportName);
        
        Address addressForIvanov = new Address("RUSSIA", "Saint Petersburg", "Kima", "59", "123", "190000"); // помещяем в сыылки данные об адресах
        Address addressForSmith = new Address("USA", "NY", "Big avenue", "12", "34", "567890");
        
        ivanov.setAddress(addressForIvanov);//передаем адреса в сылки иванова и смита 
        smith.setAddress(addressForSmith);
          

        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */

        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */
        

        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
        System.out.println(ivanov.getFullName() + "\n"  + smith.getFullName() +
                "\n" + ivanov.getAddress() + "\n" + smith.getAddress());
        
    }
}
