package minilab;

public class RadioAlarm implements Radio, Alarm{
    @Override
    public void a() {
        System.out.println("Йа метод А и йа работаю");
    }

    @Override
    public void b() {
        System.out.println("Йа метод B и йа работаю");
    }

    @Override
    public void c() {
        System.out.println("Йа метод C и йа работаю");
    }

    @Override
    public void d() {
        System.out.println("Йа метод D и йа работаю");
    }

    public static void main(String[] args) {
        RadioAlarm radioAlarm = new RadioAlarm();
        radioAlarm.a();
        radioAlarm.b();
        radioAlarm.c();
        radioAlarm.d();
    }
}
