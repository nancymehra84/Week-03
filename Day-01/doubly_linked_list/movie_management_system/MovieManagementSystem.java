package doubly_linked_list.movie_management_system;

public class MovieManagementSystem {
    public static void main(String[] args) {
        DoublyLinkedList ll =new DoublyLinkedList();
        ll.addMovieAtFirst("Laadla", "Raj Kanwar", "1994", 8);
        ll.addMovieAtFirst("Pariwaar", "Rajesh Sharma", "2001", 7);

        // Add movies at the end
        ll.addMovieAtEnd("Saaho", "Sujeeth", "2019", 6);
        ll.addMovieAtEnd("Kalki", "Prasanth Varma", "2022", 8);

        // Add a movie at a specific position
        ll.addMovieSpecificPosition(2, "Kalki 2", "Prasanth Varma", "2024", 9);

        // Display movies in forward order
        System.out.println("\nMovies in forward order:");
        ll.displayForward();

        // Display movies in reverse order
        System.out.println("\nMovies in reverse order:");
        ll.displayReverse();

        // Search for a movie by director or rating
        System.out.println("\nSearching for movies by Director: 'Prasanth Varma' or Rating: 8");
        ll.searchMovie("Prasanth Varma", 8);

        // Update a movie's rating by title
        System.out.println("\nUpdating rating of 'Saaho' to 7.");
        ll.updateRatingByTitle("Saaho", 7);

        // Display movies again after update
        System.out.println("\nMovies after updating rating:");
        ll.displayForward();

        // Remove a movie by title
        System.out.println("\nRemoving movie: 'Pariwaar'.");
        ll.removeMovieByTitle("Pariwaar");

        // Display movies after removal
        System.out.println("\nMovies after removal:");
        ll.displayForward();

    }
}

