
public enum Gender {
    Male("Mr"),
    Female("Ms");

    private final String prefix;

    Gender(String prefix) {
        this.prefix = prefix;
    }
    public String prefix(){
        return prefix;
    }
}
