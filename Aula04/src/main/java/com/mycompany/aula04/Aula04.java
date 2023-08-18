package com.mycompany.aula04;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Caleb Wacht
 */
public class Aula04 {   
    public static void main(String[] args) {
        List<Caneta> listC = new ArrayList<>();
        Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f);
        Caneta c2 = new Caneta("FABER", "Preto", 1.5f);
        listC.add(c1);
        listC.add(c2);

        for (Caneta c : listC) {
            c.status();
        }
    }
}
