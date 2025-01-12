package cn;
import com.alibaba.druid.support.http.StatViewServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.WebInitParam;
@WebServlet(urlPatterns = "/druid/*")
public class DruidStatViewServlet extends StatViewServlet {
	private static final long serialVersionUID = 1L;
	
}