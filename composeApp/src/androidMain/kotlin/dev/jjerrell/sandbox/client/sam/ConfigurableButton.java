package dev.jjerrell.sandbox.client.sam;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class ConfigurableButton extends MaterialButton {

    private ConfigurableAction action;
    private String data = "";

    public ConfigurableButton(Context context) {
        this(context, null);
    }

    public ConfigurableButton(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ConfigurableButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (action != null) {
                    action.execute(ConfigurableButton.this, data);
                }
            }
        });
    }

    public void configure(String data, ConfigurableAction action) {
        this.data = data;
        this.action = action;
    }
}
