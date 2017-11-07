package com.smartcpr.junaid.firstandroidapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by junaid on 11/7/17.
 */

public class CheatActivity extends Activity {
    public static final String EXTRA_ANSWER_IS_TRUE = "com.smartcpr.junaid.firstandroidapp.answer_is_true";
    public static final String EXTRA_ANSWER_SHOWN =  "com.smartcpr.junaid.firstandroidapp.answer_shown";

    private boolean mAnswerIsTrue;

    private TextView mAnswerTextView;
    private Button mShowAnswer;

    private void setAnswerShownResult(boolean isAnswerShown) {
        Intent data = new Intent();
        data.putExtra(EXTRA_ANSWER_SHOWN, isAnswerShown);
        setResult(RESULT_OK, data);
    }

    @Override
    public  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);

        setAnswerShownResult(true);

        mAnswerIsTrue = getIntent().getBooleanExtra(EXTRA_ANSWER_IS_TRUE, false);

        mAnswerTextView = (TextView)findViewById(R.id.answerTextView);

        mShowAnswer = (Button)findViewById(R.id.showAnswerButton);
        mShowAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("CheatActivity", EXTRA_ANSWER_IS_TRUE);

                if (mAnswerIsTrue) {
                    mAnswerTextView.setText(R.string.answer_is_true);
                } else {
                    mAnswerTextView.setText(R.string.answer_is_false);

                }
                setAnswerShownResult(true);
            }
        });
    }
}
