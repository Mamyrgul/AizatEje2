import java.time.LocalDate;

public class Telegram extends Chat {
    private int numberOfStickers;
    private int maxFileSize;

    public Telegram(String name, boolean isNew, LocalDate dateOfIssue, String color, int numberOfStickers, int maxFileSize) {
        super(name, isNew, dateOfIssue, color);
        this.numberOfStickers = numberOfStickers;
        this.maxFileSize = maxFileSize;
    }

    public int getNumberOfStickers() {
        return numberOfStickers;
    }

    public void setNumberOfStickers(int numberOfStickers) {
        this.numberOfStickers = numberOfStickers;
    }

    public int getMaxFileSize() {
        return maxFileSize;
    }

    public void setMaxFileSize(int maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    public void addSticker() {
        numberOfStickers++;
        System.out.println("Sticker added, total number of stickers: " + numberOfStickers);
    }

    public void maxSize() {
        System.out.println("Maximum file size that can be sent via Telegram: " + maxFileSize + " MB");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNumber of stickers: " + numberOfStickers +
                "\nMax file size: " + maxFileSize;
    }
}
