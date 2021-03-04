//DEREK CAMPBELL
//DLB832
/**
 * Write a description of class TuningCircuit here.
 *
 * @author (Derek Campbell)
 * @version (02/23/2020)
 */
public class TuningCircuit
{
    // instance variables
    private double frequency;
    private double cmin;
    private double cmax;
    private double L;//placeholder
    private double C;//placeholder
    
    /**
     * Constructor for objects of class TuningCircuit
     */
    public TuningCircuit(double _f, double _cmin, double _cmax)
    {
        // initialise instance variables
        frequency = _f;
        cmin = _cmin;
        cmax = _cmax;
        C = Math.sqrt(_cmin * _cmax);
        L = (4 * Math.pow(Math.PI,2)) / (Math.pow(_f,2) * C);
    }

    /**
     * Gets the minimum frequency.
     */
    public double getFMin()
    {
        return frequency = (2*Math.PI) / (Math.sqrt(L * cmax));
    }
    
    /**
     * Gets the maximum frequency.
     */
    public double getFMax()
    {
        return frequency = (2*Math.PI) / (Math.sqrt(L * cmin));
    }
    
}
