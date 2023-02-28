public class Seat {
    private int noSeat;
    private int row;
    private int colummn;
    private float price;
    private boolean isReserved = false;
    private String description;

    public Seat(int noSeat, int colummn, int row, float price, String description) {
        this.noSeat = noSeat;
        this.row = row;
        this.colummn = colummn;
        this.price = price;
        this.description = description;
    }

    public Seat() {
    }

    public int getNoSeat() {
        return noSeat;
    }

    public void setNoSeat(int noSeat) {
        this.noSeat = noSeat;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColummn() {
        return colummn;
    }

    public void setColummn(int colummn) {
        this.colummn = colummn;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "No. " + this.noSeat + '\'' +
                " Is reserved: " + this.isReserved + '\'' +
                " Price: " + this.price + '\'' +
                " Position:"  + this.colummn + "/" + this.row + '\'' +
                " Description: " + this.description + '\'' +
                "}";
    }
}
