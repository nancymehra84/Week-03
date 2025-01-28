package circular_linked_list.online_ticket_reservation_system;

public class OnlineTicketReservationSystem {
    public static void main(String[] args) {
        OnlineTicketSystem system = new OnlineTicketSystem();

        // Add tickets
        system.addTicket(101, "ABC", "Inception", "A1", "10:00 AM");
        system.addTicket(102, "XYZ", "Interstellar", "B2", "01:00 PM");
        system.addTicket(103, "PQR", "Inception", "C3", "04:00 PM");

        // Display tickets
        system.displayTickets();

        // Search for a ticket
        system.searchTicket("Inception");

        // Remove a ticket
        system.removeTicket(102);

        // Display tickets again
        system.displayTickets();

        // Count total tickets
        System.out.println("Total tickets booked: " + system.countTickets());
    }
}

