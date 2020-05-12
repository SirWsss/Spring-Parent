package com.example.eureka.config;

//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @ClassName WebSecurityConfig
 * @Author wang
 * @Date 2020/5/10 0010 10:52
 * @Ps  Spring Security启用csrf，然后会对URL请求进行token验证，如果请求中没有token,浏览器会任务是非法网页的请求，然后就会拒绝
 *        功能:该配置类关闭了csrf
 *
 *        CSRF扩展
 *          百度词条解释：
 *          CSRF（Cross-site request forgery）跨站请求伪造，
 *          也被称为“One Click Attack”或者Session Riding，通常缩写为CSRF或者XSRF，
 *          是一种对网站的恶意利用。尽管听起来像跨站脚本（XSS），但它与XSS非常不同，
 *          XSS利用站点内的信任用户，而CSRF则通过伪装成受信任用户的请求来利用受信任的网站。与XSS攻击相比，
 *          CSRF攻击往往不大流行（因此对其进行防范的资源也相当稀少）和难以防范，所以被认为比XSS更具危险性。
 */
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    public void configure(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity.csrf().disable();
//        super.configure(httpSecurity);
//    }
//}
