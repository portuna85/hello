package hello.springmvc.basic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {
    @RequestMapping("/reponse-view-v1")
    public ModelAndView responseViewV1() {
         ModelAndView mv = new ModelAndView("response/hello")
                 .addObject("data", "hello!!");
        return mv;
    }

    @RequestMapping("/reponse-view-v2")
    public String responseViewV2(Model model) {
        model.addAttribute("data","HELLO!!");
        return "response/hello";
    }

    @RequestMapping("/response/hello")
    public void responseViewV3(Model model) {
        model.addAttribute("data","HELLO!!");
    }
}
