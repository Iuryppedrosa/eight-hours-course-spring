package com.iurydev.Project8Hours;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

//    @Autowired
//    @Qualifier("myFirstBean")


//    public MyFirstService(MyFirstClass myFirstClass) {
//        this.myFirstClass = myFirstClass;
//    }
    private MyFirstClass myFirstClass;
    private Environment environment;

    @Autowired
    public void injectDependency(@Qualifier("myThirdBean") MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }


    public String tellAsStory(){
        return "the dependency is saying: " + myFirstClass.hello();
    }

    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }


    public String getJavaVersion(){
        return environment.getProperty("java.version");
    }

    public String getOsName(){
        return environment.getProperty("os.name");
    }

    public String readProp(){
        return environment.getProperty("my.custom.property");
    }

}
