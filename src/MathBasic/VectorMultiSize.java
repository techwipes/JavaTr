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

    public double scalarOp(VectorMultiSize vector) {
        double result = 0;

        for (int i = 0; i < values.length; i++) {
            result += values[i] * vector.values[i];
        }
        return result;
    }

    // cos between vectors

    public double cos(VectorMultiSize vector) {
        return scalarOp(vector) / (lenght() * vector.lenght());
    }

    // summ of vectors

    public VectorMultiSize add(VectorMultiSize vector) {
        double[] result = new double[values.length];

        for (int i = 0; i < values.length; i++) {
            result[i] = vector.values[i] + values[i];
        }
        return new VectorMultiSize(result);
    }

    // subtract of vectors

    public VectorMultiSize subtract(VectorMultiSize vector) {
        double[] result = new double[values.length];

        for (int i = 0; i < values.length; i++) {
            result[i] = values[i] - vector.values[i];
        }
        return new VectorMultiSize(result);
    }

    // static generator for vector values

    private static double[] generatorRandomArray(int lenght) {
        double[] array = new double[lenght];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    // vector generator
    public static VectorMultiSize[] generate(int n , int dimension){
        VectorMultiSize[] vectors = new VectorMultiSize[n];
        for (int i =0; i<vectors.length; i++){
            vectors[i]= new VectorMultiSize(generatorRandomArray(dimension));
        }
        return vectors;
    }
}
