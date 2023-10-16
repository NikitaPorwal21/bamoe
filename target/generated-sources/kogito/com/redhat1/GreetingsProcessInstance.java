package com.redhat1;

public class GreetingsProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<GreetingsModel> {

    public GreetingsProcessInstance(com.redhat1.GreetingsProcess process, GreetingsModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public GreetingsProcessInstance(com.redhat1.GreetingsProcess process, GreetingsModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public GreetingsProcessInstance(com.redhat1.GreetingsProcess process, GreetingsModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public GreetingsProcessInstance(com.redhat1.GreetingsProcess process, GreetingsModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    protected java.util.Map<String, Object> bind(GreetingsModel variables) {
        return variables.toMap();
    }

    protected void unbind(GreetingsModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
