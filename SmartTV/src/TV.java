public class TV {
    private String marca;
    private int pulgadas;
    public TV(String marca, int pulgadas) {
        this.marca = marca;
        this.pulgadas = pulgadas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void turnOn(boolean opc){
        if(opc){
            System.out.println("Television encendida");
        } else {
            System.out.println("Televison apagada");
        }
    }

    @Override
    public String toString() {
        return "marca='" + marca + '\'' +
                ", pulgadas=" + pulgadas ;
    }
}
