package tn.esprit.testspring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @AfterReturning("execution(* tn.esprit.testspring.service.*.*(..))")
    public void logMethod(JoinPoint jp) {
        System.out.println("Méthode exécutée ;: " + jp.getSignature().getName());
    }
}
