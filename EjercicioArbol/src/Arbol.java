public class Arbol {
    private String commonName;
    private String scientificName;
    private boolean isEndemic;

    public Arbol(String commonName, String scientificName, boolean isEndemic) {
        this.commonName = commonName;
        this.scientificName = scientificName;
        this.isEndemic = isEndemic;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public boolean isEndemic() {
        return isEndemic;
    }

    public void setEndemic(boolean endemic) {
        isEndemic = endemic;
    }

    @Override
    public String toString() {
        return "Arbol{" +
                "commonName='" + commonName + '\'' +
                ", scientificName='" + scientificName + '\'' +
                ", isEndemic=" + isEndemic +
                '}';
    }

    public void photosynthesis(){
        System.out.println("Produciendo oxigeno :3");
    }
}
