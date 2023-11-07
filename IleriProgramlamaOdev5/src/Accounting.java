public class Accounting {
    public void receivePayment(ReservationType reservationType, boolean isNewReservation, int checkInCheckOut) {
        double paymentAmount = 0.0;

        // Hesaplama işlemleri
        if (reservationType == ReservationType.PHONE) {
            if (isNewReservation) {
                paymentAmount = 100.0; // Telefonla yeni rezervasyon için ücret
            } else {
                paymentAmount = 50.0; // Telefonla var olan rezervasyon için ücret
            }
        } else if (reservationType == ReservationType.ONLINE) {
            if (isNewReservation) {
                paymentAmount = 80.0; // Online yeni rezervasyon için ücret
            } else {
                paymentAmount = 40.0; // Online var olan rezervasyon için ücret
            }
        }

        // Otel giriş veya çıkış ücreti eklenir
        if (checkInCheckOut == 1) {
            paymentAmount += 20.0; // Giriş ücreti
        } else if (checkInCheckOut == 2) {
            paymentAmount += 10.0; // Çıkış ücreti
        }

        // Muhasebe işlemleri yapılır, örneğin:
        System.out.println("Ödeme alındı: " + paymentAmount + " TL");
    }
}
//Rakamlar farazidir. Örnek olsun diye verilmiştir.