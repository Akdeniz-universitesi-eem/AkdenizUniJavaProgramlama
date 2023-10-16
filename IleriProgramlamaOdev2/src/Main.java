// Soru 1
/* Aşağıdaki kod çalışmasına rağmen mutlak değeri yanlış almaktadır.
Sebebi ise integer veri tipinin sınırlarıdır. Sorunu düzeltmek için integer veri tipini
long veri tipine çeviririz.

import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        System.out.println(Math.abs(-2147483648));
    }
}
 */
/* Bu yorum satırına bağlı olan kod doğru çalışıyor olan koddur.
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        System.out.println(Math.abs((long)-2147483648));
    }
}
*/

//Soru 2
/* API (Application Programming Interface), yazılım geliştiricilerin bir uygulamanın işlevlerine
erişebilmesini sağlayan bir arayüzdür. API’ler, yazılım geliştiricilerin uygulamalarını diğer
uygulamalarla entegre etmelerine olanak tanır.
Örneğin, bir web sitesi, bir harita servisi API’si kullanarak harita verilerini
web sitesine entegre edebilir.

Kütüphane, yazılım geliştiricilerin tekrar kullanabilecekleri kod parçalarını içeren bir
koleksiyondur. Kütüphaneler, yazılım geliştiricilerin kod tekrarını önlemelerine yardımcı olur
ve yazılım geliştirme sürecini hızlandırır.

MAVEN, Java platformunda kullanılan bir yazılım inşa otomasyonu motorudur. Maven, projelerde
kullanılan kütüphaneleri yönetir ve projeleri derlemek için gerekli olan araçları sağlar.
Maven ayrıca projelerin yapılandırılmasını kolaylaştırır ve projelerin taşınabilirliğini artırır.

Bu araçlar, yazılım geliştirme sürecinde zaman kazandırmak ve kod tekrarını önlemek için önemlidir.
*/

//Soru 3
/* Debug, yazılım geliştirme sürecinde hata ayıklama işlemini ifade eder.
Debug işlemi, yazılımın kaynak kodlarının incelenerek içerisinde yer alan hataların tespiti
ve düzenlenmesi aşamasına verilen bir isimdir.
Debug işlemi sırasında, yazılım geliştiricileri, kodlarını adım adım çalıştırarak
hangi satırda hangi değişkenin değerinin ne olduğunu inceleyebilirler.
Debug işlemi, yazılım geliştiricilerine hataları daha hızlı bir şekilde tespit etme ve
düzeltme imkanı sağlar. Debug edilecek ilgili kod aşağıdadır.
Debug edildiğinde Virtual Machine oluşturur ve
10 kere Merhaba dedikten sonra Virtual Machine'i sonlandırır.

public class Main {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++) {
            System.out.println("Merhaba");
        }
    }
}
 */

//Soru 4
/* import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String sayi1String = JOptionPane.showInputDialog("Birinci sayıyı girin:");
        String sayi2String = JOptionPane.showInputDialog("İkinci sayıyı girin");
// Burada string yazmak zorundna olduğumuz için dialogdan dolayı,
parse ile veri dönüşümü yapmak lazım. Derste anlatılmıştı.
        double sayi1 = Double.parseDouble(sayi1String);
        double sayi2 = Double.parseDouble(sayi2String);

        String[] islemler = {"Toplama", "Çıkarma", "Çarpma", "Bölme"};
        int secim = JOptionPane.showOptionDialog(
                null, "Hangi işlemi yapmak istersiniz?", "İşlem Seçimi", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, islemler, islemler[0]);
//Default_Option kısmında StackOverflow yeterli olmadı ve yapay zekaya sordum.
Onun dışındaki her kısım ile teker teker uğraştım.
        if (secim == -1) {
            JOptionPane.showMessageDialog(null, "Geçersiz seçim.");
            System.exit(0);
        }

        double sonuc = 0;

        switch (secim) {
            case 0:
                sonuc = sayi1 + sayi2;
                break;
            case 1:
                sonuc = sayi1 - sayi2;
                break;
            case 2:
                sonuc = sayi1 * sayi2;
                break;
            case 3:
                if (sayi2 == 0) {
                    JOptionPane.showMessageDialog(null, "Bir sayı sıfıra bölünmez.");
                    System.exit(0);
                } else {
                    sonuc = sayi1 / sayi2;
                }
                break;
        }

        JOptionPane.showMessageDialog(null, "Sonuç: " + sonuc);
    }
} */

//Soru 5

/* import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, sayi3;

        System.out.println("Birinci sayıyı giriniz: ");
        sayi1 = input.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        sayi2 = input.nextInt();

        System.out.println("Üçüncü sayıyı giriniz: ");
        sayi3 = input.nextInt();

        int[] arr = {sayi1, sayi2, sayi3};
        Arrays.sort(arr);

        if (arr[0] == arr[2]) {
            System.out.println(arr[0] + " = " + arr[1] + " = " + arr[2]);
        }
        else if (arr[0] < arr[1] && arr[1] == arr[2]) {
            System.out.println(arr[0] + " < " + arr[1] + " = " + arr[2]);
        }
        else if (arr[0] == arr[1] && arr[1] < arr[2]) {
            System.out.println(arr[0] + " = " + arr[1] + " < " + arr[2]);
        }
        else {
            System.out.println(arr[0] + " < " + arr[1] + " < " + arr[2]);
        }
    }
} */

//Soru 6
/* import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz : ");
        int sayi1 = input.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();

        System.out.println("Üçüncü sayıyı giriniz : ");
        int sayi3 = input.nextInt();

        int ortanca = mid(sayi1, sayi2, sayi3);
        System.out.println("Ortanca sayı: " + ortanca);
    }
//Ayrı bir method olarak yazmak gerektiği için ilk olarak aşağıdaki method yazılmıştır.
    public static int mid(int sayi1, int sayi2, int sayi3) {
        int[] arr = {sayi1, sayi2, sayi3};
        Arrays.sort(arr);
        return arr[1];
    }
} */

//Soru 7
/* import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz : ");
        int sayi = input.nextInt();
        int sonuc = signum(sayi);
        System.out.println(sayi + " için sonuç: " + sonuc);

    }
    public static int signum(int sayi) {
        if (sayi < 0) {
            return -1;
        } else if (sayi > 0) {
            return 1;
        } else {
            return 0;
        }
    }
} */

// Soru 8
/* import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sekil = new Scanner(System.in);
        System.out.print("Bir n sayısı girin: ");
        int n = sekil.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
} */

//Soru 9
/*import java.util.Scanner;
public class Main {
    public static void displayDuration(long seconds) {
        long hours = seconds / 3600;
        long remainingSeconds = seconds % 3600;
        long minutes = remainingSeconds / 60;
        long remainingSeconds2 = remainingSeconds % 60;

        String result = "Süre: ";

        if (hours > 0) {
            result += hours + " Saat ";
        }
        if (minutes > 0) {
            result += minutes + " Dakika ";
        }
        if (remainingSeconds2 > 0) {
            result += remainingSeconds2 + " Saniye";
        }

        if (result.equals("Süre: ")) {
            System.out.println("Süre: 0 saniye");
        } else {
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Saniyeyi giriniz : ");
        long seconds = input.nextInt();
        displayDuration(seconds);
    }
} */

//Soru 10
/* import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı: ");
        int sayi = scanner.nextInt();
        scanner.close();

        System.out.print("Asal Çarpanlar: ");
        asal(sayi);
    }

    public static void asal(int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
    }
} */

//Soru 11
/* import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner desen = new Scanner(System.in);
        System.out.print("Height (satır sayısı) girin: ");
        int height = desen.nextInt();
        System.out.print("Width (karakter aralığı) girin: ");
        int width = desen.nextInt();
        desen.close();

        for (int i = 1; i <= height; i++) {
            System.out.print("|");
            for (int j = 1; j <= width; j++) {
                if (i == j || j == width - i + 1) {
                    System.out.print("*"); //Bu kısımda bir bug var ama çözemedim.
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }
    }
} */

//Soru 12
/* import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cift = new Scanner(System.in);
        System.out.print("Çift Sayı Girin: ");
        int sayi = cift.nextInt();
        cift.close();

        if (sayi % 2 != 0 || sayi <= 2) {
            System.out.println("Geçersiz giriş. Lütfen çift bir sayı girin.");
        } else {
            goldBach(sayi);
        }
    }

    public static boolean asalMi(int sayi) {
        if (sayi <= 1) {
            return false;
        }
        if (sayi <= 3) {
            return true;
        }
        if (sayi % 2 == 0 || sayi % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= sayi; i = i + 6) {
            if (sayi % i == 0 || sayi % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void goldBach(int sayi) {
        for (int i = 2; i <= sayi / 2; i++) {
            if (asalMi(i) && asalMi(sayi - i)) {
                System.out.println(sayi + " = " + i + " + " + (sayi - i));
            }
        }
    }
}

 */
