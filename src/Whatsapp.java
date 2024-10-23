import java.time.LocalDate;

public class Whatsapp extends Chat{
    private String nameOfGroup;
    private int maxFileSize;
    public Whatsapp(String name, boolean isNew, LocalDate dateOfIssue, String color,String nameOfGroup, int maxFileSize){
        super(name,isNew,dateOfIssue,color);
        this.nameOfGroup=nameOfGroup;
        this.maxFileSize=maxFileSize;
    }

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public void setNameOfGroup(String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }

    public int getMaxFileSize() {
        return maxFileSize;
    }

    public void setMaxFileSize(int maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    public void checkMaxFileSize() {
        System.out.println("Maximum file size that can be sent via WhatsApp: " + maxFileSize + " МБ.");
    }
    public void sendMessage(String message) {
        System.out.println("Message sent: " + message);
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nName of group:" + nameOfGroup +
                "\nMax file size=" + maxFileSize ;
    }
}
