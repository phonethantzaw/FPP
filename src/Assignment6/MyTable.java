package Assignment6;

public class MyTable {
    private Entry[] entries;

    MyTable() {
        entries = new Entry[26];

    }


    public String get(char c) {
        if (isValidChar(c)) {
            int index = charToIndex(c);
            if (entries[index] != null) {
                return entries[index].toString();
            }
        }
        return null;
    }


    public void add(char c, String s) {
        if (isValidChar(c)) {
            int index = charToIndex(c);
            entries[index] = new Entry(c, s);
        }
    }


    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Entry entry : entries) {
            if (entry != null) {
                result.append(entry).append("\n");
            }
        }
        return result.toString();
    }

    private boolean isValidChar(char c) {
        return c >= 'a' && c <= 'z';
    }

    private int charToIndex(char c) {
        return c - 'a';
    }


    public static void main(String[] args) {
        MyTable t = new MyTable();
        t.add('a', "Andrew");
        t.add('b', "Billy");
        t.add('w', "Willie");
        System.out.println(t);
    }

    private class Entry {
        char c;
        String s;

        Entry(char c, String s) {
            this.c = c;
            this.s = s;
        }

        @Override
        public String toString() {
            return c + " -> " + s;

        }
    }

}
