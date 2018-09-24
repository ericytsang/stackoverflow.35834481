package com.github.ericytsang.so35834481.android.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.github.ericytsang.so35834481.android.R;

import java.io.Serializable;

public class NextActivity extends AppCompatActivity
{
    public static final class Params implements Serializable
    {
        private final Mode displayMode;

        public Params(Mode displayMode)
        {
            this.displayMode = displayMode;
        }

        public Mode getDisplayMode()
        {
            return displayMode;
        }

        enum Mode
        {
            DIALOG,
            DIALOG_NO_TOOLBAR,
            NORMAL,
            NORMAL_NO_TOOLBAR,
        }
    }

    public static void start(Context context, Params params)
    {
        Intent starter = new Intent(context, NextActivity.class);
        starter.putExtra(Params.class.getCanonicalName(), params);
        context.startActivity(starter);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        Params params = (Params) getIntent().getSerializableExtra(Params.class.getCanonicalName());
        switch(params.getDisplayMode())
        {
            case DIALOG:
                setTheme(R.style.AppDialogTheme);
                break;
            case DIALOG_NO_TOOLBAR:
                setTheme(R.style.AppDialogTheme_NoActionBar);
                break;
            case NORMAL:
                setTheme(R.style.AppTheme);
                break;
            case NORMAL_NO_TOOLBAR:
                setTheme(R.style.AppTheme_NoActionBar);
                break;
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__another);
        setTitle(getClass().getSimpleName());
    }
}
