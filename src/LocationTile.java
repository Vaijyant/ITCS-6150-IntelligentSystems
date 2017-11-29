import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

/**
 * @author Vaijyant Tomar
 */
public class LocationTile extends JLabel {
    private int[] location;
    boolean hasObstacle;


    public LocationTile(int[] location){
        this.location = location;
        this.hasObstacle = false;


        //GUI stuff
        Dimension dimension = new Dimension(50, 50);
        setPreferredSize(dimension);
        setMinimumSize(dimension);
        setMaximumSize(dimension);
        setOpaque(true);
        setBackground(Color.WHITE);
        setHorizontalAlignment(CENTER);
        setVerticalAlignment(CENTER);
        /*setFont(new Font("Serif", Font.PLAIN, 5));
        setText("○"); //●*/
    }

    int[] getTileLocation(){
        return location;
    }

    void setHasObstacle(boolean hasObstacle){
        this.hasObstacle = hasObstacle;
        this.setBackground(Color.BLACK);
    }

    boolean hasObstacle(){
        return hasObstacle;
    }
}
