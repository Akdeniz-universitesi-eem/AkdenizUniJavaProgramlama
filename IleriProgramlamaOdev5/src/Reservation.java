
public class Reservation extends Receptionist {
    private String customerName;



    String getCustomerName() {
        return null;
    }

    public String getReservationDetails() {
        return reservationDetails;
    }

    public void setReservationDetails(String reservationDetails) {
        this.reservationDetails = reservationDetails;
    }
    private String reservationDetails;
    private boolean isConfirmed;

    // Constructor
    public Reservation(String reservationDetails, boolean isConfirmed) {
        this.reservationDetails = reservationDetails;
        this.isConfirmed = isConfirmed;
    }


    public boolean isConfirmed() {
        return isConfirmed;
    }

    public void setConfirmed(boolean confirmed) {
        isConfirmed = confirmed;
    }

    public void makePhoneReservation() {
        System.out.println("Telefonla rezervasyon yapıldı.");
    }

    public void makeOnlineReservation() {
        System.out.println("Online rezervasyon yapıldı.");
    }
}

