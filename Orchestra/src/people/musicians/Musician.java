package people.musicians;

public interface Musician {

    /**
     * Sets a set for this musician.
     * @param seat Seat for this musician, assumed to be between 0 and 15.
     */
    abstract void setSeat(int seat);

    /**
     * Reads musicians score represented in the notes array.
     * @param notes Score/notes to be read.
     * @param soft Set to true for soft notes and false for hard.
     */
    abstract void readScore(int[] notes, boolean soft);

    /**
     * Plays the next node, there will be no effect if there are no more notes to play.
     * NOTE: setSeat and readScore have to be called before playNextNote can be used.
     */
    abstract void playNextNote();
}
