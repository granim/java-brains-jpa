package lambdas;

import java.util.*;

public class ExcersizeOne {

public static void main(String[] args) {

    //inilize people objects
    Person abe = new Person("c", "jones", 56);
    Person brian = new Person("z", "murph", 32);
    Person mac = new Person("Mac", "hale", 26);
    Person zach = new Person("Micheal", "albert", 17);
    //initializ people list and add persons objects to people list
    List<Person> people = new ArrayList<>();
    people.add(abe);
    people.add(brian);
    people.add(mac);
    people.add(mac);
    people.add(zach);

    //Lambda expression
 /*   SortList listSize = (List) -> List.size();
    int hold = listSize.performeList(people);*/

    //New list of first Names
    ArrayList<String> firstNames = new ArrayList<>();

    //Loop thru the people list and find the firstNames add to firstName ArrayList
    for (Person personP:  people) {
        System.out.print(personP.getFirstName() + " ");
        System.out.println(personP.getLastName());
        firstNames.add(personP.getFirstName());
    }

    boolean hasValue = firstNames.contains("z");
    //Print all the statements
    System.out.println(hasValue);
    Collections.sort(firstNames);
    Collections.sort(people);
    System.out.println(firstNames);
    System.out.println(people);

    //Create a hashMap with FirstName Key and LastName Value
    Map<String, String> NamesMap = new TreeMap<>();
    for(Person personP: people) {
        NamesMap.put(personP.getLastName(), personP.getFirstName());
    }
    System.out.println(NamesMap.get("murph") + " NamesMap");

    String fakeInput = "hale";

    //Look thru HashMap to find the input lastName
    for(String fName: NamesMap.keySet()) {
        if(fName.contains(fakeInput)) {
            System.out.println(NamesMap.get(fName) + " Print fakeInput");
        }
    }

    //Traverse the entire HashMap
    for(Map.Entry<String, String> entry: NamesMap.entrySet()) {
        System.out.print(entry.getKey() + ", ");
        System.out.println(entry.getValue());
    }

    Set<Person> setOfPeople = new HashSet<>();
    setOfPeople.add(abe);
    setOfPeople.add(mac);
    setOfPeople.add(mac);

    for(Person test: setOfPeople) {
        System.out.println(test + " Test??");
    }

}

}
