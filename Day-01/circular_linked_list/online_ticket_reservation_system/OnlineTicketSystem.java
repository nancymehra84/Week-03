package circular_linked_list.online_ticket_reservation_system;

class OnlineTicketSystem{
    static class TicketNode {
        int ticketId;
        String customerName;
        String movieName;
        String seatNumber;
        String bookingTime;
        TicketNode next;

        // Constructor
        public TicketNode(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
            this.ticketId = ticketId;
            this.customerName = customerName;
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.bookingTime = bookingTime;
            this.next = null;
        }
    }
    private TicketNode last;

    // Add a new ticket reservation at the end of the circular list
    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        TicketNode newNode = new TicketNode(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (last == null) {
            last = newNode;
            last.next = last; // Circular link
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
        System.out.println("Ticket added: Ticket ID " + ticketId + " for " + customerName);
    }

    // Remove a ticket by Ticket ID
    public void removeTicket(int ticketId) {
        if (last == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        TicketNode current = last.next;
        TicketNode prev = last;

        // Traverse the list to find the ticket
        do {
            if (current.ticketId == ticketId) {
                if (current == last && current.next == last) {
                    // Only one ticket in the list
                    last = null;
                } else {
                    if (current == last) {
                        last = prev;
                    }
                    prev.next = current.next;
                }
                System.out.println("Ticket with ID " + ticketId + " removed.");
                return;
            }
            prev = current;
            current = current.next;
        } while (current != last.next);

        System.out.println("Ticket with ID " + ticketId + " not found.");
    }

    // Display all tickets in the list
    public void displayTickets() {
        if (last == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode current = last.next;
        System.out.println("Current Tickets:");
        do {
            System.out.println("Ticket ID: " + current.ticketId + ", Customer: " + current.customerName + ", Movie: " + current.movieName +
                    ", Seat: " + current.seatNumber + ", Booking Time: " + current.bookingTime);
            current = current.next;
        } while (current != last.next);
    }

    // Search for a ticket by Customer Name or Movie Name
    public void searchTicket(String searchTerm) {
        if (last == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode current = last.next;
        boolean found = false;
        do {
            if (current.customerName.equalsIgnoreCase(searchTerm) || current.movieName.equalsIgnoreCase(searchTerm)) {
                System.out.println("Found Ticket: Ticket ID: " + current.ticketId + ", Customer: " + current.customerName +
                        ", Movie: " + current.movieName + ", Seat: " + current.seatNumber + ", Booking Time: " + current.bookingTime);
                found = true;
            }
            current = current.next;
        } while (current != last.next);

        if (!found) {
            System.out.println("No tickets found for the search term: " + searchTerm);
        }
    }

    // Calculate the total number of booked tickets
    public int countTickets() {
        if (last == null) {
            return 0;
        }

        TicketNode current = last.next;
        int count = 0;
        do {
            count++;
            current = current.next;
        } while (current != last.next);

        return count;
    }
}


