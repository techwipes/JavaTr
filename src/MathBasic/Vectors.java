package MathBasic;


// class for vector 3-x coordinates(x,y,z).
public class Vectors {
    double x;
    double y;
    double z;

    public Vectors(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // method for calculating vector's lenght
    public double vectorLenght() {
        double result = Math.sqrt(x * x + y * y + z * z);
        return result;
    }

    // calculating scalar op. (x1x2+y1y2+z1z2)
    public double scalarOp(Vectors vector) {
        double result = x * vector.x + y * vector.y + z * vector.z;
        return result;
    }

    // calculating vector's op (y1z2 - z1y2, z1x2 - x1z2, x1y2 - y1x2)
    public Vectors vectorOp(Vectors vector) {
        return new Vectors(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x
        );
    }

    // calculating cos between vectors (a*b)/|a|*|b|

    public double cosVectors(Vectors vector) {
        return scalarOp(vector) / (vectorLenght() * vector.vectorLenght());
    }

    // calculating summ vectors
    public Vectors add(Vectors vector) {
        return new Vectors(
                x + vector.x,
                y + vector.y,
                z + vector.z
        );
    }

    // calculating vector's subtraction
    public Vectors subtract(Vectors vector) {
        return new Vectors(
                x - vector.x,
                y - vector.y,
                z - vector.z
        );
    }

    // static generator for array with Vectors
    public static Vectors[] generate(int n) {
        Vectors[] VectorsArray = new Vectors[n];
        for (int i = 0; i < VectorsArray.length; i++) {
            VectorsArray[i] = new Vectors(Math.random(), Math.random(), Math.random());
        }
        return VectorsArray;
    }

    @Override

    public String toString() {
        return "Vector{" + "x=" + x + ", y=" + y + ", z=" + z + "}";
    }

}


class VectorsTest {
    public static void main(String[] args) {
        Vectors[] VectorsArray = Vectors.generate(20);
        System.out.println(VectorsArray[0]);
        System.out.println(VectorsArray[1]);
        System.out.println(VectorsArray[0].vectorLenght());
        System.out.println(VectorsArray[0].scalarOp(VectorsArray[1]));
        System.out.println(VectorsArray[0].cosVectors(VectorsArray[2]));

    }
}
