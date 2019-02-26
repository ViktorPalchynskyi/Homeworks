package base;

public class BasePlayer {
    private String name;
    private int age;
    private int points = 0;
    private int skill;

    public BasePlayer(String name, int age, int skill) {
        this.name = name;
        this.age = age;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }
}
