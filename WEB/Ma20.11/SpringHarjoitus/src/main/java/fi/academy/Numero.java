package fi.academy;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 20.11.2017.
 */
@Service
public class Numero {
    private int arvo;

    public int getArvo() {
        return arvo;
    }

    public void setArvo(int arvo) {
        this.arvo = arvo;
    }
    public int getAndIncrement(){
        return arvo++;
    }
}
