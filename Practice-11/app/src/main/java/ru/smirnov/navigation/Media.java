package ru.smirnov.navigation;


public class Media {
    private String name;
    private int imageResourceId;

    public static final Media[]  medias = {
            new Media("Telegram", R.drawable.tl),
            new Media("Facebooc", R.drawable.fb),
            new Media("VKontakte", R.drawable.vk),
            new Media("Instagram", R.drawable.inst)
    };

    public Media(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
