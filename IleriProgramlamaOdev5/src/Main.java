//Soru 1
/*
UML, Birleşik Modelleme Dili anlamına gelmektedir.Yazılım ve sistem tasarımında kullanılan bir standart
modelleme dili ve gösterim şeklidir.Takım çalışması için oldukça önemlidir.UML, standartlaşmış bir yapı
olduğundan dolayı, dili bilenler tarafından okunur ve aynı şekilde yorumlanır.Yazılımlardaki bugları
azaltmaya yarar.
UML’nin davranış diyagramları, etkileşim diyagramları ve yapısal diyagramlar olmak üzere üç ana kısımdan
oluşmaktadır.

Davranış Diyagramları,bir sistemin davranışını göstermek için kullanılır. Davranış diyagramları,
bir nesnenin durumlarını, olaylarını ve geçişlerini gösterir. Davranış diyagramları içerisinde
durum makinesi diyagramı, faaliyet diyagramı, zincirleme diyagramı ve zamanlama diyagramı bulunur

Etkileşim Diyagramları, nesnelerin birbirleriyle nasıl etkileşime girdiğini gösteren bir diyagramdır.
Etkileşim diyagramları, sistem davranışını anlamak için kullanılır. Bunlar arasında sıralama diyagramları
ve iletişim diyagramları bulunur

Yapısal Diyagramlar,bir sistemin yapısını göstermek için kullanılır. Yapısal diyagramlar, bir sistemin
bileşenlerini ve aralarındaki ilişkileri gösterir. Yapısal diyagramlar arasında sınıf diyagramı,
bileşen diyagramı, nesne diyagramı, birleşik yapı diyagramı, dağıtım diyagramı, paket diyagramı ve profil
diyagramı bulunur.


Örneğin;
Sınıf diyagramları, bir sistemin sınıflarını ve aralarındaki ilişkileri göstermek amacıyla kullanılır.
Mesela, bir banka sistemi için sınıf diyagramı, müşteriler, hesaplar, kredi kartları ve diğer bileşenleri
gösterir.
Sıralama diyagramları, bir sistemin işleyişini göstermek amacıyla kullanılır. Mesela, bir ATM’de para çekme
işlemi gerçekleştirildiğinde, sıralama diyagramı, kullanıcının kartını yerleştirmesi, PIN kodunu girmesi,
para miktarını seçmesi ve para çekme işleminin tamamlanması gibi adımları gösterir.
Bileşen Diyagramı: Bileşen diyagramları, bir sistemin bileşenlerini ve aralarındaki ilişkileri göstermek
amacıyla kullanılır. Mesela, bir web uygulaması için bileşen diyagramı, sunucular, veritabanları,
kullanıcı arabirimleri ve diğer bileşenleri gösterir.


 */

//Soru 2
/*
Java’da ArrayList, LinkedList, HashMap ve HashSet, farklı amaçlar için kullanılan veri yapılarıdırlar.
ArrayList,dinamik bir dizi olarak düşünülebilir. Elemanları sıralı bir şekilde depolar ve her elemanın bir
indeksi vardır. Eleman ekleme ve çıkarma işlemleri, dizinin sonuna veya başına eklenerek yapılabilir.
Elemanların erişimi hızlıdır, ancak eleman ekleme ve çıkarma işlemleri yavaştır. Genellikle, elemanların
sıralı bir şekilde depolanması gerektiğinde kullanılır. Python veya C’deki Array’ler olarak da düşünülebilir.
LinkedList, elemanları birbirine bağlı bir liste olarak depolar. Her eleman, kendisinden önceki ve kendisinden
sonraki elemanların referansını tutar. Eleman ekleme ve çıkarma işlemleri hızlıdır, ancak elemanların erişimi
yavaştır. Genellikle, elemanların sıralı bir şekilde depolanması gerekmediğinde kullanılır.
C’deki Pointer’lar olarak da düşünülebilir.
HashMap,anahtar-değer çiftlerini depolar. Her anahtarın bir değeri vardır ve her anahtar benzersizdir.
Eleman ekleme ve çıkarma işlemleri hızlıdır ve elemanların erişimi de hızlıdır. Genellikle, bir anahtarın
değerine hızlı bir şekilde erişilmesi gerektiğinde kullanılır. Python’daki Dictionary yapıları gibi
düşünülebilir.
HashSet,benzersiz elemanları depolar. Eleman ekleme ve çıkarma işlemleri hızlıdır ve elemanların erişimi
de hızlıdır. Genellikle, benzersiz elemanların depolanması gerektiğinde kullanılır. Python’daki Küme kavramı
gibi de düşünülebilir.

*/

//Soru 3 OtelRezervasyon classının içinde bulunmaktadır.

//Soru 4
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir yazı giriniz: ");
        String input = scanner.nextLine();
        String output = changeCase(input);
        System.out.println("Değiştirilmiş yazı: " + output);
    }

    public static String changeCase(String input) {
        StringBuilder strbui = new StringBuilder(input.length()); // StringBuilder, String'in aksine değiştirilebilir olduğu için daha rahat.
        for (char c : input.toCharArray()) { //Char yaptık çünkü harf harf değiştiriyoruz.
            if (Character.isUpperCase(c)) {
                strbui.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                strbui.append(Character.toUpperCase(c));
            } else {
                strbui.append(c);
            }
        }
        return strbui.toString();
    }
}
*/

//Soru 5
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci yazıyı giriniz: ");
        String input1 = scanner.nextLine();
        System.out.print("İkinci yazıyı giriniz: ");
        String input2 = scanner.nextLine();
        String output = squeeze(input1, input2);
        System.out.println("Değiştirilmiş yazı: " + output);
    }

    public static String squeeze(String input1, String input2) {
        StringBuilder strbui = new StringBuilder(input1.length());
        for (char c : input1.toCharArray()) {
            if (input2.indexOf(c) == -1) {
                strbui.append(c);
            }
        }
        return strbui.toString();
    }
}
//Kodu test ederken fark edilen ufak bir tespit, büyük harf ve küçük harf farklı karakter sayıldığı için küçük hali silinse de büyük harfi kalıyor.

 */