package com.example.hideui;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;
public class MainActivity<i> extends AppCompatActivity {
    ImageView ivstart;
    ImageView ivquestioncount;
    ImageView ivtimer;
    ImageView ivblue;
    ImageView ivclay;
    ImageView ivgreen;
    ImageView ivpink;
    TextView tvstart;
    TextView tvoption1;
    TextView tvoption2;
    TextView tvoption3;
    TextView tvoption4;
    TextView tvtimer;
    TextView tvquestioncount;
    TextView tvquestion;
    TextView tvsolv;
    Button bu;
    ArrayList<Integer> option1;
    ArrayList<Integer> option2;
    ArrayList<Integer> option3;
    ArrayList<Integer> option4;
    ArrayList<Integer> num1;
    ArrayList<Integer> num2;
    ArrayList<Integer> solutions;
    ArrayList<Integer> track;
    Random random;
    CountDownTimer countDownTimer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivstart = (ImageView)findViewById(R.id.ivstart);
        ivquestioncount = (ImageView)findViewById(R.id.ivquescount);
        ivquestioncount.setVisibility(View.INVISIBLE);
        ivtimer= (ImageView)findViewById(R.id.ivtimer);
        ivtimer.setVisibility(View.INVISIBLE);
        ivblue = (ImageView)findViewById(R.id.ivblue);
        ivblue.setVisibility(View.INVISIBLE);
        ivclay = (ImageView)findViewById(R.id.ivclay);
        ivclay.setVisibility(View.INVISIBLE);
        ivgreen = (ImageView)findViewById(R.id.ivgreen);
        ivgreen.setVisibility(View.INVISIBLE);
        ivpink = (ImageView)findViewById(R.id.ivpink);
        ivpink.setVisibility(View.INVISIBLE);
        tvstart = (TextView) findViewById(R.id.tvstart);
        tvoption1 = (TextView)findViewById(R.id.tvoption1);
        tvoption1.setVisibility(View.INVISIBLE);
        tvoption2 = (TextView)findViewById(R.id.tvoption2);
        tvoption2.setVisibility(View.INVISIBLE);
        tvoption3 = (TextView)findViewById(R.id.tvoption3);
        tvoption3.setVisibility(View.INVISIBLE);
        tvoption4 = (TextView)findViewById(R.id.tvoption4);
        tvoption4.setVisibility(View.INVISIBLE);
        tvtimer = (TextView)findViewById(R.id.tvtimer);
        tvtimer.setVisibility(View.INVISIBLE);
        tvquestioncount = (TextView)findViewById(R.id.tvquescount);
        tvquestioncount.setVisibility(View.INVISIBLE);
        tvquestion = (TextView)findViewById(R.id.tvquestion);
        tvquestion.setVisibility(View.INVISIBLE);
        tvsolv = (TextView)findViewById(R.id.tvsolv);
        tvsolv.setVisibility(View.INVISIBLE);
        bu = (Button)findViewById(R.id.bu);
        bu.setVisibility(View.INVISIBLE);
        option1 = new ArrayList<Integer>(16);
        option2 = new ArrayList<Integer>(16);
        option3 = new ArrayList<Integer>(16);
        option4 = new ArrayList<Integer>(16);
        num1 = new ArrayList<Integer>(16);
        num2 = new ArrayList<Integer>(16);
        track = new ArrayList<Integer>(16);
        solutions = new ArrayList<Integer>(16);
        random = new Random();
        int i;
        for(i=0;i<16;i++)
        {
            int number1 = random.nextInt(24) + 1;
            int number2 = random.nextInt(24) + 1;
            int solution = number1 + number2;
            num1.add(number1);
            num2.add(number2);
            solutions.add(solution);
        }
    }
    int i=-1;
    public void ishan(View view)
    {
        ivpink.setEnabled(true);
        ivgreen.setEnabled(true);
        ivclay.setEnabled(true);
        ivblue.setEnabled(true);
        bu.setVisibility(View.INVISIBLE);
        ivstart.setVisibility(View.INVISIBLE);
        ivquestioncount.setVisibility(View.VISIBLE);
        ivtimer.setVisibility(View.VISIBLE);
        ivblue.setVisibility(View.VISIBLE);
        ivclay.setVisibility(View.VISIBLE);
        ivgreen.setVisibility(View.VISIBLE);
        ivpink.setVisibility(View.VISIBLE);
        tvstart.setVisibility(View.INVISIBLE);
        tvoption1.setVisibility(View.VISIBLE);
        tvoption2.setVisibility(View.VISIBLE);
        tvoption3.setVisibility(View.VISIBLE);
        tvoption4.setVisibility(View.VISIBLE);
        tvtimer.setVisibility(View.VISIBLE);
        tvquestioncount.setVisibility(View.VISIBLE);
        tvquestion.setVisibility(View.VISIBLE);
        tvsolv.setVisibility(View.INVISIBLE);
        i = -1;
        temp();
    }
    int count = 0,score = 0;
    public void temp()
    {
            ++i;
            int select = random.nextInt(3)+1;
            switch(select)
            {
                case 1:
                    tvoption1.setText(solutions.get(i).toString());
                    track.add(1);
                    break;
                case 2:
                    tvoption2.setText(solutions.get(i).toString());
                    track.add(2);
                    break;
                case 3:
                    tvoption3.setText(solutions.get(i).toString());
                    track.add(3);
                    break;
                case 4:
                    tvoption4.setText(solutions.get(i).toString());
                    track.add(4);
                    break;
            }
            if(select == 1)
            {
                int ishan = random.nextInt(24)+1;
                if(ishan != solutions.get(i))
                    tvoption2.setText(Integer.toString(ishan));
                else
                    tvoption2.setText(Integer.toString(0));
                ishan = random.nextInt(24)+1;
                if(ishan != solutions.get(i))
                    tvoption3.setText(Integer.toString(ishan));
                else
                    tvoption3.setText(Integer.toString(0));
                ishan = random.nextInt(24)+1;
                if(ishan != solutions.get(i))
                    tvoption4.setText(Integer.toString(ishan));
                else
                    tvoption4.setText(Integer.toString(0));
            }
            else if(select == 2)
            {
                int ishan = random.nextInt(24)+1;
                if(ishan != solutions.get(i))
                    tvoption1.setText(Integer.toString(ishan));
                else
                    tvoption1.setText(Integer.toString(0));
                ishan = random.nextInt(24)+1;
                if(ishan != solutions.get(i))
                    tvoption3.setText(Integer.toString(ishan));
                else
                    tvoption3.setText(Integer.toString(0));
                ishan = random.nextInt(24)+1;
                if(ishan != solutions.get(i))
                    tvoption4.setText(Integer.toString(ishan));
                else
                    tvoption4.setText(Integer.toString(0));
            }
            else if(select == 3)
            {
                int ishan = random.nextInt(24)+1;
                if(ishan != solutions.get(i))
                    tvoption1.setText(Integer.toString(ishan));
                else
                    tvoption1.setText(Integer.toString(0));
                ishan = random.nextInt(24)+1;
                if(ishan != solutions.get(i))
                    tvoption2.setText(Integer.toString(ishan));
                else
                    tvoption2.setText(Integer.toString(0));
                ishan = random.nextInt(24)+1;
                if(ishan != solutions.get(i))
                    tvoption4.setText(Integer.toString(ishan));
                else
                    tvoption4.setText(Integer.toString(0));
            }
            else if(select == 4)
            {
                int ishan = random.nextInt(24)+1;
                if(ishan != solutions.get(i))
                    tvoption1.setText(Integer.toString(ishan));
                else
                    tvoption1.setText(Integer.toString(0));
                ishan = random.nextInt(24)+1;
                if(ishan != solutions.get(i))
                    tvoption2.setText(Integer.toString(ishan));
                else
                    tvoption2.setText(Integer.toString(0));
                ishan = random.nextInt(24)+1;
                if(ishan != solutions.get(i))
                    tvoption3.setText(Integer.toString(ishan));
                else
                    tvoption3.setText(Integer.toString(0));
            }
            tvquestioncount.setText(Integer.toString(i+1)+"/16");
            tvquestion.setText(num1.get(i).toString()+"+"+num2.get(i).toString());
        countDownTimer = new CountDownTimer(30000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                tvtimer.setText(Integer.toString((int)millisUntilFinished/1000)+"s");
            }

            @Override
            public void onFinish() {
                tvsolv.setVisibility(View.VISIBLE);
                tvsolv.setText("Timeout! Your Score is "+Integer.toString(score+1)+"/16");
                finish();
            }
        }.start();
    }
    public void main(View view)
    {
        countDownTimer.cancel();
        switch (view.getId())
        {
            case R.id.tvoption1 :
            {
                if(track.get(i) == 1)
                {
                    ++score;
                    ++count;
                   // ++i;
                    break;
                }
                else
                {
                   // ++i;
                    ++count;
                    break;
                }

            }
            case R.id.tvoption2 :
            {
                if(track.get(i) == 2)
                {
                    ++score;
                    ++count;
                    //++i;
                    break;
                }
                else
                {
                    //++i;
                    ++count;
                    break;
                }
            }
            case R.id.tvoption3 :
            {
                if(track.get(i) == 3)
                {
                    ++score;
                    ++count;
                 //   ++i;
                    break;
                }
                else
                {
                  //  ++i;
                    ++count;
                    break;
                }
            }
            case R.id.tvoption4 :
            {
                if(track.get(i) == 4)
                {
                    ++score;
                    ++count;
                  //  ++i;
                    break;
                }
                else
                {
                 //   ++i;
                    ++count;
                    break;
                }
            }
        }
   //     countDownTimer.cancel();
        if(count < 15)
            temp();
        else
        {
            tvsolv.setVisibility(View.VISIBLE);
            tvsolv.setText("Your Score is " + Integer.toString(score+1) + "/16");
            finish();
        }
    }
    public void finish()
    {
        count = 0;
        score = 0;
        track.clear();
        bu.setVisibility(View.VISIBLE);
        countDownTimer.cancel();
        onfinish();
    }
    public void buishan(View view)
    {
        ishan(view);
    }
    public void onfinish()
    {
        ivpink.setEnabled(false);
        ivgreen.setEnabled(false);
        ivclay.setEnabled(false);
        ivblue.setEnabled(false);
    }
}
