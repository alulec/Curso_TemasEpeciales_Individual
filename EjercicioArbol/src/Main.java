import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Arbol tree01 = new Arbol("Pino", "Podocarpus Nagi", false);
        Arbol tree02 = new Arbol("Cerezo", "Prunus Avium", false);
        Arbol tree03 = new Arbol("Jacaranda", "Jacaranda mimosifolia", false);
        Arbol tree04 = new Arbol("Cipres de Guadalupe", "Cupressus Guadalupensis", true);

        ArrayList<Arbol> trees = new ArrayList<>();
        trees.add(tree01);
        trees.add(tree02);
        trees.add(tree03);
        trees.add(tree04);

        System.out.println(trees.toString());
    }
}