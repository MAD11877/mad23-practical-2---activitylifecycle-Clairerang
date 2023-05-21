package sg.edu.np.mad23.myapplication;

import static android.provider.MediaStore.MediaColumns.TITLE;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.util.Log;
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
        user1.setFollowed(false);

        follow.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view){
                if (!user1.isFollowed()){
                    follow.setText("unfollow");
                    user1.setFollowed(true);
                }
                else {
                    follow.setText("follow");
                    user1.setFollowed(false);
                }
            }

        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.v(TITLE, "Start");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.v(TITLE, "Resume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.v(TITLE, "Pause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.v(TITLE, "Stop");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.v(TITLE, "Restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TITLE, "Destroy");
    }
}