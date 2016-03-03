/**
 * Created by lalitp on 25/02/16.
 */
public class Counts {
    public final int[] count;
    public final String fileName;
    public Counts(String fileName, int[]count) {
        this.count = count;
        this.fileName = fileName;
    }
    private boolean isEquals(Counts other) {
        for (int i = 0; i < count.length; i++) {
            if(count[i] != other.count[i])
                return false;
        }
        return true;
    }
    public boolean equals(Object other) {
        if(this == other) return true;
        if(!(other instanceof Counts)) return false;
        Counts another = (Counts) other;
        return isEquals(another) && fileName == another.fileName ;
    }

}
