package xyz.mizan.springbootjspcrudapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UtilController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView goIndex() {
		ModelAndView indexModel = new ModelAndView();
		indexModel.setViewName("index");
		return indexModel;
	}
	
	@RequestMapping(value="/cancelInsertOrUpdate", method=RequestMethod.GET)
	public ModelAndView cancelInsertOrUpdate() {
		//ModelAndView indexModel = new ModelAndView();
		//indexModel.setViewName("index");
		return new ModelAndView("redirect:/employee/list");
	}
}
