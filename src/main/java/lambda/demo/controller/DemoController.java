package lambda.demo.controller;

import lambda.demo.StaticGenarator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController {

    static int containerSize = StaticGenarator.invoke();

    @RequestMapping(path = "/a", method = RequestMethod.GET)
    public String a() {
        return "hello";
    }

    @RequestMapping(path = "/b", method = RequestMethod.GET)
    public String b() {
        return "hello";
    }

    @RequestMapping(path = "/c", method = RequestMethod.GET)
    public String c() {
        return "hello";
    }

    @RequestMapping(path = "/d", method = RequestMethod.GET)
    public String d() {
        return "hello";
    }

    @RequestMapping(path = "/e", method = RequestMethod.GET)
    public String e() {
        return "hello";
    }

    @RequestMapping(path = "/f", method = RequestMethod.GET)
    public String f() {
        return "hello";
    }

    @RequestMapping(path = "/g", method = RequestMethod.GET)
    public String g() {
        return "hello";
    }

    @RequestMapping(path = "/h", method = RequestMethod.GET)
    public String h() {
        return "hello";
    }

    @RequestMapping(path = "/i", method = RequestMethod.GET)
    public String i() {
        return "hello";
    }

    @RequestMapping(path = "/j", method = RequestMethod.GET)
    public String j() {
        return "hello";
    }

    @RequestMapping(path = "/k", method = RequestMethod.GET)
    public String k() {
        return "hello";
    }

    @RequestMapping(path = "/l", method = RequestMethod.GET)
    public String l() {
        return "hello";
    }

    @RequestMapping(path = "/m", method = RequestMethod.GET)
    public String m() {
        return "hello";
    }

    @RequestMapping(path = "/n", method = RequestMethod.GET)
    public String n() {
        return "hello";
    }

    @RequestMapping(path = "/o", method = RequestMethod.GET)
    public String o() {
        return "hello";
    }

    @RequestMapping(path = "/p", method = RequestMethod.GET)
    public String p() {
        return "hello";
    }

    @RequestMapping(path = "/q", method = RequestMethod.GET)
    public String q() {
        return "hello";
    }

    @RequestMapping(path = "/r", method = RequestMethod.GET)
    public String r() {
        return "hello";
    }

    @RequestMapping(path = "/s", method = RequestMethod.GET)
    public String s() {
        return "hello";
    }

    @RequestMapping(path = "/t", method = RequestMethod.GET)
    public String t() {
        return "hello";
    }

    @RequestMapping(path = "/u", method = RequestMethod.GET)
    public String u() {
        return "hello";
    }

    @RequestMapping(path = "/v", method = RequestMethod.GET)
    public String v() {
        return "hello";
    }

    @RequestMapping(path = "/w", method = RequestMethod.GET)
    public String w() {
        return "hello";
    }

    @RequestMapping(path = "/x", method = RequestMethod.GET)
    public String x() {
        return "hello";
    }

    @RequestMapping(path = "/y", method = RequestMethod.GET)
    public String y() {
        return "hello";
    }

    @RequestMapping(path = "/z", method = RequestMethod.GET)
    public String z() {
        return "hello";
    }

}
