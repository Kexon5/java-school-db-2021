package never_use_switch;


import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class MailSender {

    public void send(MailInfo mailInfo) {
        //todo refactor this to beautiful code
        mailInfo.getMailType().send(mailInfo.getContext());
    }
}