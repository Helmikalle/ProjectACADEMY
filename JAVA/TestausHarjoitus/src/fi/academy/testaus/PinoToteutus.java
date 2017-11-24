package fi.academy.testaus;

import fi.academy.harjoitukset.Pino;

import java.util.ArrayList;
import java.util.List;

public class PinoToteutus implements Pino {
    Pino pino;
    List<Integer> pinos = new ArrayList<>();
    int i = 0;

    @Override
    public int size() {
        return pinos.size();
    }
    @Override
    public void push(Object o) {
        pinos.add(0,i);
        i++;
    }

    @Override
    public Object pop() {
        return pinos.remove(pinos.size()-1);
    }

    @Override
    public Object peek() {
        if (pinos.size() == 0) {
            return 0;
        }else {

        }
        return null;
    }

    @Override
    public void clear() {
        pinos.clear();

    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
