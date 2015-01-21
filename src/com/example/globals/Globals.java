package com.example.globals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.http.cookie.Cookie;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ViewFlipper;

import com.example.textviewsoln.R;

public class Globals {

	// static method
	public static boolean emailValidator(String email) {
		Pattern pattern;
		Matcher matcher;
		final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		pattern = Pattern.compile(EMAIL_PATTERN);
		matcher = pattern.matcher(email);
		return matcher.matches();
	}

	// for check internet connection..
	public static boolean isNetworkAvailable(Context context) {
		ConnectivityManager cm = (ConnectivityManager) context
				.getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo netInfo = cm.getActiveNetworkInfo();
		if (netInfo != null && netInfo.isConnectedOrConnecting()) {
			return true;
		}
		return false;
	}

	// OLD CODE NOT WORKING PROPERLY

	public static void setListViewHeightBasedOnChildrenFinalConfirmation(
			ListView myListView) {
		ListAdapter myListAdapter = myListView.getAdapter();
		if (myListAdapter == null) {
			// do nothing return null
			return;
		}
		// set listAdapter in loop for getting final size
		int totalHeight = 0;
		for (int size = 0; size < myListAdapter.getCount(); size++) {
			View listItem = myListAdapter.getView(size, null, myListView);
			listItem.measure(0, 0);
			totalHeight += listItem.getMeasuredHeight();
		}
		// setting listview item in adapter
		ViewGroup.LayoutParams params = myListView.getLayoutParams();
		params.height = totalHeight
				+ (myListView.getDividerHeight() * (myListAdapter.getCount() - 1));
		myListView.setLayoutParams(params);
		// print height of adapter on log
		Log.i("height of listItem:", String.valueOf(totalHeight));
	}

	/**
	 * Changes the listview items size based on content. Default method.
	 * 
	 * @param listView
	 */
	public static void setListViewHeightBasedOnChildrenDefault(
			ListView myListView) {
		ListAdapter myListAdapter = myListView.getAdapter();
		if (myListAdapter == null) {
			// do nothing return null
			return;
		}
		// set listAdapter in loop for getting final size
		int totalHeight = 0;
		for (int size = 0; size < myListAdapter.getCount(); size++) {
			View listItem = myListAdapter.getView(size, null, myListView);
			listItem.measure(0, 0);
			totalHeight += listItem.getMeasuredHeight();
		}
		// setting listview item in adapter
		ViewGroup.LayoutParams params = myListView.getLayoutParams();
		params.height = totalHeight
				+ (myListView.getDividerHeight() * (myListAdapter.getCount() - 1));
		myListView.setLayoutParams(params);
		// print height of adapter on log
		Log.i("height of listItem:", String.valueOf(totalHeight));
	}

	/**
	 * set List View Height Based On Children If List View Items Text Is
	 * Changing At Runtime
	 * 
	 * @param listView
	 */

	public static List<Cookie> cookiesForPlanDetails;

	public static String readFromfiles(Context context) throws IOException {

		InputStream inputStream = context.getAssets().open(
				"contacts_code_mapping");

		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

		int i;
		// try {
		i = inputStream.read();
		while (i != -1) {
			byteArrayOutputStream.write(i);
			i = inputStream.read();
		}
		inputStream.close();

		return byteArrayOutputStream.toString();
	}


	
	

	// Hisham
	/**
	 * Show an alert wherever you like, you can pass any field null except
	 * activity.
	 * 
	 * @param activity
	 * @param title
	 * @param message
	 * @param buttonText
	 * @param isAlertCancelable
	 * @param finishActivityOnClickingOK
	 */
	public static void showAlert(final Activity activity, String title,
			String message, String buttonText, boolean isAlertCancelable,
			final boolean finishActivityOnClickingOK) {

//		int paddingLeft = (int) activity.getResources().getDimension(
//				R.dimen.d11);
//		int paddingTop = (int) activity.getResources().getDimension(R.dimen.d7);
//
//		TextView head = new TextView(activity);
//		head.setText(title);
//		head.setPadding(paddingLeft, paddingTop, paddingLeft, paddingTop);
//		head.setGravity(Gravity.CENTER);
//		head.setTextSize((int) (activity.getResources().getDimension(
//				R.dimen.font_ll) / activity.getResources().getDisplayMetrics().density));
//
//		ScrollView scroller = new ScrollView(activity);
//		TextView msg = new TextView(activity);
//		msg.setText(message);
//		msg.setPadding(paddingLeft, paddingTop, paddingLeft, paddingTop);
//		msg.setGravity(Gravity.CENTER);
//		msg.setTextSize((int) (activity.getResources().getDimension(
//				R.dimen.font_l) / activity.getResources().getDisplayMetrics().density));
//		scroller.addView(msg);

//		if (TextUtils.isEmpty(buttonText))
//			buttonText = "OK";
//
//		AlertDialog.Builder dialog = new AlertDialog.Builder(activity);
//
//		if (isAlertCancelable)
//			dialog.setCancelable(isAlertCancelable);
//		if (!TextUtils.isEmpty(title)) {
//			dialog.setCustomTitle(head);
//		}
//		dialog.setView(scroller);
//		dialog.setPositiveButton(buttonText,
//				new DialogInterface.OnClickListener() {
//
//					public void onClick(DialogInterface dialog, int which) {
//						if (finishActivityOnClickingOK) {
//							activity.finish();
//						}
//						dialog.dismiss();
//
//					}
//				});
//		dialog.show();
	}

	private static View error_view;
	static Activity activityForEnrollment;
	public static void showErrorMessage(String errormsg,int id, Activity a){
		activityForEnrollment=a;
		error_view = a.findViewById(id);
		error_view.setVisibility(View.VISIBLE);
		
//		TextView text = (TextView)error_view.findViewById(R.id.tv_error_message);
//		text.setText(errormsg);
//		Animation slideIn = AnimationUtils.loadAnimation(
//				a.getApplicationContext(), R.anim.error_slide_out);
//		error_view.startAnimation(slideIn);
	}

	// hisham
	public static void setupUI(View view,
			final HashMap<Integer, ViewFlipper> mapOfFlippers) {

		// Set up touch listener for non-text box views to hide keyboard.
		if (!(view instanceof ViewFlipper)) {
			view.setOnTouchListener(new OnTouchListener() {
				public boolean onTouch(View v, MotionEvent event) {
					// Error message visibility Gone if shown
					for (Integer key : mapOfFlippers.keySet()) {
						if (mapOfFlippers.get(key) != null
								&& mapOfFlippers.get(key).isShown()) {
							mapOfFlippers.get(key).setVisibility(View.GONE);
						}
					}
					if (error_view!=null && error_view.isShown()) {
						Animation slideout = AnimationUtils.loadAnimation(
								activityForEnrollment.getApplicationContext(), R.anim.error_slide_in);
						error_view.startAnimation(slideout);
						error_view.setVisibility(View.GONE);
					}
					
					return false;
				}
			
			});
		}
		

		
		// If a layout container, iterate over children and seed recursion upto
		// ViewFlipper
		if (view instanceof ViewGroup && !(view instanceof ViewFlipper)) {
			for (int i = 0; i < ((ViewGroup) view).getChildCount(); i++) {
				View innerView = ((ViewGroup) view).getChildAt(i);
				setupUI(innerView, mapOfFlippers);
			}
		}
	}

	/**
	 * Format to match phone numbers: xxx-xxx-xxxx
	 * <br> Return true if a match is found
	 * @param number
	 * @return
	 */
	public static boolean regexMatchesPhoneNumber(String number) {
		
	    return number.matches("^\\d{3}\\-\\d{3}\\-\\d{4}$");
	}
	/**
	 * Format to match ssn number: xxx-xx-xxxx
	 * <br> Return true if a match is found
	 * @param ssn
	 * @return
	 */
	public static boolean regexMatchesSSNNumber(String ssn) {
		
	    return ssn.matches("^\\d{3}\\-\\d{2}\\-\\d{4}$");
	}
}
