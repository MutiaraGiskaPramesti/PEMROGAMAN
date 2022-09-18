public class PesawatTelpon {
    String microphone, keypad, intercom;

    public void setmicrophone(String microphone) {
        this.microphone = microphone;
    }

    public void setkeypad(String keypad) {
        this.keypad = keypad;
    }

    public void setIntercom(String intercom) {
        this.intercom = intercom;
    }

    public String getmicrophone() {
        return microphone;
    }

    public String getkeypad() {
        return keypad;
    }

    public String getIntercom() {
        return intercom;
    }

    void menelepon(String p) {
        System.out.println("tekan untuk menelepon");
    }
    
    void mengangkat() {
        System.out.println("selamat pagi, dengan siapa ini?");
    }
}