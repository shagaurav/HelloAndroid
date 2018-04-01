package com.example.helloandroid.helloandroid;

        import android.content.Intent;
        import android.graphics.drawable.AnimationDrawable;
        import android.net.Uri;
        import android.support.constraint.ConstraintLayout;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.text.method.LinkMovementMethod;
        import android.view.View;
        import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    ConstraintLayout myLayout;
    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        myLayout = (ConstraintLayout) findViewById(R.id.myLayout);

        animationDrawable = (AnimationDrawable) myLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(2500);
        animationDrawable.start();

    }

    public void browser(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://blog.udacity.com/2015/11/udacity-be-in-demand.html"));
        startActivity(browserIntent);
    }
}
