public class Human {
    private int age;
    private float weight;
    private float height;
    private boolean isMale;
    private int indexNumber;
    private float feetSize;
    private String name;

    public Human(int age, float weight, float height, boolean isMale, int indexNumber, float feetSize, String name) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.isMale = isMale;
        this.indexNumber = indexNumber;
        this.feetSize = feetSize;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public boolean isMale() {
        return isMale;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public float getFeetSize() {
        return feetSize;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public void setFeetSize(float feetSize) {
        this.feetSize = feetSize;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        Human iAmMarcel = new Human(23, 70, 185, true, 21167, 45, "Marcel");
    }

}


