package com.github.ericytsang.so35834481.android.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.github.ericytsang.so35834481.android.R;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__main);
        setTitle(getClass().getSimpleName());
    }

    public void openNextActivityAsDialog(View v)
    {
        NextActivity.start(this, new NextActivity.Params(NextActivity.Params.Mode.DIALOG));
    }

    public void openNextActivityAsNormal(View v)
    {
        NextActivity.start(this, new NextActivity.Params(NextActivity.Params.Mode.NORMAL));
    }

    public void openNextActivityAsDialogNoToolbar(View v)
    {
        NextActivity.start(this, new NextActivity.Params(NextActivity.Params.Mode.DIALOG_NO_TOOLBAR));
    }

    public void openNextActivityAsNormalNoToolbar(View v)
    {
        NextActivity.start(this, new NextActivity.Params(NextActivity.Params.Mode.NORMAL_NO_TOOLBAR));
    }
}
