package dev.jjerrell.sandbox.client.sam;

import android.view.View;

@FunctionalInterface
public interface ConfigurableAction {
    void execute(View view, String data);
}


