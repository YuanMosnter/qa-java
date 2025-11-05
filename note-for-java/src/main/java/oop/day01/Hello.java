package oop.day01;

import java.util.ArrayList;
import java.util.List;

public interface Hello {
    void hello();
}

interface  Person extends Hello{
    void run();
    String getName();
}

 class Main {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
    }
}