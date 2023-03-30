import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    coppyFile("D:\\MD3 demo\\MD3-baitap1-SS16\\src\\source.txt", "D:\\MD3 demo\\MD3-baitap1-SS16\\src\\target.txt");
    }
    public static void coppyFile(String fileSource, String fileTarget) throws IOException {
        File source =new File(fileSource);
        if (!source.exists()){
            System.out.println("Tập tin không tồn tại ");
            return;
        }
        File target = new File(fileTarget);
        if (!target.exists()){
            System.out.println("Tập tin không tồn tại ");
            return;
        }
        try (InputStream in = new FileInputStream(source);
             OutputStream out = new FileOutputStream(target)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
        }
        long fileSize = target.length();
        System.out.println("Đã sao chép tệp " + fileSource + " vào " + fileTarget + " với " + fileSize + " byte.");


    }
}