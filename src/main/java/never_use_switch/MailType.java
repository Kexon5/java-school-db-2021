package never_use_switch;

public enum MailType {
    WELCOME {
        @Override
        void send(String context) {
            System.out.println("Welcome mail was sent " + context);
        }
    }, HB {
        @Override
        void send(String context) {
            System.out.println("Happy Birthdate mail was sent " + context);
        }
    };

    abstract void send(String context);
}
