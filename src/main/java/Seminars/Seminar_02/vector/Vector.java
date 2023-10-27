package Seminars.Seminar_02.vector;

public class Vector {
    double x;
    double y;
    double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     * @return длинну вектора
     */
    public double vectorLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double scalar(Vector twoVector) {
        return x * twoVector.x + y * twoVector.y + z * twoVector.z;
    }

    public Vector vectorPr(Vector vector) {
        return new Vector(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x
                );
    }

    public double vectorCos(Vector vector) {
        return scalar(vector) / (vectorLength() * vector.vectorLength());
     }
}
