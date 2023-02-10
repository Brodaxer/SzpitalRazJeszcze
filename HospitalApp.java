class HospitalApp {
    public static void main(String[] args) {
        Person doc = new Doctor("lol","dow",123555,111);
        Person nurs = new Nurse("dog","nog",23444,12);
        Person nurs2 = new Nurse("dog","nog",23444,12);

        Hospital hospital = new Hospital();
        hospital.add(doc);
        hospital.add(nurs);
        hospital.add(nurs2);
        hospital.getInfo();
        System.out.println(hospital.getInfo());
        System.out.println(hospital);
    }
}
