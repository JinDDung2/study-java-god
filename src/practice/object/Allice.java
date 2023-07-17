package practice.object;

public class Allice implements Witness{

    private String name;

    public Allice() {}

    public Allice(String name) {
        this.name = name;
    }

    @Override
    public void enter() {
        System.out.printf("%s 입장합니다!%n", this.name);
    }

    @Override
    public void testifying() {
        System.out.printf("%s 증언하겠습니다! brrrrrrr!%n", this.name);
    }

    @Override
    public String getWitnessName() {
        return this.name;
    }
}
