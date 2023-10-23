//Soru 1
/*Yazılım geliştirme sürecinde farklı türlerde hatalar meydana gelebilmektedir.
Bu hatalar, farklı aşamalarda ortaya çıkabilmektedir. Bazı hata türleri şunlardır:
Sözdizimi Hataları (Syntax Errors): Bu tür hatalar, programın yazım kurallarına uymadığında
meydana gelir. Örneğin, eksik parantezler, noktalı virgül eksikliği veya tanımlanmamış
değişkenler gibi sözdizimi hataları, kodun derlenmesine ve çalıştırılmasına engel olur.
Mantıksal Hatalar (Logical Errors): Bu hatalar, kodun mantığına aykırı çalışan hatalardır.
Kod yazılırken yapılan mantıksal hatalar, kodun beklenen şekilde çalışmasına engel olur.
İstisnalar ve Hata Yakalama (Exceptions and Error Handling): İstisnalar, beklenmedik durumları
işlemek için kullanılmaktadır. İstisna yönetimi eksik veya yanlış yapıldığında, uygulama çöker
ve beklenmedik sonuçlar üretilir. Bu yüzden de kod çalışmaz.
Bellek Hataları (Memory Errors): Bellek sızıntıları veya taşmalar gibi hatalar, uygulamanın
bellek yönetimi hataları sebebiyle ortaya çıkabilir. Bu tür hatalar, programın performansını
düşürür ve çökmesine yol açar.
Veritabanı Hataları (Database Errors): Veritabanı işlemleri sırasında izin eksikliği,
veritabanı bağlantı sorunları veya sorgu hataları gibi hatalar meydana gelir.
Bu da uygulamanın veritabanıyla iletişimini etkiler.
Ağ Hataları (Network Errors): Ağla ilgili hatalar, sunucu bağlantı sorunları, ağ trafiği
sıkışmaları veya ağ güvenliği eksiklikleri gibi sebeplerden ötürü meydana gelir.
En az hata ile kod yazmak için ise bazı süreçlere dikkat edilmelidir.
İyi bir planlama süreci sayesinde hataları erken aşamalarda tespit edebiliriz.
Kod incelemesi, başka bir geliştirici tarafından kodumuzun gözden geçirilmesi, potansiyel
hataları ve iyileştirmeleri tespit etmede etkili bir yöntemdir. Böylelikle farklı bakış
açılarından da yararlanmış oluruz.Test otomasyonu ve sürekli entegrasyon (CI) sayesinde
hataları kod yazım aşamasında hızlıca yakalarız. İyi belgeleme, kodumuzu ve işlevlerinizi
açıkça tanımlamanıza ve gelecekteki hataları daha kolay tespit etmemizi sağlar.Düzgün kodlama
standartlarına uymak yani Clean kod prensiplerine uymak, kodun okunabilirliğini artırır ve
hataları azaltır. Hata izleme(debug) ve raporlama, üretim sırasında meydana gelen hataları
izlemek ve hızlıca müdahale etmek için önemlidir. Güvenlik testleri, potansiyel güvenlik
açıklıklarını tespit etmek ve önlem almak için kritik bir adımdır.
Hatalardan tamamen kaçınmak mümkün olmayabilir, ancak bu önlemler hataları minimize etmeye
ve yazılımımızın güvenilirliğini artırmaya  epey bir miktarda yardımcı olur.
 */

//Soru 2
/*
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int firstRandomNumber = random.nextInt(6) + 1;
        int secondRandomNumber = random.nextInt(6) + 1;

        String imageDirectory = "C:\\Users\\gktng\\IdeaProjects\\IleriProgramlamaOdev3\\src\\";

        JFrame frame = new JFrame("Dice Simulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(1, 2));

        // First Dice
        ImageIcon firstImage = new ImageIcon(imageDirectory + firstRandomNumber + ".jpeg");
        JLabel firstLabel = new JLabel(firstImage);
        frame.add(firstLabel);

        // Second Dice
        ImageIcon secondImage = new ImageIcon(imageDirectory + secondRandomNumber + ".jpeg");
        JLabel secondLabel = new JLabel(secondImage);
        frame.add(secondLabel);

        frame.setVisible(true);
    }
}
*/

//Soru 3
/*
import javax.swing.JOptionPane;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int randomInt = rand.nextInt(100) + 1;

        boolean gameContinue = true;
        int predictionNum = 0;

        while (gameContinue) {
            try {
                String predictionStr = JOptionPane.showInputDialog("1-100 arasında bir sayı tahmin edin: ");
                int prediction = Integer.parseInt(predictionStr);

                predictionNum++;

                if (prediction == randomInt) {
                    JOptionPane.showMessageDialog(null, "Tebrikler! " + prediction + " sayısını " + predictionNum + " tahminde buldunuz.");
                    gameContinue = false;
                } else if (prediction < randomInt) {
                    JOptionPane.showMessageDialog(null, "Daha yüksek bir sayı deneyin.");
                } else {
                    JOptionPane.showMessageDialog(null, "Daha düşük bir sayı deneyin.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Geçerli bir sayı girin.");
            }
        }
    }
} */

//Soru 4
/*
public class Main {
    public static void main(String[] args) {
        for (int abc = 100; abc <= 999; abc++) {
            int cba = Integer.parseInt(new StringBuilder(String.valueOf(abc)).reverse().toString());
            int ab = abc / 10;
            int bc = abc % 100;
            int cb = cba / 10;
            int ba = cba % 100;

            if (cba > abc && isPrime(abc) && isPrime(cba) && isPrime(ab) && isPrime(bc) && isPrime(cb) && isPrime(ba)) {
                System.out.println(abc);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
*/

//Soru 5
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();
        boolean result = isPrimeX(number);
        System.out.println("Sonuç: " + result);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }

    public static boolean isPrimeX(int num) {
        while (num >= 10) {
            if (!isPrime(num)) {
                System.out.println(num + " asal değil.");
                return false;
            }
            System.out.println(num + " asal.");
            num = sumOfDigits(num);
        }
        System.out.println(num);
        return isPrime(num);
    }
}
*/