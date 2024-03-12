abstract class Phone {
    abstract void Call();

    abstract void sms();

}

interface Camera {
    void click();

    void Record();
}

interface Music_Player {
    void Play();

    void Pause();

    void Stop();
}

class Smartphone extends Phone implements Camera, Music_Player {
    void Call() {
        System.out.println("In Call");
    }

    void sms() {
        System.out.println("In Msg");
    }

    public void click() {
        System.out.println("Clicked");
    }

    public void Record() {
        System.out.println("Recorded");
    }

    public void Play() {
        System.out.println("Playing");
    }

    public void Pause() {
        System.out.println("paused");
    }

    public void Stop() {
        System.out.println("Stoped");
    }

}

public class lab8_q6 {
    public static void main(String[] args) {
        Smartphone SP1 = new Smartphone();
        SP1.sms();
        SP1.Play();
        SP1.Record();

        Phone P1 = new Smartphone();
        P1.Call();

        Phone P = SP1;
        P.sms();

        Camera C1 = SP1;
        C1.Record();

    }
}
