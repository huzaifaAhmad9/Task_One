package com.example.taskone;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioGroup;
import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup toggle = findViewById(R.id.toggle);
        FrameLayout containerLayout = findViewById(R.id.container_layout);
        toggle.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int checkedId) {
                if (checkedId==R.id.huzaifa){
                    containerLayout.removeAllViews();
                    View existingLayout = getLayoutInflater().inflate(R.layout.fragment_signin, containerLayout, false);
                    containerLayout.addView(existingLayout);
                } else if (checkedId==R.id.ahmad) {
                    containerLayout.removeAllViews();
                    View newUsersLayout = getLayoutInflater().inflate(R.layout.fragment_signup, containerLayout, false);
                    containerLayout.addView(newUsersLayout);
                }

            }
        });
    }
}
