import java.util.HashSet;

public class CountrySetTest {
    public static void main(String[] args) {
        HashSet<String> countries = new HashSet<String>();
        countries.add("Indonesia");
        countries.add("Japan");
        countries.add("Germany");
        countries.add("Brazil");
        countries.add("Canada");
        countries.add("Indonesia"); // Duplikat, otomatis diabaikan

        System.out.println("Jumlah negara (seharusnya 5, bukan 6): " + countries.size());
        System.out.println("Daftar negara: " + countries);
    }
}