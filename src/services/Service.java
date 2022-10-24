package services;

import java.io.IOException;
import java.text.ParseException;

public interface Service {
    public void display();

    public void add() throws ParseException, IOException;

}
