package immutableClass;

public  final class Test {
    private final int id;
    private final String name;
    private final Engine engine;

    public Test (int id, String name, Engine e) {
        this.id = id;
        this.name = name;
        Engine newEngine= new Engine(e.speed);
        this.engine = newEngine;

    }

    public int getId () {
        return id;
    }

    public String getName () {
        return name;
    }

    public static void main (String[] args) {
        Engine e = new Engine(50);
        Test tt = new Test(1, "Kassahun", e);
        e.speed=80;
        System.out.println(tt.id);
        System.out.println(tt.name);
        System.out.println(tt.engine.speed);

    }
}
