package task2;

public class Cinema {
    String[][] seats;

    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
    // Sæder, der ikke er reserveret, har værdien "O"
    public Cinema(int rows, int seats) {
        this.seats = new String[rows][seats]; // Først initialiser arrayet

        // Fyld alle sæder med "O" for at indikere, at de ikke er reserveret
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                this.seats[i][j] = "O";
            }
        }
        this.seats[0][0] = "X"; // Reserver direktørens sæde
    }

    public int getRows() {
        return seats.length;
    }

    public int getSeats() {
        return seats[0].length;
    }

    // Hvis sædet ikke er reserveret (O), skift til X og returner true.
    // Hvis sædet allerede er reserveret (X), returner false.
    public boolean reserve(int row, int seat) {
        if (seats[row][seat].equals("O")) {  // Brug store bogstaver O og X
            seats[row][seat] = "X";
            return true;
        }
        return false;
    }

    // Afbestil reservation: Hvis sædet er X, skift det tilbage til O
    public boolean cancelReservation(int row, int seat) {
        if (seats[row][seat].equals("X")) {  // Brug store bogstaver O og X
            seats[row][seat] = "O";
            return true;
        }
        return false;
    }

    // Metode til pæn udskrivning af salen
    public String toString() {
        String result = "";  // Start med en tom streng
        for (int i = 0; i < seats.length; i++) {
            result += "|";
            for (int j = 0; j < seats[i].length; j++) {
                result += seats[i][j] + "|";
            }
            result += "\n";
        }
        return result;
    }
}
