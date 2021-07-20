package discord.anime.anime;

import org.springframework.stereotype.Controller;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ErrorPage implements ErrorController  {

    @RequestMapping("/error")
	public RedirectView errorRedirect() {
        return new RedirectView("index.html");
    }

}