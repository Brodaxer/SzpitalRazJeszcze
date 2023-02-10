import java.util.Arrays;

class Hospital {
    private Person[] people = new Person[3];
    private int occupation = 0;

    public void add(Person person) {
        if (occupation > 2) {
            System.out.println("brak miejsc");
        }else
        people[occupation] = person;
        occupation++;
    }

//    @Override
//    public String toString() {
//        return "Hospital{" +
//                "people=" + Arrays.toString(people) +
//                '}';
//    }
    public String getInfo(){
        String info = "";
        for (Person person:people) {
            info = info + person;

        }return info;
    }
}
