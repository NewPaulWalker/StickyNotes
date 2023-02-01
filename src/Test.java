import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Test {
    String path = "D:\\StickyNotes\\notes";
    Test(){
        File file = new File(path);
        File[] list = file.listFiles();
        for(int i=0;i< list.length;i++){
            if(list[i].isFile()){
                System.out.println(list[i].getName());

                long time = list[i].lastModified();
                Date data = new Date(time);
                SimpleDateFormat formatter = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
                String filet = formatter.format(data);
                System.out.println(filet);
            }
        }
    }
    public static void main(String[] args){
        Test test = new Test();
    }
}
