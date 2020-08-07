import javax.swing.JOptionPane;

public class TixOrder {

    String input = JOptionPane.showInputDialog("Enter a name and a quantity seperated by a colon.
                                                \n Example: Gabbie:3
                                                \n Enter STOP to end the program.");
    String[] array = input.split(":");

    private String name = array[0];
    private int tixCount = array[1];

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
