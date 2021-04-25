
interface Indians {
    public void language();
    public void speak();
}


class Andhra implements Indians {
    public void language() {
        
        System.out.println("Andhra People speak in Telugu");
    }
    public void speak() {

        System.out.println("Telugu");
    }
}

class Main {
    public static void main(String[] args) {
        Andhra people = new Andhra();
        people.language();
        people.speak();
    }
}
