import java.util.List;

public class Receptionist extends HotelManagement {
    public void changeReservation(Reservation existingReservation, Reservation updatedReservation) {
        // Önce var olan rezervasyonun bulunduğundan emin olmaya çalıştım, sonra değişiklik yaptım.
        if (existingReservation != null) {
            // Değişiklik yapılacak rezervasyonun detaylarını güncelledim.
            // Örneğin:
            existingReservation.setReservationDetails(updatedReservation.getReservationDetails());
            System.out.println("Rezervasyon değişikliği başarıyla yapıldı.");
        } else {
            System.out.println("Rezervasyon bulunamadı.");
        }
    }


    private boolean isCancelled;

    public void cancelReservation() {
        if (!isCancelled) {
            isCancelled = true;
            // İptal edildiğine dair işlemler yaptım.
            System.out.println("Rezervasyon iptal edildi.");
        } else {
            System.out.println("Rezervasyon zaten iptal edilmiş.");
        }
    }

    public static Reservation findReservationByName(List<Reservation> reservations, String name) {
        for (Reservation reservation : reservations) {
            if (reservation.getCustomerName().equalsIgnoreCase(name)) {
                return reservation;
            }
        }
        return null; // İsimle eşleşen rezervasyon bulunamadığı için null döndü.
    }}