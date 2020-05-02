/*
    Author: Marcel Pankanin
    ChemicalElement class implemented in Java
    Date: 28.04.2020

    Usage: you can find element by it name, atomic number or by symbol. Program return
    then details about specific element (name, symbol, atomic number and chemical series(only if belongs to any))
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChemicalElement {
    private List<ChemicalElement> elements;
    private String name;
    private int atomicNumber;
    private String symbol;

    public ChemicalElement(int atomicNumber, String symbol, String name) {
        this.atomicNumber = atomicNumber;
        this.symbol = symbol;
        this.name = name;
    }

    public ChemicalElement() throws IOException {
        elements = new ArrayList<>();
        List<String> list = Files.readAllLines(Paths.get("src/files/data.txt"));
        list.forEach(this::process);

    }

    public static void main(String[] args) throws IOException {
        ChemicalElement table = new ChemicalElement();
        System.out.println(table.findByName("Lithium"));
        //System.out.println(table.findByName("Aluminum"));
        System.out.println(table.findBySymbol("H"));
        System.out.println(table.findByNumber(113));
        System.out.println(table.findByNumber(114));
        System.out.println(table.findByNumber(115));
        System.out.println(table.findByNumber(116));
    }

    private void process(String line) {
        try (Scanner scanner = new Scanner(line)) {
            int atomicNumber = scanner.nextInt();
            String symbol = scanner.next();
            String name = scanner.next();
            elements.add(new ChemicalElement(atomicNumber, symbol, name));
        }
    }

    public ChemicalElement findByName(String name) {
        return elements.stream().
                filter(e -> e.name.equals(name)).
                findFirst().orElse(null);
    }

    public ChemicalElement findByNumber(int atomicNumber) {
        return elements.stream().
                filter(e -> e.atomicNumber == atomicNumber).
                findFirst().orElse(null);
    }

    public ChemicalElement findBySymbol(String symbol) {
        return elements.stream().
                filter(e -> e.symbol.equals(symbol)).
                findFirst().orElse(null);
    }

    public String isAlkali(int atomicNumber) {
        String answer = "";
        if (atomicNumber == 3 || atomicNumber == 11 || atomicNumber == 19
                || atomicNumber == 37 || atomicNumber == 55 || atomicNumber == 87) {
            answer = "It is alkali metal.";
        }
        return answer;
    }

    public String isMetal(int atomicNumber) {
        String answer = "";
        if (atomicNumber == 13 || atomicNumber == 49 || atomicNumber == 50
                || 81 <= atomicNumber && atomicNumber <= 83
                || 113 <= atomicNumber && atomicNumber <= 116) {
            answer = "It is metal.";
        }
        return answer;
    }

    public String isTransition(int atomicNumber) {
        String answer = "";
        if (21 <= atomicNumber && atomicNumber <= 30
                || 39 <= atomicNumber && atomicNumber <= 48
                || 72 <= atomicNumber && atomicNumber <= 80) {
            answer = "It is transition metal.";
        }
        return answer;
    }

    public String toString() {
        return symbol + ": " + name + " "
                + "with atomic number " + atomicNumber + ". "
                + isAlkali(atomicNumber)
                + isMetal(atomicNumber)
                + isTransition(atomicNumber);
    }
}