package org.example.judlj_test_sifrovacka.Ciphers;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberCipher implements ICipher {
    ArrayList<Integer> numbers = new ArrayList<>();
    ArrayList<Character> characters = new ArrayList<>();
    @Override
    public String cipher(String str) {
        numbers.clear();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                char c = str.charAt(i);
                numbers.add(Character.getNumericValue(c)-15);
            } else if (Character.isLowerCase(str.charAt(i))) {
                char c = str.charAt(i);
                numbers.add(Character.getNumericValue(c)+87);
            }
        }
        return numbers.toString();
    }

    @Override
    public String decipher(String str) {
        numbers.clear();
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str));
        System.out.println(list.toString());

        for (String S : list) {
            for (int j = 0; j < list.size(); j++) {
                char c = str.charAt(j);
                if (
                        Character.getNumericValue(c) >= 50 &&
                        Character.getNumericValue(c) <= 91
                )
                {
                    characters.add((char) (Character.getNumericValue(c)+15));
                }
                else if (
                        Character.getNumericValue(c) >= 97 &&
                        Character.getNumericValue(c) <= 122
                )
                {
                    characters.add((char) (Character.getNumericValue(c)-87));
                }
            }
        }
        return characters.toString();
    }
}
