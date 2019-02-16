package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExcersizeOne {

public static void main(String[] args) {

    Person abe = new Person("a", "jones", 56);
    Person brian = new Person("b", "murph", 32);
    Person mac = new Person("c", "hale", 26);
    Person zach = new Person("d", "albert", 17);

    List<Person> people = new ArrayList<>();
    people.add(new Person("jOE", "jones", 56));
    people.add(abe);
    people.add(brian);
    people.add(mac);

    boolean hasValue = people.contains(abe);

   SortList listSize = (List) -> List.size();
   int hold = listSize.performeList(people);
   ArrayList<String> firstNames = new ArrayList<>();

    for (Person personP:  people) {
        System.out.print(personP.getFirstName() + " ");
        System.out.println(personP.getLastName());
        firstNames.add(personP.getFirstName());
    }

    System.out.println(hasValue);
    Collections.sort(firstNames);
    System.out.println(firstNames);



}

}
