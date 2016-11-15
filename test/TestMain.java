//import controller.HomePageServlet;
//import controller.ViewServlet;
//import org.apache.tomcat.jni.File;
//import org.apache.tomcat.util.http.fileupload.FileUtils;
//import org.junit.Before;
//import org.junit.Test;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import static javafx.beans.binding.Bindings.when;
//import static org.hamcrest.MatcherAssert.assertThat;
//
//public class TestMain {
//    private HomePageServlet servlet;
//    private HttpServletRequest request;
//    private HttpServletResponse response;
//
//
//    @Test
//    public void correctUsernameInRequest() throws ServletException, IOException {
//
//
//        servletTester.addServlet(com.caplin.example.MyServlet.class, "/validUrl");
//
//        servletTester.start();
//
//
//        servlet.doPost(request, response);
//
//        assertThat("text/html", Boolean.parseBoolean(response.getContentType()));
//
//    }
//
//}
