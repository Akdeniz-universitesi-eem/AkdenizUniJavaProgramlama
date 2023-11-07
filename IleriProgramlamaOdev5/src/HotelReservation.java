//Soru 3
public class HotelReservation {
    public static void main(String[] args) {
        // Uygulama başlatılır.

        // Customer sınıfından bir müşteri oluşturuldu.
        new Customer("Ahmet", "ahmet@example.com", "1234567890");

        // ReservationType enum'ı kullanıldı.
        ReservationType reservationType = ReservationType.PHONE;

        // HotelManagement sınıfı üzerinden rezervasyon yapılacak ve işlemler gerçekleştirilecek.
        HotelManagement hotel = new HotelManagement();
        hotel.makeNewReservation(reservationType);
        hotel.checkInOut(1); // Örnek olarak giriş işlemi yapıldı.

        // Accounting sınıfı üzerinden ödeme alınacak.
        Accounting accounting = new Accounting();
        accounting.receivePayment(reservationType, true, 1); // Örnek olarak ödeme alındı
    }
}

