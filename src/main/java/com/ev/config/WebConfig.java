//package com.ev.config;
//
//
//
//
///***
// * 相当于XML配置
// *
// * @author
// * @create 2018-11-27 下午5:53
// *
// *
// */
//
//
////@Configuration
//public class WebConfig {
//    //拦截器 先走pre 然后走post   不管是否抛出异常都会抛出  AFTERCOMPE
//    /*@Bean
//    public FilterRegistrationBean timeFilter(){
//        FilterRegistrationBean registrationBean=new FilterRegistrationBean();
//        registrationBean.setName("timeFilter");
//        TimeFilter timeFilter=new TimeFilter();
//        registrationBean.setFilter(timeFilter);
//        registrationBean.setOrder(1);
//        List<String> urlList=new ArrayList<String>();
//        urlList.add("/*");
//        registrationBean.setUrlPatterns(urlList);
//        return registrationBean;
//    }*/
//
//   /* @Bean
//    public PasswordEncoder passwordEncoder(){
//        //这个BcryptPasswordEncoder 存储非常的安全
//        return new BCryptPasswordEncoder();
//        //return new Md5PasswordEncoder();
//
//    }
//
//    @Bean
//    public AccessDeniedHandler accessDeniedHandler() {
//        return new AuthenticationAccessDeniedHandler();
//    }
//
//
//    @Bean
//    public ApiAccessDecisionManager apiAccessDecisionManager(){
//        return new ApiAccessDecisionManager();
//    }
//    @Bean
//    public ApiFilterSecurityMetadataSource apiFilterSecurityMetadataSource(){
//        return new ApiFilterSecurityMetadataSource();
//    }*/
//
//    /*@Bean
//        CorsConfigurationSource corsConfigurationSource() {
//        CorsConfiguration config = new CorsConfiguration();
//        config.setAllowCredentials(true);
//        config.addAllowedOrigin("http://localhost:8090");
//        config.addAllowedHeader("*");
//        config.addAllowedMethod("*");
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", config);
//        return source;
//    }*/
//}
