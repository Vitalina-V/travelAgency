public class Main {
    public static void main(String[] args) {
        Klient klient = new Klient("Anna", "Petrenko", 28);
        System.out.println("New klient is " + klient.getName()+ " " + klient.getSurName());
    }
}
