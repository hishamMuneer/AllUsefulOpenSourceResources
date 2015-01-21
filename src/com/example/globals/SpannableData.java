package com.example.globals;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

public class SpannableData {

	public void JustData() {
		// Hisham
		// Because they wanted a clickable text inside a textview
		String text = "Yes, I accept the User Acceptance Agreement which specifies how my information will be kept confidential and secure. To view the User Acceptance Agreement, click the link above ";
		// txt_agreement.setText(Html.fromHtml(text), BufferType.SPANNABLE);

		String textToSearch = "User Acceptance Agreement";
		if (text.contains(textToSearch)) {
			int indexOfUserAgreement = text.indexOf(textToSearch);
			int endOfUserAgreement = textToSearch.length()
					+ indexOfUserAgreement;

			Spannable ss = new SpannableString(text);
			ss.setSpan(new MyClickableSpan(), indexOfUserAgreement,
					endOfUserAgreement, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
			// Spannable colorSpan = new SpannableString(text);
			// ss.setSpan(new ForegroundColorSpan(Color.BLUE),
			// indexOfUserAgreement , endOfUserAgreement,
			// Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

			// txt_agreement.setText(ss);
		}
	}

	class MyClickableSpan extends ClickableSpan { // clickable span

		public void onClick(View textView) {
			// TODO opening up Privacy policy
//			Intent termsIntent = new Intent(context, PrivacyPolicy.class);
//			termsIntent.putExtra("fileName", "terms.html");
//			startActivity(termsIntent);
		}

		@Override
		public void updateDrawState(TextPaint ds) {
//			ds.setColor(getResources().getColor(R.color.tv_orange_color));
//			ds.setUnderlineText(false);
		}
	}
}
