import java.util.Scanner;

public class RecordingSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Recording[] recordings = new Recording[5];

        // Prompt user for recording details
        for (int i = 0; i < recordings.length; i++) {
            System.out.println("Enter details for Recording #" + (i+1));
            System.out.print("Title: ");
            String title = input.nextLine();
            System.out.print("Artist: ");
            String artist = input.nextLine();
            System.out.print("Playing time (seconds): ");
            int playingTime = input.nextInt();
            input.nextLine(); // Consume the remaining newline character
            recordings[i] = new Recording(title, artist, playingTime);
        }

        // Prompt user for sort field
        System.out.print("Sort by (title/artist/playing time): ");
        String sortField = input.nextLine();

        // Sort the recordings based on the user's choice
        if (sortField.equalsIgnoreCase("title")) {
            sortRecordingsByTitle(recordings);
        } else if (sortField.equalsIgnoreCase("artist")) {
            sortRecordingsByArtist(recordings);
        } else if (sortField.equalsIgnoreCase("playing time")) {
            sortRecordingsByPlayingTime(recordings);
        } else {
            System.out.println("Invalid sort field!");
            return;
        }

        // Display the sorted recordings
        System.out.println("Sorted Recordings:");
        for (Recording r : recordings) {
            System.out.println(r);
        }
    }

    private static void sortRecordingsByTitle(Recording[] recordings) {
        for (int i = 0; i < recordings.length-1; i++) {
            for (int j = i+1; j < recordings.length; j++) {
                if (recordings[i].getTitle().compareToIgnoreCase(recordings[j].getTitle()) > 0) {
                    swap(recordings, i, j);
                }
            }
        }
    }

    private static void sortRecordingsByArtist(Recording[] recordings) {
        for (int i = 0; i < recordings.length-1; i++) {
            for (int j = i+1; j < recordings.length; j++) {
                if (recordings[i].getArtist().compareToIgnoreCase(recordings[j].getArtist()) > 0) {
                    swap(recordings, i, j);
                }
            }
        }
    }

    private static void sortRecordingsByPlayingTime(Recording[] recordings) {
        for (int i = 0; i < recordings.length-1; i++) {
            for (int j = i+1; j < recordings.length; j++) {
                if (recordings[i].getPlayingTime() > recordings[j].getPlayingTime()) {
                    swap(recordings, i, j);
                }
            }
        }
    }

    private static void swap(Recording[] recordings, int i, int j) {
        Recording temp = recordings[i];
        recordings[i] = recordings[j];
        recordings[j] = temp;
    }
}
