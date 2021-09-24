package com.joel.jenkins;

import com.lesfurets.jenkins.unit.declarative.DeclarativePipelineTest;
import org.junit.Before;
import org.junit.Test;

import java.util.function.Consumer;
import java.util.stream.Stream;

import static com.lesfurets.jenkins.unit.MethodSignature.method;
import static java.util.stream.Stream.concat;

public class PipelineTest extends DeclarativePipelineTest {

    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void should_execute_without_errors() throws Exception {
        runScript("Jenkinsfile");
        assertJobStatusSuccess();
        printCallStack();
    }
}
