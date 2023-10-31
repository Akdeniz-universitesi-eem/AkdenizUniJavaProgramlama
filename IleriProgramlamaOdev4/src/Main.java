//Soru 1
/* Unit Test, bir yazılımın en küçük birimlerinin tek başına test edilmesidir. Bu birimler,
bir fonksiyon, bir fonksiyonun içindeki küçük bir iş yapan kod bloğu veya bir class olabilir.
Yani, bir yazılım birimini (genellikle bir fonksiyonu) alır ve bu birimin beklenen
girdi ile beklenen çıktıyı üretip üretmediğini kontrol eder.
Bu testler, kodun doğruluğunu sağlamak, hata ayıklamak ve daha büyük ölçekli testlerin
(entegrasyon testleri gibi) güvenle yürütülmesini sağlamak için kullanılır.

Kodun doğru çalıştığından emin olmak,kodda yapılan değişikliklerin mevcut kodu bozmadığından
emin olmak,kodun bakımını kolaylaştırmak,kodun daha iyi tasarlanmasını sağlamak gibi sebeplerden
ötürü Unit Test uygulamak oldukça işleri kolaylaştırır.

Unit Test'i en verimli kullanmak adına dikkat edilmesi gereken faktörlere baktığımızda ise
test edilen kısımların diğer kısımlardan bağımsız olması,hızlı çalışabilmesi ve
çabuk sonuçlar vermesi yani iyi performans vermesi,okunaklı, anlaşılabilir ve sürdürebilir
olması, tekrarlanabilir olması ve işlevsel olması gibi faktörlerden bahsedebiliriz.

Bilinen Unit Test Frameworklerinden bazıları şunlardır:
JUnit (Java)
NUnit (.NET)
PHPUnit (PHP)
PyUnit ve PyTest (Python)
Mocha (Javascript)
RSpec (Ruby)
Check (C)
*/

//Soru 2
/* Tasarım desenleri, yazılım geliştirme sürecinde karşılaşılan yaygın problemlere yönelik
genellikle tekrar eden,basit ve etkili çözümleri sağlayan kanıtlanmış çözüm yaklaşımlarını
tanımlar.Bu desenler, genellikle belirli bir probleme karşı bir çözüm sunar ve
yazılım geliştirme sürecine destek olur.Her bir tasarım deseni belirli bir durumu ele almak
için kullanılır ve genellikle belirli bir soruna özgüdür.

Üç ana tipi vardır:
Creational Patterns,Structural Patterns,Behavioral Patterns.

Bunlardan Creational yani Yaratımsal Desenler için iki örnek verecek olursak;
Singleton Pattern: Bu kalıp, yalnızca bir örneği olan bir sınıf oluşturmak için kullanılır.
Örneğin, bir dosya sistemi üzerinde yalnızca bir tek yönetici olabilir.
Factory Pattern: Bu kalıp, nesne oluşturma işlemini alt sınıflara devreder.
Örneğin, farklı tip belgelere sahip bir belge editöründe belge oluşturma işlevini düşünebiliriz.

Bunlardan Structural yani Yapısal Desenler için iki örnek verecek olursak;

Adapter Pattern: Bu kalıp, farklı arayüzleri olan sınıfları bir araya getirmek ve birbiriyle
uyumlu çalıştırmak için kullanılır.Örneğin, bir üçüncü parti kütüphanenin kendi sisteminize
entegre/adapte edilmesi.
Decorator Pattern: Nesnelere dinamik olarak sorumluluk ekler. Örneğin, bir resim düzenleme
programında efekt eklemek.

Bunlardan Behavioral yani Davranışsal Desenler için iki örnek verecek olursak;
Observer Pattern: Bu kalıp, nesneler arasındaki bağımlılıkları azaltmak için kullanılır.
Bir nesnedeki değişiklikleri takip ederek diğer nesneleri otomatik olarak günceller.Örneğin,
bir alışveriş sitesinde bir ürüne indirim yapıldığında kullanıcılarınıza e-mail ile haber
verilir iken bu kalıp kullanılabilir
Strategy Pattern: Farklı algoritmaları sınıflandırır ve kullanıcıya seçim olanağı sağlar.
Örneğin, bir oyun içerisinde farklı karakterlerin farklı saldırı stratejilerini seçmek.
*/

//Soru 3
/*
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String password = JOptionPane.showInputDialog("Şifrenizi girin:");
        if (password == null) {
            JOptionPane.showMessageDialog(null, "Şifre girmediniz."); //Çarpıya tıkladığımızda null atıyor.
        } else if (password.length() < 8 || password.length() > 95) {
            JOptionPane.showMessageDialog(null, "Şifre en az 8 karakter olmalı ve 95 karakterden uzun olmamalıdır.");
            main(args); //Tekrar Main'i çağırarak recursive fonksiyon haline getiriyoruz.
        } else if (!password.matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(null, "Şifre en az bir sayı içermelidir.");
            main(args);// \\d dediği şey tüm sayılar, Java'da bulunuyor. C'de de %d kullanıyorduk.
        } else if (!password.matches("\\S+")) {
            JOptionPane.showMessageDialog(null, "Şifrenin başında veya sonunda boşluk karakterleri olmamalıdır.");
            main(args); // \\S dediği şey Space, Java'da bulunuyor.
        } else if (!password.matches(".*[a-zA-Z].*")) {
            JOptionPane.showMessageDialog(null, "Şifre en az bir harf içermelidir.");
            main(args);
        } else if (!password.matches(".*[!@#\\$%\\^&\\*\\(\\)_\\-\\+=\\{\\}\\[\\]\\|;:'\",\\.\\<\\>/\\?].*")) {
            JOptionPane.showMessageDialog(null, "Şifre en az bir özel karakter içermelidir.");
            main(args); // Burada, !, = gibi özel karakterler aynı zamanda yazılımda da anlamlı olduğu için \\! , \\= şeklinde yazılıyor
        } else {
            JOptionPane.showMessageDialog(null, "Şifre geçerlidir!");
        }
    }
}
*/

//Soru 4
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double e = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("n kaç olsun?");
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            e += 1.0 / factorial(i); //Bunu 1.0 yapmamın tek sebebi, e'nin double olması.
        }
        System.out.println("e = " + e);
    }
//Normalde n'i arttırmak virgülden sonraki sayının hassasiyetini arttırmaya yarar.
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1); //Bu bir Recursive Fonksiyon.
        }
    }
}
//Yani kısaca e= 2,7 diyebiliriz ve bu şekilde de teyit etmiş oluruz kodumuzu.

*/

//Soru 5
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) { //Burada <= yerine > yaptığımız için bir son çarpanı almıyor
            if (n % i == 0) {
                sum += sumFactors(i);
            }
        }
        System.out.println("Tüm çarpanların toplamı: " + sumFactors(n));
    }

    public static int sumFactors(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
} */

//Soru 6.1(Genel Fonksiyonu kurma kısmı)
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İki tamsayı girin: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (areFriends(x, y)) {
            System.out.println(x + " ve " + y + " arkadaş sayılardır.");
        } else {
            System.out.println(x + " ve " + y + " arkadaş sayı değillerdir.");
        }
    }

    public static int sumFactors(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean areFriends(int x, int y) {
        return sumFactors(x) == y && sumFactors(y) == x;
    }
}
*/

//Soru 6.2(Dört basamaklı sayılarla test etme kısmı)
/*
public class Main {
    public static void main(String[] args) {
        for (int x = 1000; x < 10000; x++) {
            for (int y = x + 1; y < 10000; y++) {
                if (areFriends(x, y)) {
                    System.out.println(x + " ve " + y + " arkadaş sayılardır.");
                }
            }
        }
    }


    public static int sumFactors(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean areFriends(int x, int y) {
        return sumFactors(x) == y && sumFactors(y) == x;
    }
}
*/

//Soru 7a
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tamsayı girin: ");
        int n = scanner.nextInt();
        if (isPerfect(n)) {
            System.out.println(n + " mükemmel sayıdır.");
        } else {
            System.out.println(n + " mükemmel sayı değildir.");
        }
    }

    public static int sumFactors(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPerfect(int n) {
        return sumFactors(n) == n;
    }
}
*/

//Soru 7b
/*
public class Main {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            if (isPerfect(i)) {
                System.out.println(i + " mükemmel sayıdır.");
            }
        }
    }

    public static int sumFactors(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPerfect(int n) {
        return sumFactors(n) == n;
    }

}
*/