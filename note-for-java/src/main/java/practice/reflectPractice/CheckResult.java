package practice.reflectPractice;

public class CheckResult <T>{
    private final String  status;
    private final String log;
    private final  T targetObject ;

    public CheckResult(String status, String log, T targetObject) {
        this.status = status;
        this.log = log;
        this.targetObject = targetObject;
    }

    @Override
    public String toString() {
        return "CheckResult{" +
                "status='" + status + '\'' +
                ", log='" + log + '\'' +
                ", targetObject=" + targetObject +
                '}';
    }
}
