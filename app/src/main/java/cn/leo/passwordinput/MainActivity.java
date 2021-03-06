package cn.leo.passwordinput;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.MenuPopupWindow;
import android.view.ViewAnimationUtils;
import android.widget.Toast;

import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final PasswordInputLayout passwordInputLayout = findViewById(R.id.pil_pw);
        //passwordInputLayout.setEditBoard(R.drawable.shape_edit_pic_verifycode_selector);
        passwordInputLayout.setInputCompleteListener(new PasswordInputLayout.PasswordInputCompleteListener() {
            @Override
            public void onInputComplete(String password) {
                Toast.makeText(MainActivity.this, password, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
