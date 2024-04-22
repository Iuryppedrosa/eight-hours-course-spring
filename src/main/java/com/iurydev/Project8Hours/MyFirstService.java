package com.iurydev.Project8Hours;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

//    @Autowired
//    @Qualifier("myFirstBean")
    private MyFirstClass myFirstClass;

    @Autowired
    public void injectDependency(@Qualifier("myThirdBean") MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

//    public MyFirstService(MyFirstClass myFirstClass) {
//        this.myFirstClass = myFirstClass;
//    }

    public String tellAsStory(){
        return "the dependency is saying: " + myFirstClass.hello();
    }
}
