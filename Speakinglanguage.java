
abstract class Indians {

    public abstract void language();

    public void speak() {
        System.out.println("Telugu");
    }
}


class Andhra extends Indians {
    public void language() {

        System.out.println("Andhra People speak in Telugu ");
    }
}

class Main {
    public static void main(String[] args) {
        Andhra people = new Andhra();
        people.language();
        people.speak();
    }
}