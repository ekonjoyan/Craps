
/**
 * The Die class.
 *
 * @author Eddie Konjoyan
 * @version 2/6/20
 */
public class Die
{
    // instance variables - replace the example below with your own
    private int dice1;
  

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        dice1= 0;
        
    }

    /**
     * roll method rolls one die
     * @return the value rolled
     */
    public int roll()
    {
        dice1 = (int)(1 + Math.random()*6);
        
        return dice1;
    }
}
