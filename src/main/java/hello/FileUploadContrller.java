package hello;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FileUploadContrller {
    @RequestMapping("/")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "jsp/home";
    }
    @RequestMapping(value = "home.html", method = RequestMethod.GET)
    public String home(Model model, @RequestParam(value="home.html", required=false, defaultValue="World") String products) {
        model.addAttribute("home.html", products);
        return "jsp/home";
    }
    @RequestMapping(value = "ab.html", method = RequestMethod.GET)
    public String products(Model model, @RequestParam(value="ab.html", required=false, defaultValue="World") String products) {
        model.addAttribute("ab.html", products);
        return "jsp/callforpage";
    }
    @RequestMapping(value = "sub.html", method = RequestMethod.GET)
    public String sub(Model model, @RequestParam(value="sub.html", required=false, defaultValue="World") String products) {
        model.addAttribute("sub.html", products);
        return "jsp/submisson";
    }
    @RequestMapping(value = "reg.html", method = RequestMethod.GET)
    public String reg(Model model, @RequestParam(value="reg.html", required=false, defaultValue="World") String products) {
        model.addAttribute("reg.html", products);
        return "jsp/registration";
    }
    @RequestMapping(value = "key.html", method = RequestMethod.GET)
    public String key(Model model, @RequestParam(value="key.html", required=false, defaultValue="World") String products) {
        model.addAttribute("key.html", products);
        return "jsp/keynotespeakers";
    }
    @RequestMapping(value = "hotel.html", method = RequestMethod.GET)
    public String hotel(Model model, @RequestParam(value="hotel.html", required=false, defaultValue="World") String products) {
        model.addAttribute("hotel.html", products);
        return "jsp/hotel";
    }
    @RequestMapping(value = "contact.html", method = RequestMethod.GET)
    public String contact(Model model, @RequestParam(value="contact.html", required=false, defaultValue="World") String products) {
        model.addAttribute("contact.html", products);
        return "jsp/contact";
    }
    @RequestMapping(value = "about.html", method = RequestMethod.GET)
    public String about(Model model, @RequestParam(value="about.html", required=false, defaultValue="World") String products) {
        model.addAttribute("about.html", products);
        return "jsp/about";
    }
}
