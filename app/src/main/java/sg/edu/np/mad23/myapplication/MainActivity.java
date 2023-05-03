package sg.edu.np.mad23.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button follow = findViewById(R.id.follow);
        User user1 = new User();
        user1.followed = false;

        follow.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view){
                if (user1.followed == false){
                    follow.setText("unfollow");
                    user1.followed = true;
                }
                else {
                    follow.setText("follow");
                    user1.followed = false;
                }
            }

        });
    }
}