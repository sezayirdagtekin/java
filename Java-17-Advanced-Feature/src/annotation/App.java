package annotation;

import java.lang.annotation.Annotation;

public class App {

    public static void main(String[] args) {


        LoginCommand loginCommand = new LoginCommand();
        Annotation[] annotations = loginCommand.getClass().getAnnotations();


        for (var an : annotations)
            System.out.println(an.toString());
    }
    // Console
    // @annotation.Commands({@annotation.Command(description="login to system", oder=1, value="login"),
    // @annotation.Command(description="login to system", oder=1, value="Enter")})
}
