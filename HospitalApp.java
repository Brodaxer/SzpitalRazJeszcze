class HospitalApp {
    public static void main(String[] args) {
        Person doc = new Doctor("lol","dow",123555,111);
        Person nurs = new Nurse("dog","nog",23444,12);
        Person nurs2 = new Nurse("cwlk","nblok",33344,132);

        Hospital hospital = new Hospital();
        hospital.add(new Doctor("lol","dow",123555,111)); //tyz dziala
        hospital.add(nurs);
        hospital.add(nurs2);

        System.out.println(hospital.getInfo());

    }
}
