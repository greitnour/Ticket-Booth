import javax.swing.JOptionPane;

public class TixOrder {
    public void Order{
      String input = JOptionPane.showInputDialog("Enter a name and a quantity seperated by a colon.
                                                  \n Example: Gabbie:3
                                                  \n Enter STOP to end the program.");
      String[] array = input.split(":");

      String name = array[0];
      int tixCount = Integer.parseInt(array[1]);

      //for testing purposes
      System.out.println(name + " " + tixCount);
    }
//Can only get to compile if the remainder of the code is commented out.
//I'll work on getting that fixed tomorrow.
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
