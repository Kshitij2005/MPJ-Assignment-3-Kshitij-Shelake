class Hillstations {

    void famousFood() {
        System.out.println("Popular food of hill station");
    }

    void famousPlace() {
        System.out.println("Known attractions of hill station");
    }

    public static void main(String[] args) {

        Hillstations ref;

        ref = new Manali();
        ref.famousFood();
        ref.famousPlace();

        ref = new Darjeeling();
        ref.famousFood();
        ref.famousPlace();

        ref = new Ooty();
        ref.famousFood();
        ref.famousPlace();
    }
}

// Subclass 1
class Manali extends Hillstations {

    @Override
    void famousFood() {
        System.out.println("Manali Special: Siddu, Babru");
    }

    @Override
    void famousPlace() {
        System.out.println("Manali Famous For: Snowfall & Adventure");
    }
}

// Subclass 2
class Darjeeling extends Hillstations {

    @Override
    void famousFood() {
        System.out.println("Darjeeling Special: Momos, Thukpa");
    }

    @Override
    void famousPlace() {
        System.out.println("Darjeeling Famous For: Tea Gardens & Sunrise");
    }
}

// Subclass 3
class Ooty extends Hillstations {

    @Override
    void famousFood() {
        System.out.println("Ooty Special: Chocolates & Varkey");
    }

    @Override
    void famousPlace() {
        System.out.println("Ooty Famous For: Hills & Toy Train");
    }
}
