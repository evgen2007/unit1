public class MainApp {
    public static void main(String[] args) {
        Unit u1 = new Unit("ork1");
        System.out.println(u1.getName());
        u1.doVoice();
        System.out.println("-------------");
        u1.setResources(ResTypes.GOLD, 15);
        System.out.println(u1.getResources());
        u1.getResources().put(ResTypes.EAT, 10);
        System.out.println(u1.getResources());
    }
}
