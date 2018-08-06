package com.mayaul.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class LoggingAroundAspect {

    @Around("execution(* com.mayaul.service.HelloMessageService.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {

        log.info("aop success" + joinPoint.proceed());

        return joinPoint.proceed();
    }

}
