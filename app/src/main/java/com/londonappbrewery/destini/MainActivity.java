package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView m_storyTextView;
    private Button m_buttonTop;
    private Button m_buttonBottom;
    private int m_storyIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        m_storyTextView = findViewById(R.id.storyTextView);
        m_buttonTop = findViewById(R.id.buttonTop);
        m_buttonBottom = findViewById(R.id.buttonBottom);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        m_buttonTop.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                m_buttonTop.setVisibility(View.VISIBLE);
                m_buttonBottom.setVisibility(View.VISIBLE);

                String story = "";
                String topText = "";
                String bottomText = "";

                switch (m_storyIndex)
                {
                    case 1:
                    case 2:

                        story = getString(R.string.T3_Story);
                        topText = getString(R.string.T3_Ans1);
                        bottomText = getString(R.string.T3_Ans2);
                        m_storyIndex = 3;
                        break;

                    case 3:
                        story = getString(R.string.T6_End);

                        m_buttonTop.setVisibility(View.GONE);
                        m_buttonBottom.setVisibility(View.GONE);

                        break;
                }

                m_storyTextView.setText(story);
                m_buttonTop.setText(topText);
                m_buttonBottom.setText(bottomText);
            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        m_buttonBottom.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                m_buttonTop.setVisibility(View.VISIBLE);
                m_buttonBottom.setVisibility(View.VISIBLE);

                String story = "";
                String topText = "";
                String bottomText = "";

                switch (m_storyIndex)
                {
                    case 1:
                        story = getString(R.string.T2_Story);
                        topText = getString(R.string.T2_Ans1);
                        bottomText = getString(R.string.T2_Ans2);
                        m_storyIndex = 2;
                        break;

                    case 2:
                        story = getString(R.string.T4_End);

                        m_buttonTop.setVisibility(View.GONE);
                        m_buttonBottom.setVisibility(View.GONE);

                        break;

                    case 3:
                        story = getString(R.string.T5_End);

                        m_buttonTop.setVisibility(View.GONE);
                        m_buttonBottom.setVisibility(View.GONE);
                }

                m_storyTextView.setText(story);
                m_buttonTop.setText(topText);
                m_buttonBottom.setText(bottomText);
            }
        });

    }
}
