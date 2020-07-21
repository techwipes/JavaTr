package MathBasic;


// class for vector 3-x coordinates(x,y,z).
public class Vectors {
    double x;
    double y;
    double z;

    public Vectors (double x ,double y,double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // method for calculating vector's lenght
    public double vectorLenght(){
        double result = Math.sqrt(x * x + y * y + z * z );
        return result;
    }

    // calculating scalar op. (x1x2+y1y2+z1z2)
    public double scalarOp (Vectors vector){
        double result = x * vector.x + y * vector.y + z * vector.z;
        return result;
    }

    // calculating vector's op
}
