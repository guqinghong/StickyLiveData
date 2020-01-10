package cn.missfresh.stickylivedata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static StickyLiveData<MessageInfo> mInfoStickyLiveData = new StickyLiveData<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInfoStickyLiveData.setValue(new MessageInfo("LiveData 消息"));

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 跳转到接收粘连性事件页面
                Intent intent = new Intent(MainActivity.this,ReceiveStickyActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 跳转到接收粘连性事件页面
                Intent intent = new Intent(MainActivity.this,NoReceiveSitckActivity.class);
                startActivity(intent);
            }
        });
    }
}
