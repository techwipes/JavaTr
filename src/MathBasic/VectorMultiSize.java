package MathBasic;

public class VectorMultiSize {

    private double values[]; // you can do more than three coordinates

    public VectorMultiSize(double values[]) {
        this.values = values;
    }

    // vector's lenght
    public double lenght() {
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i] * values[i];
        }
        return Math.sqrt(sum);
    }

    // scalar op.(product)
    public double scalarOp(VectorMultiSize vector){
        double result = 0;

        for (int i = 0; i < values.length; i++){
            result += values[i] * vector.values[i];
        }
        return result;
    }

    // cos between vectors
    public double  cos(VectorMultiSize vector){
        return scalarOp(vector)/(lenght() * vector.lenght());
    }
}
