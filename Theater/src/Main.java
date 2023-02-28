import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String material01 = "lore who say a description of the seat";
        String material02 = "lore diferent who say a diferent description";
        int row = 1;
        int colummn = 1;
        Seat aux;
        HashMap<Integer, Seat> seats = new HashMap<Integer, Seat>(80);



        for (int i = 1; i <= 80; i++) {
            if(i<=32){
                aux = new Seat(i, colummn, row, 10, material01);
            } else {
                aux = new Seat(i, colummn, row, 6, material02);
            }
            seats.put(i, aux);

            colummn++;
            if (colummn==9) {
                colummn = 1;
                row++;
            }
        }

        //System.out.println(seats.toString());
        System.out.println(seats.get(1).toString());
        System.out.println(seats.get(32).toString());
        System.out.println(seats.get(33).toString());
        System.out.println(seats.get(80).toString());
        seats.get(1).setReserved(true);
        seats.get(32).setReserved(true);
        seats.get(33).setReserved(true);
        seats.get(80).setReserved(true);
        System.out.println(seats.get(1).toString());
        System.out.println(seats.get(32).toString());
        System.out.println(seats.get(33).toString());
        System.out.println(seats.get(80).toString());
    }
}