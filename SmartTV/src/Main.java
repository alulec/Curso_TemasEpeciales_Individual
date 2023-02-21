import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TV myTV = new TV("LG", 33);

        myTV.turnOn(true);

        SmartTV mySmartTV01 = new SmartTV("Asus", 45, "5G");
        SmartTV mySmartTV02 = new SmartTV("LG", 15, "3G");
        SmartTV mySmartTV03 = new SmartTV("Toshiba", 25, "5G");
        mySmartTV01.conectar(false);

        ArrayList<SmartTV> myArray = new ArrayList<>();
        myArray.add(mySmartTV01);
        myArray.add(mySmartTV02);
        myArray.add(mySmartTV03);
        System.out.println(myArray);

    }
}