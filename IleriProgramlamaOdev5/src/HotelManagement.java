public class HotelManagement {
    public void checkInOut(int checkInCheckOut) {
        if (checkInCheckOut == 1) {
            performCheckIn();
        } else if (checkInCheckOut == 2) {
            performCheckOut();
        } else {
            System.out.println("Geçersiz işlem. Lütfen 1 (Giriş) veya 2 (Çıkış) seçeneğini kullanın.");
        }
    }

    private void performCheckIn() {
        // Giriş işlemleri
        System.out.println("Otele giriş işlemi gerçekleştirildi.");
    }

    private void performCheckOut() {
        // Çıkış işlemleri
        System.out.println("Otel çıkış işlemi gerçekleştirildi.");
    }


    private ReservationType reservationType;

    public ReservationType getReservationType() {
        return reservationType;
    }

    public void makeNewReservation(ReservationType reservationType) {
        if (reservationType == ReservationType.PHONE) {
            // Telefonla rezervasyon yapılacak işlemler
            System.out.println("Telefonla yeni rezervasyon yapıldı.");
        } else if (reservationType == ReservationType.ONLINE) {
            // Online rezervasyon yapılacak işlemler
            System.out.println("Online yeni rezervasyon yapıldı.");
        } else {
            System.out.println("Geçersiz rezervasyon tipi.");
        }
    }
}
