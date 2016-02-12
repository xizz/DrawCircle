package xizz.drawcircle;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		PercentageCircleView circleView = (PercentageCircleView) findViewById(R.id.circle);
		circleView.setPercentage(0);
		circleView.setColor(Color.WHITE, 0xFF8BC538, 0xFF8BC538, 0xFF9CABB5);
		circleView.setSubText("3 stars");
		circleView.setSign("$");
	}
}
