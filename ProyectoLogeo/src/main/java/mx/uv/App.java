package mx.uv;

import static spark.Spark.*;
import static spark.Spark.get;
import static spark.Spark.port;
import com.google.gson.*;

public class App 
{
    public static void main( String[] args ){
        staticFiles.location("/");
        port(getHerokuAssignedPort());
        get("/", (req, res) -> "respuesta");
        get("/pagina", (req, res) -> {
            res.redirect("login.html");
            return null;
        });
    }

    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }
}
