package org.project.loan.mainmag.controller;

import org.project.loan.utils.GetUrl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/weather")
public class WeatherController {
    @RequestMapping(value = "/getWeather",method= RequestMethod.POST)
    public@ResponseBody String getWeather(String cityName) {
        return GetUrl.getJson(cityName);
    }
}
