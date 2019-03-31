package app.example.com.myapplication;

import android.graphics.drawable.Animatable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView startTextView = findViewById(R.id.start_text_view);
        final TextView blinkTextView = findViewById(R.id.blink_text_view);
        final TextView chotaTextView = findViewById(R.id.chota_text);

        startTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(MainActivity.this,R.anim.blink);
                blinkTextView.startAnimation(anim);
                Animation anim2=AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                blinkTextView.startAnimation(anim2);
            }
        });

        chotaTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(MainActivity.this,R.anim.translation);
                chotaTextView.startAnimation(anim);
            }
        });

    }
}
