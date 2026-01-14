package practice;

public class CheckResult <T>{
    private String status;
    private String log;
    private T targetObject ;

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
