package huarongdao;


import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class FileTests {


    public static void downUrlTxt(String fileUrl, String downPath) {
        File savePath = new File(downPath);
        if (!savePath.exists()) {
            savePath.mkdir();
        }
        String[] urlname = fileUrl.split("/");
        int len = urlname.length - 1;
        String uname = urlname[len];
        //获取文件名
        try {
            File file = new File(savePath + "/" + uname);
            // 创建新文件
            if (file != null && !file.exists()) {
                file.createNewFile();
            }
            OutputStream oputstream = new FileOutputStream(file);
            URL url = new URL(fileUrl);
            URLConnection uc;
            uc = url.openConnection();
            uc.addRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0;WindowsNT 5.0)");
            uc.setDoInput(true);
            //设置是否要从 URL 连接读取数据,默认为trueuc.connect;
            InputStream iputstream = uc.getInputStream();
            System.out.println("filesize is:" + uc.getContentLength());
            // 打印文件长度
            byte[] buffer=new byte[4*1024];
            int byteRead = -1;
            while ((byteRead = (iputstream.read(buffer))) != -1) {
                oputstream.write(buffer, 0, byteRead);
            }
            oputstream.flush();
            iputstream.close();
            oputstream.close();
        } catch (Exception e) {
            System.out.println("读取失败！");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String fileUrl = "";
        String downPath = "D:\\test";
        for (int i =0;i<=100;i++ ){
            fileUrl = "http://pic.xxpicxx.xyz/images/jlksxlzxjk/9974490/tzmy"+i+".jpg";
            downUrlTxt(fileUrl, downPath);
        }
    }

}