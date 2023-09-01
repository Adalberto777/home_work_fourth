package seminar_fourth;

public enum Male {
    MALE("девочка"), FEMALE("мальчик");

    private final String russianMaleTitle;
    Male(String russianMaleTitle){
        this.russianMaleTitle = russianMaleTitle;
    }

    public String getRussianMaleTitle(){
        return russianMaleTitle;
    }

    @Override
    public String toString() {
        return name();
    }
}
