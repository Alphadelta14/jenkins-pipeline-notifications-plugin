package solutions.alphaservcomputing.hudson.plugins.pipeline_notifications;

import hudson.Extension;
import hudson.model.TaskListener;
import hudson.model.Run;
import hudson.model.listeners.RunListener;

@Extension
@SuppressWarnings("rawtypes")
public class PipelineListener extends RunListener<Run> {

    public PipelineListener() {
        super(Run.class);
    }

    @Override
    public void onStarted(Run r, TaskListener listener) {
    }

    @Override
    public Environment setUpEnvironment(AbstractBuild build,
                                        Launcher launcher,
                                        BuildListener listener)
                                        throws IOException,
                                            InterruptedException,
                                            Run.RunnerAbortedException {
    }

    @Override
    public void onCompleted(Run r, TaskListener listener) {
    }

    @Override
    public void onFinalized(Run r) {
    }

    @Override
    public void onDeleted(Run r) {
    }

}
