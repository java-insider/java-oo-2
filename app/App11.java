package app;

import record.Person;
import record.PersonRecord;

public class App11 {

    public static void main(String[] args) {

        Person person = new Person("José", "Silva", 30);
        System.out.println(person);

        PersonRecord personRecord = new PersonRecord("José", "Silva", 30);
        System.out.println(personRecord);
        System.out.println(personRecord.firstName());

        PersonRecord personRecord2 = new PersonRecord("José", "Silva", 30);
        System.out.println(personRecord2.equals(personRecord));

        PersonRecord personRecord3 = new PersonRecord("José", "Silva");
        System.out.println(personRecord3);
        System.out.println(personRecord3.fullName());

        PersonRecord personRecord4 = PersonRecord.create("Pedro");
        System.out.println(personRecord4);
    }
}
