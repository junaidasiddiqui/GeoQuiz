package com.smartcpr.junaid.firstandroidapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by junaid on 11/7/17.
 */

public class CheatActivity extends Activity {
    public static final String EXTRA_ANSWER_IS_TRUE = "com.smartcpr.junaid.firstandroidapp.answer_is_true";

    private TextView mAnswerTextView;
    private Button mShowAnswer;

    @Override
    public  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);

        mAnswerIsTrue = getIntent().getBooleanExtra(EXTRA_ANSWER_IS_TRUE, false);

        mAnswerTextView = (TextView)findViewById(R.id.answerTextView);

        mShowAnswer = (Button)findViewById(R.id.showAnswerButton);
        mShowAnswer.
    }
}
