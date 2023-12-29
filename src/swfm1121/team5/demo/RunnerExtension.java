package swfm1121.team5.demo;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class RunnerExtension implements AfterTestExecutionCallback {

    @Override
    public void afterTestExecution(ExtensionContext context) throws Exception {
        Boolean testResult = context.getExecutionException().isPresent();
        if(testResult){
            System.out.println("TESTS FAILED"); //false - SUCCESS, true - FAILED
        }
        else {
            System.out.println("TESTS SUCCESS");
        }
    }
}
