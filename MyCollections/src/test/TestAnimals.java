package test;

/**
 * This is a test class
 */
public class TestAnimals {

    private final String name;
    private final int legsCount;
    private final String arial;


    public TestAnimals(String name, int legsCount, String arial) {
        this.name = name;
        this.legsCount = legsCount;
        this.arial = arial;
    }

    public String getName() {
        return name;
    }

    public int getLegsCount() {
        return legsCount;
    }

    public String getArial() {
        return arial;
    }


}
