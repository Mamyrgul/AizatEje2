import java.time.LocalDate;
import java.util.Scanner;

public class TikTok extends Chat{
    private  int timeVideo;
    private String nicName;

    public TikTok(String name, boolean isNew, LocalDate dateOfIssue, String color, int timeVideo, String nicName) {
        super(name, isNew, dateOfIssue, color);
        this.timeVideo = timeVideo;
        this.nicName = nicName;

    }

    public int getTimeVideo() {
        return timeVideo;
    }

    public void setTimeVideo(int timeVideo) {
        this.timeVideo = timeVideo;
    }

    public String getNicName() {
        return nicName;
    }

    public void setNicName(String nicName) {
        this.nicName = nicName;
    }
    public  void upload(){
        if (timeVideo<10 && timeVideo>0){
            System.out.println("You have successfully uploaded the video");
        }else {
            System.out.println("Your video is too long try again");
        }
    }
    public void namE(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        nicName=scanner.nextLine();
        if (nicName.length()<=15 ){
            System.out.println("You have successfully created an account");
        }else {
            System.out.println("Name is too long, try creating another one");
        }
    }

    @Override
    public String toString() {
        return  super.toString()+
                "\nTime video: " + timeVideo +
                "\nNic name:" + nicName ;
    }
}
