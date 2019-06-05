package huarongdao;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;


public class DownloadPicFromURL {


    public static void main(String[] args) throws Exception {

        int aaa = fib(5);
        System.out.println(aaa);
//        downUrlTxt("", "D:\\test");
    }

    public static int fib(int n)throws Exception{
        if(n==0){
            return 0;
        }else if(n == 1){
            return 1;
        }else if (n>1){
            return fib(n-1)+fib(n-2);
        }else {
            throw new Exception();
        }

    }

    public static void downUrlTxt( String fileUrl, String downPath) {
//        Thread.sleep(5000L);
//
//        fileUrl.wait();


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
            //创建新文件
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
            //打印文件长度
            byte[] buffer = new byte[4 * 1024];
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
}



