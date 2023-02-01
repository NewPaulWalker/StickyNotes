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

/* servlet implementation class Create */
public class Create extends HttpServlet{
    private static final long serialVersionUID = 1L;

    /* HttpServlet */
    public Create(){
        super();
    }

    /* HttpServlet doGET */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String res =
                        "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <title>Notes</title>\n" +
                        "    <style>\n" +
                        "        *{\n" +
                        "            margin: 0;\n" +
                        "            padding: 0;\n" +
                        "        }\n" +
                        "        body{\n" +
                        "            font-size: 12px;\n" +
                        "            color: black;\n" +
                        "            font-family: 宋体;\n" +
                        "            background: url(\"images/便签纸1.jfif\");\n" +
                        "            background-size: cover;\n" +
                        "        }\n" +
                        "        .menu{\n" +
                        "            width: 80px;\n" +
                        "            background: mistyrose;\n" +
                        "            box-shadow: 1px 1px 5px #000;\n" +
                        "            display: none;\n" +
                        "            position: absolute;\n" +
                        "        }\n" +
                        "        .menu form input{\n" +
                        "            font-size: 39px;\n" +
                        "            font-family: 楷体;\n" +
                        "            color: darkslategray;\n" +
                        "            line-height: 30px;\n" +
                        "            cursor: pointer;\n" +
                        "        }\n" +
                        "        .menu form input:hover{\n" +
                        "            background: darkorange;\n" +
                        "            color: black;\n" +
                        "        }\n" +
                        "        .back{\n" +
                        "            left: 50px;\n" +
                        "            top: 50px;\n" +
                        "            position: absolute;\n" +
                        "        }\n" +
                        "        .back:hover{\n" +
                        "            background: darkorange;\n" +
                        "            color: red;\n" +
                        "        }\n" +
                        "        .text{\n" +
                        "            left: 260px;\n" +
                        "            top: 350px;\n" +
                        "            position: absolute;\n" +
                        "        }\n" +
                        "    </style>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "    <!-- 菜单 -->\n" +
                        "    <div class=\"menu\">\n" +
                        "        <form action=\"Open\" method=\"GET\">\n" +
                        "            <input type=\"submit\" value=\"打开\">\n" +
                        "        </form>\n" +
                        "        <form action=\"Save\" method=\"GET\">\n" +
                        "            <input type=\"submit\" value=\"保存\">\n" +
                        "        </form>\n" +
                        "        <form action=\"Quit\" method=\"GET\">\n" +
                        "            <input type=\"submit\" value=\"关闭\">\n" +
                        "        </form>\n" +
                        "    </div>\n" +
                        "    <!-- 返回 -->\n" +
                        "    <div class=\"back\">\n" +
                        "        <form action=\"NotesList\" method=\"GET\">\n" +
                        "            <input type=\"submit\"\n" +
                        "                   style=\"border-radius: 25px; background-color: unset;\n" +
                        "                   width: 210px; height: 100px; color: black; font-size: 50px; font-family: 宋体\"\n" +
                        "                   value=\"返回\">\n" +
                        "        </form>\n" +
                        "    </div>\n" +
                        "    <!-- 文本 -->\n" +
                        "    <div class=\"text\">\n" +
                        "        <form action=\"Save\" method=\"GET\">\n" +
                        "            <h1>标题：</h1>\n" +
                        "            <input type=\"text\" name=\"title\"\n" +
                        "                   style=\"line-height: 50px; width: 1000px;font-size: 50px; background-color: unset\">\n" +
                        "            <br>\n" +
                        "            <br>\n" +
                        "            <input type=\"submit\" style=\"width: 100px; height: 45px;font-size: 30px\" value=\"保存\">\n" +
                        "            <h1>内容：</h1>\n" +
                        "            <textarea name=\"content\" id=\"content\" style=\"width: 800px; height: 400px; margin: 0 auto; background-color: unset\"></textarea>\n" +
                        "        </form>\n" +
                        "    </div>\n" +
                        "    <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.3.1.min.js\"></script>\n" +
                        "    <script>\n" +
                        "        document.oncontextmenu = function (){\n" +
                        "            return false;\n" +
                        "        }\n" +
                        "        $(document).mousedown(function (e){\n" +
                        "            var key = e.which;\n" +
                        "            if(key==3){\n" +
                        "                var x = e.clientX;\n" +
                        "                var y = e.clientY;\n" +
                        "                $(\".menu\").show().css({left:x, top:y});\n" +
                        "            }else if(key==2){\n" +
                        "                $(\".menu\").hide();\n" +
                        "            }\n" +
                        "        });\n" +
                        "    </script>\n" +
                        "    <script type=\"text/javascript\" charset=\"utf-8\" src=\"ueditor/ueditor.config.js\"></script>\n" +
                        "    <script type=\"text/javascript\" charset=\"utf-8\" src=\"ueditor/ueditor.all.min.js\"></script>\n" +
                        "    <script type=\"text/javascript\" charset=\"utf-8\" src=\"ueditor/lang/zh-cn/zh-cn.js\"></script>\n" +
                        "\n" +
                        "    <script type=\"text/javascript\">\n" +
                        "        var ue = UE.getEditor(\"content\");\n" +
                        "    </script>\n" +
                        "</body>\n" +
                        "</html>";
        PrintWriter out = response.getWriter();
        out.println(res);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
