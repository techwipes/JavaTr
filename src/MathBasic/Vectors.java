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

    // calculating vector's op (y1z2 - z1y2, z1x2 - x1z2, x1y2 - y1x2)
    public Vectors vectorOp(Vectors vector){
        return new Vectors(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x
        ) ;
    }

    // calculating cos between vectors (a*b)/|a|*|b|

    public double cosVectors(Vectors vector){
        return scalarOp(vector) / (vectorLenght() * vector.vectorLenght());
    }


}
