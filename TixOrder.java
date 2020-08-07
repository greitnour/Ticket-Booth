public class TixOrder {

    private String name;
    private int tixCount;

    public TixOrder (String name, int tixCount){
        this.name = name;
        this.tixCount = tixCount;
    }

    public String getName() {
        return name;
    }

    public int getTixCount() {
        return tixCount;
    }

}