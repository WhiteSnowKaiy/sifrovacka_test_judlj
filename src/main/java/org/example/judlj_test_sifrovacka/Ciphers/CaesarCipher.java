package org.example.judlj_test_sifrovacka.Ciphers;

public class CaesarCipher implements ICipher {
    StringBuilder sb = new StringBuilder();

    @Override
    public String cipher(String str) {
        if (!sb.isEmpty()){ sb.delete(0, sb.length()); }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                c+=1;
                sb.append(Character.toUpperCase(c));
            } else {
                c+=1;
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }

    @Override
    public String decipher(String str) {
        if (!sb.isEmpty()){ sb.delete(0, sb.length()); }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                c-=1;
                sb.append(Character.toUpperCase(c));
            } else {
                c-=1;
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }
}
