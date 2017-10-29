package cn.me.execption;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomerHandlerException implements HandlerExceptionResolver{


    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        String msg;

        if(e instanceof MessageException){
            msg = ((MessageException) e).getMsg();
        }else {
            msg = "未知异常";
        }
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg",msg);
        mav.setViewName("error");
        return mav;
    }
}
