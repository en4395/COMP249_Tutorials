package People;

public class Baby extends Person {
    private String name;
    private float ageInMonths;

    public Baby(float ageInMonths) {
        super(Person.generateName());
        this.ageInMonths = ageInMonths;
    }

    @Override
    public void sayHello() {
        super.sayHello();
        System.out.print(" and I am " + ageInMonths + " months old...");
        cry();
    }

    public void cry() {
        System.out.print("WAAAAAAAAAA :,(\n");
    }
}
