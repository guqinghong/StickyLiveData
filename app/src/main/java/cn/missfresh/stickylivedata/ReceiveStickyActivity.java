package cn.missfresh.stickylivedata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import android.os.Bundle;
import android.widget.TextView;

public class ReceiveStickyActivity extends AppCompatActivity {

    private TextView mTvMessageInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_sticky);

        mTvMessageInfo = findViewById(R.id.tv_message_info);

        MainActivity.mInfoStickyLiveData.observe(this, new Observer<MessageInfo>() {
            @Override
            public void onChanged(MessageInfo messageInfo) {
                mTvMessageInfo.setText(messageInfo.getInfo());
            }
        },true);
    }
}
