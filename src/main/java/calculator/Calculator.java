package calculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Calculator 
{
@RequestMapping("add")
public ModelAndView add(@RequestParam int num1,@RequestParam int num2)
{
ModelAndView View=new ModelAndView("Ans.jsp");
View.addObject("op", "sum");
View.addObject("num1", num1);
View.addObject("num2", num2);
View.addObject("ans",num1+num2);
//View.setViewName("Ans.jsp");
return View;
}
@RequestMapping("sub")
public ModelAndView sub(@RequestParam int num1,@RequestParam int num2)
{
ModelAndView View=new ModelAndView("Ans.jsp");
View.addObject("op", "sub");
View.addObject("num1", num1);
View.addObject("num2", num2);
View.addObject("ans",num1-num2);
//View.setViewName("Ans.jsp");
return View;
}
@RequestMapping("mul")
public ModelAndView mul(@RequestParam int num1,@RequestParam int num2)
{
ModelAndView View=new ModelAndView("Ans.jsp");
View.addObject("op", "mul");
View.addObject("num1", num1);
View.addObject("num2", num2);
View.addObject("ans",num1*num2);
//View.setViewName("Ans.jsp");
return View;
}
@RequestMapping("div")
public ModelAndView Div(@RequestParam int num1,@RequestParam int num2)
{
ModelAndView View=new ModelAndView("Ans.jsp");
View.addObject("op", "div");
View.addObject("num1", num1);
View.addObject("num2", num2);
View.addObject("ans",num1/num2);
//View.setViewName("Ans.jsp");
return View;
}
}
