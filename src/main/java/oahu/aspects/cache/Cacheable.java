package oahu.aspects.cache;


public interface Cacheable {
    //UUID getUUID();
    void invalidate(Object thisObj);
}


/*
    public String getKey(ProceedingJoinPoint jp, Object thisObj) {
        Object[] args = jp.getArgs();
        MethodSignature signature = (MethodSignature) jp.getSignature();
        Method method = signature.getMethod();
        Cache a = method.getAnnotation(Cache.class);
        */
