package dabok.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Image {

    private String filePath;    // 파일경로

    private String fileNm;      // 파일이름

    private String fileType;    // 파일확장자
    
    private int fileSize;       // 파일사이즈

    protected Image(){
    }

    public Image(String filePath, String fileNm, String fileType, int fileSize){

        this.filePath = filePath;
        this.fileNm = fileNm;
        this. fileType = fileType;
        this.fileSize = fileSize;
    }

}
