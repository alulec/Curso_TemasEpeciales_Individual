public class SmartTV extends TV{
    private String red;

    public SmartTV(String marca, int pulgadas, String red) {
        super(marca, pulgadas);
        this.red = red;
    }

    public void setRed(String red) {
        this.red = red;
    }

    public String getRed() {
        return red;
    }

    public void conectar(boolean opc){
        if(opc){
            System.out.println("Conectando");
        } else {
            System.out.println("Desconectando");
        }
    }

    @Override
    public String toString() {
        return "SmartTV{" +
                super.toString() + '\'' +
                "red='" + red + '\'' +
                '}';
    }
}
