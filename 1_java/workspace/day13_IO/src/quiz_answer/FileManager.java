package quiz_answer;

import java.io.*;

public class FileManager {
	
    private String fileName,filePath;
    private BufferedReader br;
    private BufferedWriter bw;
    
    public FileManager(){
        this.fileName=this.filePath="";
        this.br = null;
        this.bw = null;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    
    public void openFile(char option) throws IOException {
        switch (option){
            case 'r': case 'R':
                openFileForRead();
                break;
            case 'w': case 'W':
                openFileForWrite();
                break;
        }
    }
    private void openFileForRead() throws IOException {
    	
       this.br = new BufferedReader(new FileReader(this.filePath+this.fileName));
       String str;
       
       while((str=this.br.readLine()) != null){
           System.out.println(str);
       }
       this.br.close(); //모든 라인 출력 후 종료
    }
    
    private void openFileForWrite() throws IOException{
        this.bw = new BufferedWriter(new FileWriter(this.filePath+this.fileName));
    }
    public void fileWriteIFisOpen(String str) throws IOException {
        if(this.bw == null){
            System.out.println("file writer is not open");
            return ;
        }else{
            this.bw.write(str);
        }
    } //입력한 스트링을 받아 bw를 사용하여 파일에 쓰는 메소드

    public void closeFile() throws IOException{
        if(this.bw != null){
            this.bw.close();
        }
        if(this.br != null){
            this.br.close();
        }

    }
}
