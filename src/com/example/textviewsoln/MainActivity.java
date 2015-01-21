package com.example.textviewsoln;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Foreground and background span
		ForegroundColorSpan fSpan = new ForegroundColorSpan(Color.rgb(256, 256,256));
		BackgroundColorSpan bSpan = new BackgroundColorSpan(Color.YELLOW);

		// TODO Span string here, change if required.
		String spanString = "Please select Next to view your eligibilty determination.";
		SpannableString ss = new SpannableString(spanString);
		
		// MyClickableSpan Class has the onclick method for this span
		ss.setSpan(new MyClickableSpan(spanString), 14, 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss.setSpan(fSpan, 14, 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss.setSpan(bSpan, 14, 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		// Change the float value inside RelativeSizeSpan for resizing the spanned text
		ss.setSpan(new RelativeSizeSpan(1.8f), 14, 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

		// TODO Set the span to text view, enter id here
		TextView textView = (TextView) findViewById(R.id.tv);
		textView.setText(ss);
		textView.setMovementMethod(LinkMovementMethod.getInstance());
	}

	/**
	 * Extending Clickable span to remove the underline from the span string
	 */
	class MyClickableSpan extends ClickableSpan {
		String clicked;
		public MyClickableSpan(String string) { 
			super();
			clicked = string;
		}
		// TODO Use the following onclick method
		public void onClick(View tv) {
			Toast.makeText(getApplicationContext(), "Next is clicked",
					Toast.LENGTH_LONG).show();
		}
		@Override
		public void updateDrawState(TextPaint ds) {// override updateDrawState
			ds.setUnderlineText(false); // set to false to remove underline
		}
	}
}
