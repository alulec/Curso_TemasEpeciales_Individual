public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Automovil miAuto = new Automovil("Taigun", "2023", "azul", "j83y4tuj");

        miAuto.Encender();
        miAuto.Avanzar(15);
        miAuto.Encender();
    }
}