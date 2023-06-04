public class Data {
    private Integer[] intArray;
    private Double[] doubleArray;
    private Character[] charArray;

    public Data(Integer[] intArray, Double[] doubleArray, Character[] charArray) {
        this.intArray = intArray;
        this.doubleArray = doubleArray;
        this.charArray = charArray;
    }

    public Integer[] getIntArray() {
        return intArray;
    }

    public Double[] getDoubleArray() {
        return doubleArray;
    }

    public Character[] getCharArray() {
        return charArray;
    }
}