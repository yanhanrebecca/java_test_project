package examination;

public class PClass {
    private String name;
    private String blood;
    private static int count = 0;
    public PClass(String name) {
        this.name = name;
        count ++;
    }

    public PClass(String name, String blood) {
        this.name = name;
        this.blood = blood;
        count ++;
    }

    public void showName() {
        System.out.println(name);
    }

    public void showBlood() {
        System.out.println(blood);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
    public static int getCount() {
        return count;
    }
}