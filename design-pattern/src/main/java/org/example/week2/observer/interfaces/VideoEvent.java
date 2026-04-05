package org.example.week2.observer.interfaces;

public class VideoEvent {

    private final String title;
    private final String content;
    private final long fileSize;
    private final String type;

    public VideoEvent(String title, String content, long fileSize, String type) {
        this.title = title;
        this.content = content;
        this.fileSize = fileSize;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public long getFileSize() {
        return fileSize;
    }

    public String getType() {
        return type;
    }

    public String toString(){
        return "제목 : " + getTitle() +", 내용 : " + getContent() + ", 크기 : " + getFileSize() + ", 형식 : " + getType() + "이 업로드 되었습니다.";
    }
}
