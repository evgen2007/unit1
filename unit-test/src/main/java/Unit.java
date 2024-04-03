import java.util.HashMap;

public class Unit {
    private String name;
    private int health = 100;
    private HashMap<ResTypes, Integer> resources;

    private Unit() {
    }

    public Unit(String name) {
        setName(name);
        this.resources = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException();
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health<0 || health>100) {return;}
        this.health = health;
    }

    public HashMap<ResTypes, Integer> getResources() throws NullPointerException
    {
        return new HashMap<ResTypes, Integer>(this.resources);
    }

    public void setResources(ResTypes resType, int val) {
        if (val<0) {throw new IllegalArgumentException();}
        this.resources.put(resType, val);
    }
    public void doVoice() {
        System.out.println("I am " + this.name);
    }


}
