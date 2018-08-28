package cn.jxau.zhaowei.myspringboot.failureAnalyzers;

import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

/**
 * @ClassName MyFailureAnalyzer
 * @Description TODO
 * @Author zhaowei
 * @Date 2018/8/27 21:19
 * @Version 1.0
 */
public class MyFailureAnalyzer extends AbstractFailureAnalyzer {
    @Override
    protected FailureAnalysis analyze(Throwable rootFailure, Throwable cause) {
        System.out.println(rootFailure.getMessage());
        return super.analyze(rootFailure);
    }
}
