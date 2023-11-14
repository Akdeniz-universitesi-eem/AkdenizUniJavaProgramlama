import javax.swing.JOptionPane;
import java.util.Random;

public class Hangman {
    public static void main(String[] args) {
        String[] sehirler = {"İstanbul", "Ankara", "İzmir", "Bursa", "Muğla", "Antalya", "Çanakkale", "Hatay", "Kayseri", "Edirne"};
        Random random = new Random();
        int point = 100;
        int totalTime = 0;
        int index = random.nextInt(sehirler.length);
        String chosenCity = sehirler[index];
        String secretWord = chosenCity.replaceAll(".", "_");

        long startTime = System.currentTimeMillis();
        while (point > 0 && !secretWord.equals(chosenCity)) {
            String letter = JOptionPane.showInputDialog("Bir harf girin: ");

            if (letter == null) {
                break;
            }

            if (letter.trim().isEmpty() || !letter.matches("[a-zA-ZöçğıüşÖÇĞİÜŞ]")) {
                JOptionPane.showMessageDialog(null, "Lütfen geçerli bir harf girin!");
                continue;
            }

            if (chosenCity.toLowerCase().contains(letter.toLowerCase())) {
                for (int i = 0; i < chosenCity.length(); i++) {
                    if (chosenCity.toLowerCase().charAt(i) == letter.toLowerCase().charAt(0)) {
                        secretWord = secretWord.substring(0, i) + chosenCity.charAt(i) + secretWord.substring(i + 1);
                    }
                }
            } else {
                point -= 10;
                JOptionPane.showMessageDialog(null, "Yanlış harf! Puanınız: " + point);
            }

            long passingTime = (System.currentTimeMillis() - startTime) / 1000;
            JOptionPane.showMessageDialog(null, "Gizli kelime: " + secretWord + "\nGeçen Süre: " + passingTime + " saniye");

            if (passingTime % 10 == 0) {
                totalTime++;
                point -= 10;
                JOptionPane.showMessageDialog(null, "Süreniz azaldı! Puanınız: " + point);
            }
        }

        if (secretWord.equals(chosenCity)) {
            JOptionPane.showMessageDialog(null, "Tebrikler, kazandınız! Puanınız: " + point);
        } else {
            JOptionPane.showMessageDialog(null, "Kaybettiniz! Doğru kelime: " + chosenCity);
        }
    }
}







// Yanlış yapınca puan düşüyor. Üstüne ilk yirmi saniyeden sonra da her on saniyede bir, puan düşüyor.
// Yani hem zamana karşı yarışıyoruz, hem hata yapmamaya çalışıyoruz.
