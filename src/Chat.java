import java.time.LocalDate;

public class Chat {
    private String name;
    private boolean isNew;
    private LocalDate dateOfIssue;
    private String color;

    public Chat(String name, boolean isNew, LocalDate dateOfIssue, String color) {
        this.name=name;
        this.isNew=isNew;
        this.dateOfIssue=dateOfIssue;
        this.color=color;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void name(){
        System.out.println("Application name: "+getName());
    }
    public void isnew(){
        int year = 0;
        if (year<=5){
            isNew=true;
                System.out.println("True");
        }else {
            System.out.println("False");
        }
    }

    @Override
    public String toString() {
        return
                "\nName: " + name +
                "\nIs this app new:  " + isNew +
                "\nWhen created:  " + dateOfIssue +
                "\nColor:" + color ;
    }
}
