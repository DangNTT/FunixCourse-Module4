import java.lang.annotation.Retention;
import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Pig");
        list.add("Cat");
        list.add("Dog");
        list.add("Bear");
        System.out.println("Cac phan tu cua List la :");
        System.out.println(list);
        System.out.println(list.indexOf("Dog"));
    }
}
