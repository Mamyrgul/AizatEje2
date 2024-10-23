import java.time.LocalDate;

public class Instagram extends Chat{
    private int publication;
    private long numOfFollowers;

    public Instagram (String name, boolean isNew, LocalDate dateOfIssue, String color, int publication, long numOfFollowers){
        super(name,isNew,dateOfIssue,color);
        this.publication=publication;
        this.numOfFollowers=numOfFollowers;
    }

    public int getPublication() {
        return publication;
    }

    public void setPublication(int publication) {
        this.publication = publication;
    }

    public long getNumOfFollowers() {
        return numOfFollowers;
    }


    public void  publicPhoto(){
        if (publication<=10){
            System.out.println("You have successfully downloaded the publications"+publication);
        }else {
            System.out.println("You can't load so many posts");
        }
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nAbout publication:" + publication +
                "\nNumber of followers:" + numOfFollowers ;
    }
}
