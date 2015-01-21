package com.example.globals;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.http.NameValuePair;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.example.textviewsoln.R;

public class Globals {


	public static String api_key = "AIzaSyDZkXov0rHAj2TOTt1mMJ5DlX7yo6n_DFE";
	public static String api_baseUrl = "https://maps.googleapis.com/maps/api/geocode/json";
	public static final byte HOME_ADDRESS_SAME_SUCCESSFULL = 1;
	public static final byte HOME_ADDRESS_SAME_FAILED = 2;

	public static final String prefs_tooltip = "AHCT_tooltip";
	public static final byte HOME_ADDRESS_DIFF_SUCCESSFULL = 3;
	public static final byte HOME_ADDRESS_DIFF_FAILED = 4;
	public static final byte PASSWORD_RESET_FAILURE = 9;
	public static final byte PASSWORD_RESET_SUCCESS = 10;
	public static final byte LOGIN_SUCCESFULLY = 5;
	public static final byte LOGIN_FAILED = 6;
	public static final byte REGISTRATION_SUCCESFULLY = 7;
	public static final byte REGISTRATION_FAILED = 8;
	public static final byte GET_APP_INFO_SUCCESSFULL = 9;
	public static final byte GET_APP_INFO_FAILED = 10;
	public static final byte HOUSEHOLD_JSON_SUCCESFULLY = 11;
	public static final byte HOUSEHOLD_JSON_FAILED = 12;
	public static String switchUser = "";
	public static final byte LOG_OUT_SUCCESSFULL = 13;
	public static final byte LOG_OUT_FAILED = 14;
	public static final byte AUTHREP_INFO_ADDRESS_SUCCESSFULL = 15;
	public static final byte AUTHREP_INFO_ADDRESS_FAILED = 16;
	public static final byte MAIL_ADDRESS_SUCCESSFULL = 17;
	public static final byte MAIL_ADDRESS_FAILED = 18;

	public static final byte INDIVIDUAL_ADDRESS_SAME_SUCCESSFULL = 21;
	public static final byte INDIVIDUAL_ADDRESS_SAME_FAILED = 22;

	public static final byte GET_TRIABES_SEARCH_SUCCESSFULL = 19;
	public static final byte GET_TRIABES_SEARCH_FAILED = 20;

	public static final byte ENROLL_QUALIFICATION_SUCCESSFULL = 21;
	public static final byte ENROLL_QUALIFICATION_FAILED = 22;

	public static final byte ASSISTER_LOOKUP_SUCCESSFULL = 23;
	public static final byte ASSISTER_LOOKUP_FAILED = 24;

	public static final byte GET_PLAN_DETAIL_SUCCESSFULL = 25;
	public static final byte GET_PLAN_DETAIL_FAILED = 26;

	public static boolean flagLM = false;
	public static boolean flagFLM = false;
	public static boolean flagLE = false;
	public static boolean flagFLE = false;
	public static boolean flagPFA = false;
	public static boolean flagMARRIAGE = false;
	public static boolean flagIM = false;
	public static boolean flagRE = false;
	public static boolean flagAI = false;

	// public static final CookieStore cookieStore = new BasicCookieStore();
	//
	// public static final HttpContext requestContext = new BasicHttpContext();
	//
	// static {
	// requestContext.setAttribute(ClientContext.COOKIE_STORE, cookieStore);
	// }

	// http://54.209.104.168:8080 changed on 10th sep

	// public static final String baseUrl =
	// "http://54.88.3.1:8080/hixservices/";

	// public static final String baseUrl =
	// "http://54.209.104.168:8080/ahctmobileapi/";
	/*** To change url of enroll only! to change for prescreening goto strings.cml in values ***/
	static {
		/**0-Dev
		  1-Stag
		  2-Prod **/
		int switchServers =0;
		if(switchServers==0){
			baseUrl = "http://ec2-54-173-83-120.compute-1.amazonaws.com/ahctmobileapi/"	;
			loginUrl ="http://ec2-54-173-83-120.compute-1.amazonaws.com/ahctmobileapi/pkmslogin.form?token=Unknown&language=EN" ;
			logoutUrl = "http://ec2-54-173-83-120.compute-1.amazonaws.com/pkmslogout?filename=ahctmobilelogout.html" ;
		}else if(switchServers==1){
			baseUrl = "https://staging.accesshealthct.com/ahctmobileapi/"	;
			loginUrl ="https://staging.accesshealthct.com/pkmslogin.form?token=Unknown&language=EN" ;
			logoutUrl = "https://staging.accesshealthct.com/pkmslogout?filename=ahctmobilelogout.html" ;
		}else{
			baseUrl = "https://www.accesshealthct.com/ahctmobileapi/"	;
			loginUrl ="https://www.accesshealthct.com/pkmslogin.form?token=Unknown&language=EN" ;
			logoutUrl = "https://www.accesshealthct.com/pkmslogout?filename=ahctmobilelogout.html" ;
		}
	}

	
	public static final String baseUrl ;
	public static final String loginUrl ;
	public static final String logoutUrl ;

//	public static final String logoutUrl = "http://54.83.27.121:8080/AHCTProxy0303/control/logout.json";
	public static final String householdInformation = baseUrl
			+ "HouseholdInformation";
	public static final String VerifyRemoteIDProofing = baseUrl
			+ "VerifyRemoteIDProofing";
	public static final String planPurchase = baseUrl + "PlanPurchase";
	public static final byte PLANPURCHASE_SAVE_SUCCESSFULL = 29;
	public static final byte PLANPURCHASE_SAVE_FAILED = 30;

	public static final String compeletePlanPurchase = baseUrl
			+ "CompletePlanPurchase";
	public static final byte FINAL_PLANPURCHASE_SAVE_SUCCESSFULL = 31;
	public static final byte FINAL_PLANPURCHASE_SAVE_FAILED = 32;

	public static final byte VERIFY_ZIP_SUCCESSFULL = 33;
	public static final byte VERIFY_ZIP_FAILED = 34;

	public static final String memberInformation = baseUrl
			+ "MemberInformation";
	public static final String specialEnrollmentQuestions = baseUrl
			+ "SpecialEnrollmentQuestions";
	public static final String EligibilityDetermination = baseUrl
			+ "EligibilityDetermination";
	public static final String AssisterLookup = baseUrl + "AssisterLookup";

	public static String sessionIdentifier = "null";
	  public static Calendar c = Calendar.getInstance();

	// static method
	public static boolean emailValidator(String email) {
		Pattern pattern;
		Matcher matcher;
		final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		pattern = Pattern.compile(EMAIL_PATTERN);
		matcher = pattern.matcher(email);
		return matcher.matches();
	}

//	public static boolean needToUpdateMailingAddress = false;

	public static HashMap<String, HashMap<String, String>> idProofingAnswersSaveMap = new HashMap<String, HashMap<String, String>>();
	public static int idProofingFragmentsManage = 0;
	public static ServiceModel tempServiceModelForSE;

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

	/******* Visibility Citizenship *********/
	public static HashMap<String, HashMap<Integer, Integer>> mapVisibilityCitizenship = new HashMap<String, HashMap<Integer, Integer>>();
	public static Map<String, List<String>> mapReferenceCitizenship = new HashMap<String, List<String>>();

	public static String getSuffixFromID(
			ArrayList<HashMap<String, String>> alSuffix, String code) {
		for (int j = 0; j < alSuffix.size(); j++) {

			Set<Entry<String, String>> set = alSuffix.get(j).entrySet();
			Iterator<Entry<String, String>> iterator = set.iterator();
			while (iterator.hasNext()) {
				Map.Entry<String, String> mentry = (Map.Entry<String, String>) iterator
						.next();
				if (mentry.getKey().equals(code)) {
					return mentry.getValue();
				}
			}
		}
		return null;
	}

	// void a(){
	// Integer[][] k = {{1,1,0,0,0,0,0,0,0,0,0},
	// {1,1,1,1,0,0,0,0,0,0,0},
	// {1,1,0,0,0,0,0,0,0,0,0},
	// {1,1,1,1,0,0,0,0,0,0,0},
	// {1,1,0,1,1,1,1,0,0,0,0},
	// {1,1,0,1,1,0,0,0,0,0,0},
	// {}};
	// for(int i=0;i<11;i++){
	// for(int j=0;j<14;j++){
	// if(k[i][j]==1){
	//
	// }else{
	// if(j==0){
	// al.set
	// }
	// }
	// }
	// }
	// }

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

	public static void getLastServiceHit(Context context) {

		SharedPreferenceMain sharedPref = new SharedPreferenceMain(context);

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

	public static boolean isSEAnsweredFromServer(
			SpecialEnrollmentQuestion specialEnrollmentQuestion) {
		if(specialEnrollmentQuestion.getMemberExistsYN()!=null){
			if (specialEnrollmentQuestion.getMemberExistsYN().equalsIgnoreCase("Y")) {
				return true;
			} else {
				return false;
			}
		}else{
			return false;
		}
	}
	

	public static boolean isSEAnsweredFromTempList(String Code,
			List<HouseholdMember> list) {
		Iterator<HouseholdMember> iterator = list.iterator();
		while (iterator.hasNext()) {
			HouseholdMember householdMember = (HouseholdMember) iterator.next();
			if (householdMember.getSpecialEnrollmentQuestionAnswers() != null) {
				List<SpecialEnrollmentQuestion> specialEnrollmentQuestions = householdMember
						.getSpecialEnrollmentQuestionAnswers();
				Iterator<SpecialEnrollmentQuestion> iterator2 = specialEnrollmentQuestions
						.iterator();
				while (iterator2.hasNext()) {
					SpecialEnrollmentQuestion specialEnrollmentQuestion = (SpecialEnrollmentQuestion) iterator2
							.next();
					if (specialEnrollmentQuestion.getReasonCodeText()
							.equalsIgnoreCase(Code)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public static boolean isSEAnsweredForMember(String Code,
			HouseholdMember householdMember) {
		if (householdMember.getSpecialEnrollmentQuestionAnswers() != null) {
			List<SpecialEnrollmentQuestion> specialEnrollmentQuestions = householdMember
					.getSpecialEnrollmentQuestionAnswers();
			Iterator<SpecialEnrollmentQuestion> iterator2 = specialEnrollmentQuestions
					.iterator();
			while (iterator2.hasNext()) {
				SpecialEnrollmentQuestion specialEnrollmentQuestion = (SpecialEnrollmentQuestion) iterator2
						.next();
				if (specialEnrollmentQuestion.getReasonCodeText()
						.equalsIgnoreCase(Code)) {
					return true;
				}
			}
		}
		return false;
	}

	public static void utilitySERemoveQuestion(String Code,
			List<HouseholdMember> list) {
		Iterator<HouseholdMember> iterator = list.iterator();
		while (iterator.hasNext()) {
			HouseholdMember householdMember = (HouseholdMember) iterator.next();
			if (householdMember.getSpecialEnrollmentQuestionAnswers() != null) {
				List<SpecialEnrollmentQuestion> specialEnrollmentQuestions = householdMember
						.getSpecialEnrollmentQuestionAnswers();
				Iterator<SpecialEnrollmentQuestion> iterator2 = specialEnrollmentQuestions
						.iterator();
				int i = 0;
				while (iterator2.hasNext()) {
					SpecialEnrollmentQuestion specialEnrollmentQuestion = (SpecialEnrollmentQuestion) iterator2
							.next();
					if (specialEnrollmentQuestion.getReasonCodeText()
							.equalsIgnoreCase(Code)) {
						iterator2.remove();
					}
					i++;
				}
			}
		}
	}

	public static void utilitySERemoveQuestionForMember(String Code, HouseholdMember householdMember) {
			
			if (householdMember.getSpecialEnrollmentQuestionAnswers() != null) {
				List<SpecialEnrollmentQuestion> specialEnrollmentQuestions = householdMember
						.getSpecialEnrollmentQuestionAnswers();
				Iterator<SpecialEnrollmentQuestion> iterator2 = specialEnrollmentQuestions
						.iterator();
			
				while (iterator2.hasNext()) {
					SpecialEnrollmentQuestion specialEnrollmentQuestion = (SpecialEnrollmentQuestion) iterator2
							.next();
					if (specialEnrollmentQuestion.getReasonCodeText()
							.equalsIgnoreCase(Code)) {
						iterator2.remove();
					}
					
				}
			}
	}
	
	public static SpecialEnrollmentQuestion getCurrentSEQuestion(HouseholdMember householdMember, String code){
		if (householdMember.getSpecialEnrollmentQuestionAnswers() != null) {
			List<SpecialEnrollmentQuestion> specialEnrollmentQuestions = householdMember
					.getSpecialEnrollmentQuestionAnswers();
			Iterator<SpecialEnrollmentQuestion> iterator2 = specialEnrollmentQuestions
					.iterator();
			while (iterator2.hasNext()) {
				SpecialEnrollmentQuestion specialEnrollmentQuestion = (SpecialEnrollmentQuestion) iterator2
						.next();
				if (specialEnrollmentQuestion.getReasonCodeText()
						.equalsIgnoreCase(code)) {
					return specialEnrollmentQuestion;
				}
			}
		}
		return null;

	}
	
	public static int getIndexOfPersonTempSE(String personID) {
		int s = 0;
		for (int i = 0; i < DataStatic.tempServiceModelForSE.getApp()
				.getHouseholdMembers().size(); i++) {
			if (DataStatic.tempServiceModelForSE.getApp()
					.getHouseholdMembers().get(i).getPersonId().toString()
					.equalsIgnoreCase(personID)) {
				s = i;
				break;
			}
		}
		return s;
	}


	public static HouseholdMember getCurrentHouseholdMemberInTempSE(
			String strPersonId) {
		int index = DataStatic.getIndexOfPersonTempSE(strPersonId);
		HouseholdMember householdMember = DataStatic.tempServiceModelForSE
				.getApp().getHouseholdMembers().get(index);
		return householdMember;
	}

	public static void setListViewHeightBasedOnChildrenIfListViewItemsTextIsChangingAtRuntime(
			ListView listView) {
		ListAdapter listAdapter = listView.getAdapter();
		if (listAdapter == null) {
			// pre-condition
			return;
		}

		int totalHeight = 0;
		for (int i = 0; i < listAdapter.getCount(); i++) {
			View listItem = listAdapter.getView(i, null, listView);
			listItem.measure(0, 0);
			totalHeight += listItem.getMeasuredHeight();
		}

		ViewGroup.LayoutParams params = listView.getLayoutParams();
		params.height = totalHeight
				+ (listView.getDividerHeight() * (listAdapter.getCount() - 1));
		listView.setLayoutParams(params);
	}

	public static String storedCookie() {

		String cookie = "iv-user=" + cookiesData.get(0) + ";" + "iv-groups="
				+ cookiesData.get(1);
		return cookie;
	}

	public static List<Cookie> cookiesForPlanDetails;

	// static arraylist
	public static ArrayList<HouseHoldModel> arrayListHouseHoldModel = new ArrayList<HouseHoldModel>();
	public static ArrayList<String> cookiesData = new ArrayList<String>();
	private static CookieStore cookieStore ;
	

	public static ArrayList<ServiceResponseModel> arrayListServiceResponseModel = new ArrayList<ServiceResponseModel>();
	public static ServiceModel serviceModel = new ServiceModel();
	public static ServiceModel tempServiceModel = new ServiceModel();
	public static ServiceModel tempServiceModelForCitizenship = new ServiceModel();
	public static String tempServiceModelJSON;
	// static variable
	public static int updatePostion = 0;
	public static boolean isDataFilled = false;

	public static String identifier1;
	public static String identifier2;
	public static String identifier3;
	public static String text1;
	public static String text2;
	public static String text3;

	public static void updateHouseholdMemberForCitizenshipStep2() {

		if (DataStatic.serviceModel.getApp() != null) {
			HouseHoldMemberWrapper.init();
			Iterator<HouseholdMember> iteratorH = DataStatic.serviceModel
					.getApp().getHouseholdMembers().iterator();
			while (iteratorH.hasNext()) {
				HouseholdMember householdMember = (HouseholdMember) iteratorH
						.next();
				HouseHoldMemberWrapper houseHoldMemberWrapper = new HouseHoldMemberWrapper();
				houseHoldMemberWrapper.setHouseHoldMember(householdMember);
				if (householdMember.getUsCitizenYN().equalsIgnoreCase("Y")) {
					houseHoldMemberWrapper.setSelectedUsCitizen(true);
					houseHoldMemberWrapper
							.setSelectedNaturalizationCitizen(false);
					houseHoldMemberWrapper
							.setSelectedEligibleImmigrationStatus(false);
				} else if (householdMember.getNaturalizedCitizenYN()
						.equals("Y")) {
					houseHoldMemberWrapper.setSelectedUsCitizen(false);
					houseHoldMemberWrapper
							.setSelectedNaturalizationCitizen(true);
					houseHoldMemberWrapper
							.setSelectedEligibleImmigrationStatus(false);

				} else if (householdMember.getEligibleImmigrantYN().equals("Y")) {
					houseHoldMemberWrapper.setSelectedUsCitizen(false);
					houseHoldMemberWrapper
							.setSelectedNaturalizationCitizen(false);
					houseHoldMemberWrapper
							.setSelectedEligibleImmigrationStatus(true);

				} else {
					houseHoldMemberWrapper.setSelectedUsCitizen(false);
					houseHoldMemberWrapper
							.setSelectedNaturalizationCitizen(false);
					houseHoldMemberWrapper
							.setSelectedEligibleImmigrationStatus(false);

				}

				HouseHoldMemberWrapper.getInstance()
						.add(houseHoldMemberWrapper);
			}
		}

	}

	// public static void updateHouseholdMemberForCitizenshipStep2Temp() {
	//
	// if (DataStatic.tempServiceModelForCitizenship.getApp() != null) {
	// HouseHoldMemberWrapper.initTemp();
	// Iterator<HouseholdMember> iteratorH =
	// DataStatic.tempServiceModelForCitizenship
	// .getApp().getHouseholdMembers().iterator();
	// while (iteratorH.hasNext()) {
	// HouseholdMember householdMember = (HouseholdMember) iteratorH
	// .next();
	// HouseHoldMemberWrapper houseHoldMemberWrapper = new
	// HouseHoldMemberWrapper();
	// houseHoldMemberWrapper.setHouseHoldMember(householdMember);
	// if (householdMember.getUsCitizenYN().equalsIgnoreCase("Y")) {
	// houseHoldMemberWrapper.setSelectedUsCitizen(true);
	// houseHoldMemberWrapper
	// .setSelectedNaturalizationCitizen(false);
	// houseHoldMemberWrapper
	// .setSelectedEligibleImmigrationStatus(false);
	// } else if (householdMember.getNaturalizedCitizenYN()
	// .equals("Y")) {
	// houseHoldMemberWrapper.setSelectedUsCitizen(false);
	// houseHoldMemberWrapper
	// .setSelectedNaturalizationCitizen(true);
	// houseHoldMemberWrapper
	// .setSelectedEligibleImmigrationStatus(false);
	//
	// } else if (householdMember.getEligibleImmigrantYN().equals("Y")) {
	// houseHoldMemberWrapper.setSelectedUsCitizen(false);
	// houseHoldMemberWrapper
	// .setSelectedNaturalizationCitizen(false);
	// houseHoldMemberWrapper
	// .setSelectedEligibleImmigrationStatus(true);
	//
	// }
	//
	// HouseHoldMemberWrapper.getInstanceTemp().add(
	// houseHoldMemberWrapper);
	// }
	// }
	//
	// }

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

	// public static ArrayList<CountryCode> parseCountryCodeNew(
	// Context context) throws IOException, JSONException {
	//
	// String CountryJson = readFromfiles(context);
	// Log.i("Countrycode", CountryJson);
	//
	// CountryCode countryCode = new CountryCode();
	// ArrayList<CountryCode> codeList = countryCode
	// .fromJson(CountryJson);
	//
	// Log.i("country code", codeList.toString());
	// return codeList;
	// }

	public static final byte ELIGIBILTY_RESULT_SUCCESSFULL = 25;
	public static final byte ELIGIBILTY_RESULT_FAILED = 26;
	public static final String ProgramSelection = baseUrl + "ProgramSelection";

	public static ArrayList<CountryCode> parseCountryCode(Context context)
			throws IOException, JSONException {

		String CountryJson = readFromfiles(context);
		Log.i("Countrycode", CountryJson);

		CountryCode countryCode = new CountryCode();
		ArrayList<CountryCode> codeList = countryCode.fromJson(CountryJson);

		Log.i("country code", codeList.toString());
		return codeList;

	}

	// public static ArrayList<RelationTempModel> alRelation = new
	public static final String AssisterSave = baseUrl + "SaveAssister";
	public static final byte ASSISTER_SAVE_SUCCESSFULL = 27;
	public static final byte ASSISTER_SAVE_FAILED = 28;
	// ArrayList<RelationTempModel>();
	public static ArrayList<SpecialEnrollmentQuestionMetaDataListAnswersModel> alSeqm = new ArrayList<SpecialEnrollmentQuestionMetaDataListAnswersModel>();
	// private ArrayList<RelationTempModel> alRelation=new
	// ArrayList<RelationTempModel>();

	// public static ArrayList<RelationTempModel> alRelation = new
	// ArrayList<RelationTempModel>();

	private static HashMap<String, ArrayList<HashMap<String, String>>> relationshipMap = new HashMap<String, ArrayList<HashMap<String, String>>>();

	public static HashMap<String, ArrayList<HashMap<String, String>>> getRelationshipMap() {
		return relationshipMap;
	}

	public static void setRelationshipMap(
			HashMap<String, ArrayList<HashMap<String, String>>> relationshipMap) {
		DataStatic.relationshipMap = relationshipMap;
	}

	public static String getRelationship(String personA, String personB) {
		String relationship = "";

		Iterator<HashMap<String, String>> i = DataStatic.getRelationshipMap()
				.get(personA).iterator();

		while (i.hasNext()) {
			HashMap<String, String> m = i.next();
			relationship = m.get(personB);
			if (relationship != null) {
				break;
			}
		}
		return relationship;
	}

	public static HashMap<String, ArrayList<String>> getMapreciprocal() {
		return mapReciprocal;
	}

	public static boolean isSessionExpired(String jsonResult) {
		if (jsonResult.contains("/pkmslogin.form?token=Unknown&language=EN")) {
			return true;
		} else {
			return false;
		}
	}

	static Context contextForLogin;
	static String service;

	public static void reLogin(Context context, String service) {
		contextForLogin = context;
		LoginTask task = new LoginTask();
		DataStatic.service = service;
		checkForSuccessLogin = 0;
		task.execute(new String[] {});
	}
	
	public static void reLogin(Context context, String service,Dialog dialogLoader,ImageView ivLoaderBackground,TextView tvLoaderMeassage) {
		contextForLogin = context;
		LoginTask task = new LoginTask();
		DataStatic.service = service;
		checkForSuccessLogin = 0;
		DataStatic.dialogLoader = dialogLoader;
		DataStatic.ivLoaderBackground = ivLoaderBackground;
		DataStatic.tvLoaderMeassage = tvLoaderMeassage;
		task.execute(new String[] {});
	}

	private static List<NameValuePair> getRequestData(Context context) {

		List<NameValuePair> requestData = new ArrayList<NameValuePair>();
		requestData.add(new NameValuePairClass("username", AppUtill
				.getUserId(context)));
		requestData.add(new NameValuePairClass("password", AppUtill
				.getPassword(context)));
		requestData.add(new NameValuePairClass("login-form-type",
				"pwd"));

		return requestData;
	}

	static class LoginTask extends AsyncTask<String, Void, String> {

		protected void onPreExecute() {
			super.onPreExecute();

		}

		protected String doInBackground(String... urls) {
			String resp = "";

			JsonCall jc = new JsonCall();
			resp = jc.postRequest(getRequestData(contextForLogin),
					DataStatic.loginUrl);
			Log.e("result", "resp:" + resp);

			return resp;
		}

		protected void onPostExecute(String result) {
			// {"authenticated":true,"firstName":"Peter","lastName":"Pan","middleName":"","userId":"peterpan44"}
			
			String resString = "";
			try {

				String german = StringEscapeUtils.unescapeJava(result);
				InputStream is = new ByteArrayInputStream(german.getBytes());
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(is, "" + "UTF-8"), 8);
				StringBuilder sb = new StringBuilder();
				String line = null;
				while ((line = reader.readLine()) != null)
					// Read line by line
					sb.append(StringEscapeUtils.unescapeJava(line + "\n"));

				resString = sb.toString(); // Result is here

				int start = resString.indexOf("<TITLE>");
				int end = resString.indexOf("</TITLE>");
				resString = resString.substring(start + 7, end).trim();

				// Login Success
				is.close();

				// Intent i = new Intent(context, EnrollActivity.class);
				// sharedPref.setEnrollLogin(true);

				DataStatic.logout = 1;
				// Log.e("LOGOUT_bool", sharedPref.getEnrollLogin()+"");

				// startActivity(i);
			} catch (Exception e) {
				// TODO: handle exception
			}

			if (resString.equals("Login Success")) {
				// sharedPref.setEnrollLogin(true);
				AppUtill.setIsLogin(contextForLogin, true);
				// AppUtill.setUserId(context, etUserId.getText().toString());
				hitServicePrevious();
			} else {
				stopService();
				// Toast.makeText(EnrollLogin.this, "Login Failed",
				// Toast.LENGTH_SHORT).show();
			}

//			try {
//				if (result != null) {
//					JSONObject jo = new JSONObject(result);
//					if (!jo.has("errorCode")) {
//
//						if (jo.getString("authenticated").equalsIgnoreCase(
//								"true")) {
//
//							// Login sucessful
//							hitServicePrevious();
//
//						} else {
//							// hitServicePrevious();
//						}
//
//					} else {
//						// hitServicePrevious();
//
//					}
//				} else {
//					// hitServicePrevious();
//
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//				// hitServicePrevious();
//				stopService();
//			}

		}
	}

	static int checkForSuccessLogin = 0;

	public static void hitServicePrevious() {
		if (DataStatic.service
				.equalsIgnoreCase("getApplicationInformationEnroll")) {
			EnrollActivity.getApplicationInformation();
		} else if (DataStatic.service.equalsIgnoreCase("BYH")) {
			SharedPreferenceMain sharedPreference = new SharedPreferenceMain(
					contextForLogin);
			BuildYourHousehold.hitBYH(sharedPreference);
		} else if (DataStatic.service.equalsIgnoreCase("IdProofing")) {
			IdProofing.hitIDProofingService();

		} else if (DataStatic.service.equalsIgnoreCase("IndividualDetails")) {
			IndividualDetail.hitIndividualDetails();

		} else if (DataStatic.service.equalsIgnoreCase("SpecialEnrollment")) {
			SpecialEnrollment.hitSpecialEnrollment();

		} else if (DataStatic.service.equalsIgnoreCase("Esiging")) {
			Esigning.hitEsigning();

		} else if (DataStatic.service.equalsIgnoreCase("YearlyRenewals")) {
			YearlyRenewals.hitYearlyRenewals();

		} else if (DataStatic.service.equalsIgnoreCase("ProgramSelection")) {
			EligibilityResult.hitProgramSelection();

		} else if (DataStatic.service
				.equalsIgnoreCase("ApplicationInformationEnroll")) {
			EligibilityResult.hitService();
		} else if (DataStatic.service.equalsIgnoreCase("AssisterSave")) {
			AssistanceQuestionaire.hitAssisterSave();
		} else if (DataStatic.service.equalsIgnoreCase("LookUpData")) {
			AssisterList.getLookUpData();
		} else if (DataStatic.service.equalsIgnoreCase("PlanPurchaseSave")) {
			PlanSelection.hitService(PlanSelection.selectedPlan);
		} else if (DataStatic.service.equalsIgnoreCase("GetPlanDetail")) {
			PlanDetailEnroll.hitPlanDetail();
		} else if (DataStatic.service.equalsIgnoreCase("CompeletePlanPurchase")) {
			FinalConfirmation.hitCompeletePlanPurchase();
		} else if (DataStatic.service.equalsIgnoreCase("Plansummary")) {
			PlanSummary.hitService();
		}
	}
	
	private static Dialog dialogLoader;
	private static ImageView ivLoaderBackground;
	private static TextView tvLoaderMeassage;

	
	public static void stopService(){
		AppUtill.setIsLogin(contextForLogin, false);
		LogoutTask task = new LogoutTask();
		task.execute(new String[] {});
	}
	
	

	private static class LogoutTask extends AsyncTask<String, Void, String> {

		protected void onPreExecute() {
			super.onPreExecute();			
		}

		protected String doInBackground(String... urls) {
			String resp = "";
		

				JsonCall jc = new JsonCall();
				resp = jc.hitUrl(contextForLogin.getString(R.string.base_url)+contextForLogin.getString(R.string.url_logout));
				Log.e("result", "resp:" + resp);
			
			return resp;
		}

		protected void onPostExecute(String result) {
			// {"authenticated":true,"firstName":"Peter","lastName":"Pan","middleName":"","userId":"peterpan44"}
			try {
				
				if (result != null) {
					JSONObject jo = new JSONObject(result);
					if (jo.getString("authenticated").equalsIgnoreCase("true")) {
						AppUtill.setIsLogin(contextForLogin, true);
						if (dialogLoader != null && dialogLoader.isShowing()) {
							// progress.cancel();
							ivLoaderBackground.setVisibility(View.INVISIBLE);
							tvLoaderMeassage.setText("Session Expired!");
							dialogLoader.dismiss();
						}


					} else {
						if (dialogLoader != null && dialogLoader.isShowing()) {
							// progress.cancel();
							ivLoaderBackground.setVisibility(View.INVISIBLE);
							tvLoaderMeassage.setText("Session Expired!");
							dialogLoader.dismiss();
						}

						AppUtill.setIsLogin(contextForLogin, false);
				
						Intent i = new Intent(contextForLogin, EnrollLogin.class);
						i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
						i.putExtra("logout", 1);
						contextForLogin.startActivity(i);
					}

				}
			} catch (Exception e) {
				e.printStackTrace();
				if (dialogLoader != null && dialogLoader.isShowing()) {
					// progress.cancel();
					ivLoaderBackground.setVisibility(View.INVISIBLE);
					tvLoaderMeassage.setText("Session Expired!");
					dialogLoader.dismiss();
				}
				Intent i = new Intent(contextForLogin, EnrollLogin.class);
				i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				i.putExtra("logout", 1);
				contextForLogin.startActivity(i);

			}
		}
	}

	
	// public static boolean isHitPreviousService() {
	// Thread t = new Thread(new Runnable() {
	//
	// @Override
	// public void run() {
	// synchronized(lock){
	// // while (checkForSuccessLogin == 0){
	// try {
	// lock.wait(1000);
	// } catch (InterruptedException e) {
	// e.printStackTrace();
	// }
	// // }
	// }
	// }
	// });
	// t.run();
	// if (checkForSuccessLogin == 1) {
	// return false;
	// } else {
	// return true;
	// }
	//
	// }
	//
	// private static final Object lock = new Object();
	// static void reLoginFail() {
	// synchronized(lock){
	// //set ready flag to true (so isReady returns true)
	// checkForSuccessLogin = 1;
	// lock.notifyAll();
	// }
	//
	// }
	//
	// static void reLoginSuccess() {
	// synchronized(lock){
	// //set ready flag to true (so isReady returns true)
	// checkForSuccessLogin = 2;
	// lock.notifyAll();
	// }
	//
	// }

	public static HashMap<String, String> mapInner = new HashMap<String, String>();

	private static final HashMap<String, ArrayList<String>> mapReciprocal = new HashMap<String, ArrayList<String>>();

	static {
		ArrayList<String> list = new ArrayList<String>();
		list.add("2057");
		mapReciprocal.put("2057", list);
		list = new ArrayList<String>();
		list.add("2050");
		mapReciprocal.put("2050", list);
		list = new ArrayList<String>();
		list.add("2189");
		list.add("2044");
		mapReciprocal.put("2187", list);
		list = new ArrayList<String>();
		list.add("2192");
		mapReciprocal.put("2191", list);
		list = new ArrayList<String>();
		list.add("2047");
		mapReciprocal.put("2188", list);
		list = new ArrayList<String>();
		list.add("2187");
		mapReciprocal.put("2189", list);
		list = new ArrayList<String>();
		list.add("2191");
		mapReciprocal.put("2192", list);
		list = new ArrayList<String>();
		list.add("2188");
		mapReciprocal.put("2047", list);
		list = new ArrayList<String>();
		list.add("2045");
		mapReciprocal.put("2045", list);
		list = new ArrayList<String>();
		list.add("2058");
		mapReciprocal.put("2193", list);
		list = new ArrayList<String>();
		list.add("2193");
		mapReciprocal.put("2058", list);
		list = new ArrayList<String>();
		list.add("2051");
		mapReciprocal.put("2051", list);
		list = new ArrayList<String>();
		list.add("2054");
		mapReciprocal.put("2055", list);
		list = new ArrayList<String>();
		list.add("2055");
		mapReciprocal.put("2054", list);
		list = new ArrayList<String>();
		list.add("2187");
		mapReciprocal.put("2044", list);
		list = new ArrayList<String>();
		list.add("2194");
		mapReciprocal.put("2046", list);
		list = new ArrayList<String>();
		list.add("2049");
		mapReciprocal.put("2048", list);
		list = new ArrayList<String>();
		list.add("2048");
		mapReciprocal.put("2049", list);
		list = new ArrayList<String>();
		list.add("2059");
		list.add("2060");
		mapReciprocal.put("2052", list);
		list = new ArrayList<String>();
		list.add("2053");
		mapReciprocal.put("2053", list);
		list = new ArrayList<String>();
		list.add("2194");
		mapReciprocal.put("2056", list);
		list = new ArrayList<String>();
		list.add("2059");
		mapReciprocal.put("2059", list);
		list = new ArrayList<String>();
		list.add("2060");
		mapReciprocal.put("2060", list);
		list = new ArrayList<String>();
		list.add("2190");
		mapReciprocal.put("2190", list);
		list = new ArrayList<String>();
		list.add("3212");
		mapReciprocal.put("3212", list);
		list = new ArrayList<String>();
		list.add("3213");
		mapReciprocal.put("3213", list);
		list = new ArrayList<String>();
		list.add("2046");
		list.add("2056");
		mapReciprocal.put("2194", list);

	}

	public static ArrayList<String> findResibrocal(String a) {
		ArrayList<String> s = DataStatic.mapReciprocal.get(a);
		return s;
	}

	// public static int flagRelation=0;
	public static int logout = 0;

	public Boolean checkResebrocal(String keyA) {
		if (DataStatic.getRelationshipMap().containsKey(keyA)) {
			return true;
		} else {
			return false;
		}
	}

	public static HashMap<String, ArrayList<String>> getRelationshipReciprocal(
			String keyB) {
		String relationship = "";
		ArrayList<String> getResi = new ArrayList<String>();
		HashMap<String, ArrayList<String>> getAllResi = new HashMap<String, ArrayList<String>>();

		Set<String> key = DataStatic.getRelationshipMap().keySet();
		Iterator<String> i = key.iterator();
		while (i.hasNext()) {
			String ii = i.next();
			relationship = getRelationship(ii, keyB);
			if (relationship != null) {
				getResi = DataStatic.findResibrocal(relationship);
				getAllResi.put(ii.toString(), getResi);
			}

		}

		return getAllResi;
	}

	public static int checker = 0;

	public static ArrayList<RelationManagementForIndividualDetails> relationsArrayForRMFID = new ArrayList<RelationManagementForIndividualDetails>();

	public static ArrayList<RelationManagementForIndividualDetails> getRelationsArrayForRMFID() {
		return relationsArrayForRMFID;
	}

	public static void setRelationsArrayForRMFID(
			ArrayList<RelationManagementForIndividualDetails> relationsArrayForRMFID) {
		DataStatic.relationsArrayForRMFID = relationsArrayForRMFID;
	}

	public static int checkerRelation = 0;

	public static int getIndexOfMaster = 0;

	public static ArrayList<String> getReverseRelation(
			String relationshipCodeNumber) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList = DataStatic.mapReciprocal.get(relationshipCodeNumber);
		return arrayList;
	}

	public static int getIndexOfPerson(String personID) {
		int s = 0;
		for (int i = 0; i < DataStatic.serviceModel.getApp()
				.getHouseholdMembers().size(); i++) {
			if (DataStatic.serviceModel.getApp().getHouseholdMembers().get(i)
					.getPersonId().toString().equalsIgnoreCase(personID)) {
				s = i;
				break;
			}
		}
		return s;
	}

	public static int getIndexOfPersonWrapperInstance(String personID) {
		int s = 0;
		for (int i = 0; i < HouseHoldMemberWrapper.getInstance().size(); i++) {
			if (HouseHoldMemberWrapper.getInstance().get(i)
					.getHouseHoldMember().getPersonId().toString()
					.equalsIgnoreCase(personID)) {
				s = i;
				break;
			}
		}
		return s;
	}

	public static HouseholdMember getCurrentHouseholdMemberInTemp(
			String strPersonId) {
		int index = DataStatic.getIndexOfPersonTemp(strPersonId);
		HouseholdMember householdMember = DataStatic.tempServiceModelForCitizenship
				.getApp().getHouseholdMembers().get(index);
		return householdMember;
	}

	public static int getIndexOfPersonTemp(String personID) {
		int s = 0;
		for (int i = 0; i < DataStatic.tempServiceModelForCitizenship.getApp()
				.getHouseholdMembers().size(); i++) {
			if (DataStatic.tempServiceModelForCitizenship.getApp()
					.getHouseholdMembers().get(i).getPersonId().toString()
					.equalsIgnoreCase(personID)) {
				s = i;
				break;
			}
		}
		return s;
	}
	


	public static String getRelationshipBetweenTwo(String personA,
			String personB) {
		String relation = "";
		int personAIndex = DataStatic.getIndexOfPerson(personA);
		int personBIndex = DataStatic.getIndexOfPerson(personB);
		if (personAIndex > personBIndex) {
			relation = DataStatic.serviceModel.getApp().getHouseholdMembers()
					.get(personAIndex).getRelations().get(personBIndex)
					.getRelationCodeNbr()
					+ "";
		} else {
			relation = DataStatic.serviceModel.getApp().getHouseholdMembers()
					.get(personAIndex).getRelations().get(personBIndex - 1)
					.getRelationCodeNbr()
					+ "";
		}
		return relation;
	}

	public static Boolean hasGreaterSequence(String personA, String personB) {
		int personAIndex = DataStatic.getIndexOfPerson(personA);
		int personBIndex = DataStatic.getIndexOfPerson(personB);
		if (DataStatic.serviceModel.getApp().getHouseholdMembers()
				.get(personAIndex).getMemberSequenceNumber() > DataStatic.serviceModel
				.getApp().getHouseholdMembers().get(personBIndex)
				.getMemberSequenceNumber()) {
			return true;
		} else {
			return false;
		}
	}

	public static String getRelationsFilledStatus(String personID) {
		String s = "Blank";
		int checkForNull = 0;
		int checkForNullNot = 0;
		int personIndex = DataStatic.getIndexOfPerson(personID);
		List<MemberRelation> arrayListOfRelationModel = DataStatic.serviceModel
				.getApp().getHouseholdMembers().get(personIndex).getRelations();
		Iterator<MemberRelation> iterator = arrayListOfRelationModel.iterator();
		while (iterator.hasNext()) {
			MemberRelation relationModel = (MemberRelation) iterator.next();
			String getRelatedCodeNumber = relationModel.getRelationCodeNbr()
					+ "";
			if (getRelatedCodeNumber.equalsIgnoreCase("null")) {
				checkForNull = 1;
			} else {
				checkForNullNot = 1;
			}
		}
		if (checkForNull == 1 && checkForNullNot == 1) {
			s = "Partially";
		} else if (checkForNull == 0) {
			s = "Provided";
		} else {
			s = "Blank";
		}
		return s;
	}

	public static Boolean isClearRestOfRelationships(String personEditor,
			String personToBeChanged) {
		int personToBeChangedIndex = DataStatic
				.getIndexOfPerson(personToBeChanged);
		int personEditorIndex = DataStatic.getIndexOfPerson(personEditor);
		if (DataStatic.serviceModel.getApp().getHouseholdMembers()
				.get(personToBeChangedIndex).getMemberSequenceNumber() > DataStatic.serviceModel
				.getApp().getHouseholdMembers().get(personEditorIndex)
				.getMemberSequenceNumber()) {
			List<MemberRelation> arrayListRelationModel = DataStatic.serviceModel
					.getApp().getHouseholdMembers().get(personToBeChangedIndex)
					.getRelations();
			Iterator<MemberRelation> iterator = arrayListRelationModel
					.iterator();
			int counter = 0;
			while (iterator.hasNext()) {
				MemberRelation relationModel = (MemberRelation) iterator.next();
				if (relationModel.getRelatedPersonId().toString()
						.equalsIgnoreCase(personEditor)) {
					MemberRelation relationModelNew = relationModel;
					relationModelNew.setRelationCodeNbr(null);
					DataStatic.serviceModel.getApp().getHouseholdMembers()
							.get(personToBeChangedIndex).getRelations()
							.set(counter, relationModelNew);
				}
				counter++;
			}
			return true;
		} else {
			return false;
		}
	}

	public static Boolean isMaritialStatusKnown(String personID) {
		if (DataStatic.mapInner.containsValue("2057")) {
			return true;
		} else {
			return DataStatic.maritialStatusKnownFromServer(personID);
		}
	}

	public static Boolean martialStatusKnownFromList(String personID) {
		if (DataStatic.mapInner.containsValue("2057")) {
			return true;
		} else {
			return false;
		}

	}

	public static Boolean maritialStatusKnownFromServer(String personID) {
		int personIndex = DataStatic.getIndexOfPerson(personID);
		String isKnowFromServer = DataStatic.serviceModel.getApp()
				.getHouseholdMembers().get(personIndex).getMarriedYN()
				+ "";
		if (isKnowFromServer.equalsIgnoreCase("null")) {
			return false;
		} else {
			return true;
		}
	}

	public static int checkMarried = 2;
	public static int onItemClickCheckMarried = 0;

	public static String isMarried(String personID) {
		int personIndex = DataStatic.getIndexOfPerson(personID);
		String isKnowFromServer = DataStatic.serviceModel.getApp()
				.getHouseholdMembers().get(personIndex).getMarriedYN()
				+ "";
		if (DataStatic.maritialStatusKnownFromServer(personID)) {
			if (isKnowFromServer.equalsIgnoreCase("Y")) {
				return "true";
			} else {
				return "false";
			}
		} else {
			return "null";
		}
	}

	public static Boolean isShowMaritialStatus(String personID) {
		if (DataStatic.isMaritialStatusKnown(personID)) {
			if (DataStatic.martialStatusKnownFromList(personID)) {
				return false;
			} else {
				return true;
			}
		} else {
			Iterator<String> i = DataStatic.mapInner.values().iterator();
			while (i.hasNext()) {
				String string = (String) i.next();
				if (string.equalsIgnoreCase("null")) {

				} else {
					return true;
				}
			}
			return false;
		}
	}

	// public static ArrayList<ServiceResponseModel> alSrmBackup = new
	// ArrayList<ServiceResponseModel>();
	//
	// public static void takeBackup() {
	// DataStatic.alSrmBackup.add(DataStatic.arrayListServiceResponseModel
	// .get(0));
	// }
	//
	// public static void setBackup() {
	// if (DataStatic.alSrmBackup.isEmpty()) {
	//
	// } else {
	// DataStatic.arrayListServiceResponseModel.set(0,
	// DataStatic.alSrmBackup.get(0));
	// DataStatic.alSrmBackup.clear();
	// }
	// }

	// public static void deleteBackup() {
	// DataStatic.alSrmBackup.clear();
	// }

	public static int checkOnItemClicked = 0;

	public static String getPrimaryApplicantName() {
		if ((DataStatic.serviceModel.getApp().getHouseholdMembers().get(0)
				.getName().getMiddleName() + "").equalsIgnoreCase("null")) {
			return DataStatic.serviceModel.getApp().getHouseholdMembers()
					.get(0).getName().getFirstName()
					+ " "
					+ DataStatic.serviceModel.getApp().getHouseholdMembers()
							.get(0).getName().getLastName();
		} else {
			return DataStatic.serviceModel.getApp().getHouseholdMembers()
					.get(0).getName().getFirstName()
					+ " "
					+ DataStatic.serviceModel.getApp().getHouseholdMembers()
							.get(0).getName().getMiddleName()
					+ " "
					+ DataStatic.serviceModel.getApp().getHouseholdMembers()
							.get(0).getName().getLastName();
		}
	}

	public static Boolean checkESignatureName(String personName) {
		if (personName.equalsIgnoreCase(DataStatic.getPrimaryApplicantName())) {
			return true;
		} else {
			return false;
		}

	}

	// Returns empty array if no error message
	public static ArrayList<String> getErrorMessageFromServer() {
		List<UserMessage> alMessagesModel = new ArrayList<UserMessage>();
		ArrayList<String> arrayListErrorMessages = new ArrayList<String>();
		if (DataStatic.serviceModel.getMessages() != null) {
			if (DataStatic.serviceModel.getMessages().size() > 0) {

				alMessagesModel = DataStatic.serviceModel.getMessages();
				Iterator<UserMessage> iterator = alMessagesModel.iterator();
				while (iterator.hasNext()) {
					UserMessage messagesModel = (UserMessage) iterator.next();
					if (messagesModel.getSeverity().getDescription()
							.equalsIgnoreCase("FATAL")) {
						arrayListErrorMessages.add(messagesModel
								.getErrorMessage());
					}
				}
			} else {

			}
		}
		return arrayListErrorMessages;
	}

	public static ArrayList<String> getErrorMessageFromServerNewModel() {
		List<UserMessage> alMessagesModel = new ArrayList<UserMessage>();
		ArrayList<String> arrayListErrorMessages = new ArrayList<String>();
		if (DataStatic.serviceModel.getMessages().size() > 0) {
			alMessagesModel = DataStatic.serviceModel.getMessages();
			Iterator<UserMessage> iterator = alMessagesModel.iterator();
			while (iterator.hasNext()) {
				UserMessage messagesModel = (UserMessage) iterator.next();
				if (messagesModel.getSeverity().getDescription()
						.equalsIgnoreCase("FATAL")) {
					arrayListErrorMessages.add(messagesModel.getErrorMessage());
				}
			}
		} else {

		}
		return arrayListErrorMessages;
	}

	public static HashMap<String, String> mapSpecialEnrolment = new HashMap<String, String>();
	public static HashMap<String, String> mapOpenEnrolment = new HashMap<String, String>();

	public static ArrayList<EligibilityProgram> getAllSpecialEnrolmentProgramsForPerson(
			String personID, ArrayList<HouseHoldMemberWrapper> list) {
		ArrayList<EligibilityProgram> arrayList = new ArrayList<EligibilityProgram>();
		int personIndex = DataStatic.getIndexOfPerson(personID);
		Iterator<EligibilityProgram> iterator = list.get(personIndex)
				.getHouseHoldMember().getEligibility().getPrograms().iterator();
		while (iterator.hasNext()) {
			EligibilityProgram householdMembersModelEligibilityEligibilityProgramsModel = (EligibilityProgram) iterator
					.next();
			if (householdMembersModelEligibilityEligibilityProgramsModel
					.getEnrollmentType().equalsIgnoreCase("SE")) {
				arrayList
						.add(householdMembersModelEligibilityEligibilityProgramsModel);
			}
		}
		return arrayList;
	}

	public static ArrayList<EligibilityProgram> getAllOpenEnrollmentProgramsForPerson(
			String personID, ArrayList<HouseHoldMemberWrapper> list) {
		ArrayList<EligibilityProgram> arrayList = new ArrayList<EligibilityProgram>();
		int personIndex = DataStatic.getIndexOfPerson(personID);
		Iterator<EligibilityProgram> iterator = list.get(personIndex)
				.getHouseHoldMember().getEligibility().getPrograms().iterator();
		while (iterator.hasNext()) {
			EligibilityProgram householdMembersModelEligibilityEligibilityProgramsModel = (EligibilityProgram) iterator
					.next();
			if (householdMembersModelEligibilityEligibilityProgramsModel
					.getEnrollmentType().equalsIgnoreCase("OE")) {
				arrayList
						.add(householdMembersModelEligibilityEligibilityProgramsModel);
			}
		}
		return arrayList;
	}

	public static String getNameOfPerson(String personID) {
		int personIndex = DataStatic.getIndexOfPerson(personID);
		String name = DataStatic.serviceModel.getApp().getHouseholdMembers()
				.get(personIndex).getName().getFirstName()
				+ " "
				+ DataStatic.serviceModel.getApp().getHouseholdMembers()
						.get(personIndex).getName().getLastName();
		return name;
	}

	/************************************* Check if next to be shown *************************************/

	public static Boolean isEligibleOpen(String personID) {
		int personIndex = DataStatic.getIndexOfPerson(personID);
		int check2 = 0;
		Iterator<EligibilityProgram> iterator = DataStatic.serviceModel
				.getApp().getHouseholdMembers().get(personIndex)
				.getEligibility().getPrograms().iterator();
		while (iterator.hasNext()) {
			EligibilityProgram householdMembersModelEligibilityEligibilityProgramsModel = (EligibilityProgram) iterator
					.next();
			if (householdMembersModelEligibilityEligibilityProgramsModel
					.getEnrollmentType().equalsIgnoreCase("OE")
					&& householdMembersModelEligibilityEligibilityProgramsModel
							.getStatusCode().equalsIgnoreCase("EL")) {
				check2 = 1;
			} else {

			}
		}
		if (check2 == 1) {
			return true;
		} else {
			return false;
		}

	}

	public static Boolean isEligibleSpecial(String personID) {
		int personIndex = DataStatic.getIndexOfPerson(personID);
		int check2 = 0;
		Iterator<EligibilityProgram> iterator = DataStatic.serviceModel
				.getApp().getHouseholdMembers().get(personIndex)
				.getEligibility().getPrograms().iterator();
		while (iterator.hasNext()) {
			EligibilityProgram householdMembersModelEligibilityEligibilityProgramsModel = (EligibilityProgram) iterator
					.next();
			if (householdMembersModelEligibilityEligibilityProgramsModel
					.getEnrollmentType().equalsIgnoreCase("SE")
					&& householdMembersModelEligibilityEligibilityProgramsModel
							.getStatusCode().equalsIgnoreCase("EL")) {
				check2 = 1;

			} else {

			}
		}
		if (check2 == 1) {
			return true;
		} else {
			return false;
		}

	}

	public static Boolean isAnyEligibleOpen() {
		Iterator<HouseholdMember> iterator = DataStatic.serviceModel.getApp()
				.getHouseholdMembers().iterator();
		while (iterator.hasNext()) {
			HouseholdMember householdMembersModel = (HouseholdMember) iterator
					.next();
			if (isEligibleOpen(householdMembersModel.getPersonId().toString())) {
				return true;
			} else {

			}
		}
		return false;
	}

	public static Boolean isAnyEligibleSpecial() {
		Iterator<HouseholdMember> iterator = DataStatic.serviceModel.getApp()
				.getHouseholdMembers().iterator();
		while (iterator.hasNext()) {
			HouseholdMember householdMembersModel = (HouseholdMember) iterator
					.next();
			if (isEligibleSpecial(householdMembersModel.getPersonId()
					.toString())) {
				return true;
			} else {

			}
		}
		return false;
	}

	public static Boolean isNextButtonToBeShown() {
		if (isNextClickable()) {
			return true;
		} else {
			if (isAnyEligibleOpen() || isAnyEligibleSpecial()) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static Boolean isNextButtonTobeShownUsingFlowState() {
		if (DataStatic.serviceModel.getApp().getFlowState()
				.isNotEligibleToEnroll()
				|| DataStatic.serviceModel.getApp().getFlowState()
						.isEnrollmentComplete()) {
			return false;
		} else {
			return true;
		}
	}

	/************************************* Check if next clickable *************************************/
	public static Boolean isPossibleSpecialEnrolmentChecked(String personID) {
		int personIndex = DataStatic.getIndexOfPerson(personID);
		int check2 = 0;
		Iterator<EligibilityProgram> iterator = DataStatic.serviceModel
				.getApp().getHouseholdMembers().get(personIndex)
				.getEligibility().getPrograms().iterator();
		while (iterator.hasNext()) {
			EligibilityProgram householdMembersModelEligibilityEligibilityProgramsModel = (EligibilityProgram) iterator
					.next();
			if (householdMembersModelEligibilityEligibilityProgramsModel
					.getEnrollmentType().equalsIgnoreCase("SE")) {
				if (householdMembersModelEligibilityEligibilityProgramsModel
						.getStatusCode().equalsIgnoreCase("EL")) {
					if ((householdMembersModelEligibilityEligibilityProgramsModel
							.getSelectedYN() + "").equalsIgnoreCase("Y")) {

					} else {
						check2 = 1;
					}
				}

			}

		}
		if (check2 == 1) {
			return false;
		} else {
			return true;
		}

	}

	public static Boolean isAllPossibleSpecialEnrolmentChecked() {
		Iterator<HouseholdMember> iterator = DataStatic.serviceModel.getApp()
				.getHouseholdMembers().iterator();
		while (iterator.hasNext()) {
			HouseholdMember householdMembersModel = (HouseholdMember) iterator
					.next();
			if (isPossibleSpecialEnrolmentChecked(householdMembersModel
					.getPersonId().toString())) {

			} else {
				return false;
			}
		}
		if (DataStatic.isEligible("SE")) {
			return true;
		} else {
			return false;
		}
	}

	public static Boolean isAllPossibleOpenEnrolmentChecked() {
		Iterator<HouseholdMember> iterator = DataStatic.serviceModel.getApp()
				.getHouseholdMembers().iterator();
		while (iterator.hasNext()) {
			HouseholdMember householdMembersModel = (HouseholdMember) iterator
					.next();
			if (isPossibleOpenEnrolmentChecked(householdMembersModel
					.getPersonId().toString())) {

			} else {
				return false;
			}
		}
		if (DataStatic.isEligible("OE")) {
			return true;
		} else {
			return false;
		}
	}
    
	public static int getSelectedYear(TextView date){
		 int tvYear ;
		 if(date.getText().toString().equals("") || date.getText().toString().equals("Event Date") || date.getText().toString().equals("mm/dd/yyyy") || date.getText().toString().equals("Due Date")||  date.getText().toString().equals("MM/DD/YYYY")){
			tvYear = c.get(Calendar.YEAR);
			
		 }else{
			 String dateOfBrith = date.getText().toString();

				ArrayList<String> dobArray = new ArrayList<String>();
				String dateOfBirth = dateOfBrith;
				String[] dateOfBirthString = dateOfBirth.split("/");
				for (String monthdateyear : dateOfBirthString) {
					dobArray.add(monthdateyear);
				}
				tvYear = Integer.parseInt(dobArray.get(2));
		 }
		return tvYear;
		
	}
	 public static int getSelectedMonth(TextView date){
		 int tvMonth ;
		 if(date.getText().toString().equals("") ||date.getText().toString().equals("Event Date")  || date.getText().toString().equals("mm/dd/yyyy") || date.getText().toString().equals("Due Date")||  date.getText().toString().equals("MM/DD/YYYY")){
			tvMonth = c.get(Calendar.MONTH);
			
		 }else{
			 String dateOfBrith = date.getText().toString();
				ArrayList<String> dobArray = new ArrayList<String>();
				String dateOfBirth = dateOfBrith;
				String[] dateOfBirthString = dateOfBirth.split("/");
				for (String monthdateyear : dateOfBirthString) {
					dobArray.add(monthdateyear);
				}
				tvMonth = Integer.parseInt(dobArray.get(0))-1;
		 }
		return tvMonth;
		
	}

	 
	 public static int getSelectedDay(TextView date){
		 int tvDay ;
		 if(date.getText().toString().equals("")|| date.getText().toString().equals("Event Date") || date.getText().toString().equals("mm/dd/yyyy") || date.getText().toString().equals("Due Date")||  date.getText().toString().equals("MM/DD/YYYY")){
			tvDay = c.get(Calendar.DAY_OF_MONTH);			
		 }else{
			 String dateOfBrith = date.getText().toString();

				ArrayList<String> dobArray = new ArrayList<String>();
				String dateOfBirth = dateOfBrith;
				String[] dateOfBirthString = dateOfBirth.split("/");
				for (String monthdateyear : dateOfBirthString) {
					dobArray.add(monthdateyear);
				}
				tvDay = Integer.parseInt(dobArray.get(1));				
		 }
		return tvDay;		
	}
	
	
	public static Boolean isPossibleOpenEnrolmentChecked(String personID) {
		int personIndex = DataStatic.getIndexOfPerson(personID);
		int check2 = 0;
		Iterator<EligibilityProgram> iterator = DataStatic.serviceModel
				.getApp().getHouseholdMembers().get(personIndex)
				.getEligibility().getPrograms().iterator();
		while (iterator.hasNext()) {
			EligibilityProgram householdMembersModelEligibilityEligibilityProgramsModel = (EligibilityProgram) iterator
					.next();
			if (householdMembersModelEligibilityEligibilityProgramsModel
					.getEnrollmentType().equalsIgnoreCase("OE")) {
				if (householdMembersModelEligibilityEligibilityProgramsModel
						.getStatusCode().equalsIgnoreCase("EL")) {
					if ((householdMembersModelEligibilityEligibilityProgramsModel
							.getSelectedYN() + "").equalsIgnoreCase("Y")) {

					} else {
						check2 = 1;
					}

				}

			}
		}
		if (check2 == 1) {
			return false;
		} else {
			return true;
		}
	}

	public static Boolean isNextClickable() {
		if (isAllPossibleOpenEnrolmentChecked()
				&& isAllPossibleSpecialEnrolmentChecked()) {
			return true;
		} else {
			return false;
		}
	}
	
	public static Boolean isNextClickableOEOnly() {
		if (isAllPossibleOpenEnrolmentChecked()) {
			return true;
		} else {
			return false;
		}
	}


	/******************************** Is Save Eligible Results Clickable ********************************/

	public static Boolean isAllOpenChecked(
			ArrayList<HouseHoldMemberWrapper> list) {
		int check2 = 0;
		Iterator<HouseHoldMemberWrapper> iterator = list.iterator();
		while (iterator.hasNext()) {
			HouseHoldMemberWrapper householdMembers = (HouseHoldMemberWrapper) iterator
					.next();
			if (householdMembers.isSelectedEligibilityProgramOpen()) {

			} else {
				Iterator<EligibilityProgram> iterator1 = householdMembers
						.getHouseHoldMember().getEligibility().getPrograms()
						.iterator();
				while (iterator1.hasNext()) {
					EligibilityProgram householdMembersModelEligibilityEligibilityProgramsModel = (EligibilityProgram) iterator1
							.next();
					if (householdMembersModelEligibilityEligibilityProgramsModel
							.getEnrollmentType().equalsIgnoreCase("OE")
							&& householdMembersModelEligibilityEligibilityProgramsModel
									.getStatusCode().equalsIgnoreCase("EL")) {
						check2 = 1;
						break;
					} else {

					}
				}
			}
		}
		if (check2 == 1) {
			return false;
		} else {
			return true;
		}
	}

	public static Boolean isAllSpecialChecked(
			ArrayList<HouseHoldMemberWrapper> list) {
		int check2 = 0;
		Iterator<HouseHoldMemberWrapper> iterator = list.iterator();
		while (iterator.hasNext()) {
			HouseHoldMemberWrapper householdMembers = (HouseHoldMemberWrapper) iterator
					.next();
			if (householdMembers.isSelectedEligibilityProgramSpecial()) {

			} else {
				Iterator<EligibilityProgram> iterator1 = householdMembers
						.getHouseHoldMember().getEligibility().getPrograms()
						.iterator();
				while (iterator1.hasNext()) {
					EligibilityProgram householdMembersModelEligibilityEligibilityProgramsModel = (EligibilityProgram) iterator1
							.next();
					if (householdMembersModelEligibilityEligibilityProgramsModel
							.getEnrollmentType().equalsIgnoreCase("SE")
							&& householdMembersModelEligibilityEligibilityProgramsModel
									.getStatusCode().equalsIgnoreCase("EL")) {
						check2 = 1;
						break;
					} else {

					}
				}
			}
		}
		if (check2 == 1) {
			return false;
		} else {
			return true;
		}
	}

	public static Boolean isEligible(String enrolmentType) {
		Iterator<EnrollmentPeriod> iterator = DataStatic.serviceModel.getApp()
				.getEligibilitySummary().getEnrollmentPeriods().iterator();
		while (iterator.hasNext()) {
			EnrollmentPeriod enrollmentPeriod = (EnrollmentPeriod) iterator
					.next();
			if (enrollmentPeriod.getEnrollmentType().equalsIgnoreCase(
					enrolmentType)) {
				if (enrollmentPeriod.getEligibleYN().equalsIgnoreCase("N")) {
					return false;
				} else {
					return true;
				}
			} else {

			}
		}
		return false;
	}

	public static Boolean isSaveEligibilityResultClickable(
			String enrolmentType, ArrayList<HouseHoldMemberWrapper> list) {
		if (enrolmentType.equalsIgnoreCase("OE")) {
			if (DataStatic.isEligible(enrolmentType)) {
				if (DataStatic.isAllOpenChecked(list)) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			if (DataStatic.isEligible(enrolmentType)) {
				if (DataStatic.isAllSpecialChecked(list)) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}

	public static void setDataEligibilityResults(String enrolmentType) {
		Set<Entry<String, String>> mapEntry;
		if (enrolmentType.equalsIgnoreCase("SE")) {
			mapEntry = DataStatic.mapSpecialEnrolment.entrySet();
		} else {
			mapEntry = DataStatic.mapOpenEnrolment.entrySet();
		}
		Iterator<Entry<String, String>> iterator = mapEntry.iterator();
		while (iterator.hasNext()) {
			Entry<String, String> entry = (Entry<String, String>) iterator
					.next();
			Iterator<HouseholdMember> iterator2 = DataStatic.serviceModel
					.getApp().getHouseholdMembers().iterator();
			while (iterator2.hasNext()) {
				HouseholdMember householdMembersModel = (HouseholdMember) iterator2
						.next();
				Iterator<EligibilityProgram> iterator3 = householdMembersModel
						.getEligibility().getPrograms().iterator();
				while (iterator3.hasNext()) {
					EligibilityProgram householdMembersModelEligibilityEligibilityProgramsModel = (EligibilityProgram) iterator3
							.next();
					if (entry.getKey().equalsIgnoreCase(
							householdMembersModelEligibilityEligibilityProgramsModel
									.getRecordId().toString())) {
						householdMembersModelEligibilityEligibilityProgramsModel
								.setSelectedYN(entry.getValue());
					}
				}
			}
		}
	}

	public static int indexEligibilityMap = 0;
	public static int checkEligibilityResultsOnClick = 0;

	// public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
	// "MMM d, yyyy");
	public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
			"MM/dd/yyyy");

	// for update state flow
	public static void updateFlowStatesFromServerForApplicationSteps(
			Context context) {

		if (DataStatic.serviceModel.getApp() != null) {
			SharedPreferenceMain sharePrefs = new SharedPreferenceMain(context);
			sharePrefs.isHouseHoldSectionComplete(DataStatic.serviceModel
					.getApp().getFlowState().isHouseholdSectionComplete());
			sharePrefs.isIndividualSectionComplete(DataStatic.serviceModel
					.getApp().getFlowState().isIndividualSectionComplete());
			sharePrefs.isSpecialEnrollmentComplete(DataStatic.serviceModel
					.getApp().getFlowState().isSpecialEnrollmentComplete());

		}
	}

	// validate postal code
	public static void validatePostalCode(String postalCode,
			ArrayList<NameValuePair> nameValuePairs) {
		nameValuePairs.clear();
		nameValuePairs.add(new NameValuePairClass("address", postalCode));
		nameValuePairs.add(new NameValuePairClass("Key", api_key));
		HttpJsonThreadGet httpjson = new HttpJsonThreadGet(
				DataStatic.VERIFY_ZIP_SUCCESSFULL,
				DataStatic.VERIFY_ZIP_FAILED, api_baseUrl, nameValuePairs);
		httpjson.start();

	}

	// Suggested List
	public static void getSuggestedAddress(String fulladdress,
			ArrayList<NameValuePair> nameValuePairs, byte addressSuccessfull,
			byte addressFailed) {

		nameValuePairs.clear();
		nameValuePairs.add(new NameValuePairClass("address", fulladdress));
		nameValuePairs.add(new NameValuePairClass("Key", api_key));
		HttpJsonThreadGet httpjson = new HttpJsonThreadGet(addressSuccessfull,
				addressFailed, api_baseUrl, nameValuePairs);
		httpjson.start();
	}

	// Hisham
	/**
	 * Set the color automatically to red or black depending upon Text View is
	 * empty, even if you receive "Event Date" as text
	 * 
	 * @param TextView
	 *            tvQuestion
	 * @param TextView
	 *            tvValue
	 */
	public static void setColorOfTextViews(TextView tvQuestion, TextView tvValue) {
		String valueOfText = tvValue.getText().toString().trim();
		// it means tv is empty, even if you receive "Event Date" as text
		if (TextUtils.isEmpty(valueOfText)
				|| valueOfText.equalsIgnoreCase("Event Date")) {
			tvQuestion.setTextColor(Color.RED);
		} else {
			tvQuestion
					.setTextColor(com.accesshealthct.mobile.R.color.tv_color_white_bg);
		}
	}

	/**
	 * Set the check on image view automatically to check mark or uncheck and
	 * shows red color on textview
	 * 
	 * @param TextView
	 *            tvQuestion
	 * @param View
	 *            ivYes (Pass Imageview here)
	 * @param View
	 *            ivNo (Pass Imageview here)
	 */
	public static void setCheckOnImageViews(TextView tvQuestion, View ivYes,
			View ivNo) {

		if (!ivYes.isShown() && !ivNo.isShown()) {
			tvQuestion.setTextColor(Color.RED);
		} else {
			tvQuestion
					.setTextColor(com.accesshealthct.mobile.R.color.tv_color_white_bg);
		}
	}

	/**
	 * Check if the textview is empty, if yes, set the hint to bold and red
	 * 
	 * @param TextView
	 *            tvValue
	 * @param Boolean
	 *            makeBold
	 */
	public static void setColorOfTextViews(TextView tvValue) {
		String valueOfText = tvValue.getText().toString().trim();
		// it means tv is empty, even if you receive "Event Date" as text
		if (TextUtils.isEmpty(valueOfText)) {
			tvValue.setTextColor(Color.RED);
			tvValue.setHintTextColor(Color.RED);
		} else {
			tvValue.setTextColor(com.accesshealthct.mobile.R.color.tv_color_white_bg);
			tvValue.setHintTextColor(com.accesshealthct.mobile.R.color.tv_color_white_bg);
		}
	}

	// HISHAM
	/**
	 * Dump all the values inside the object
	 * 
	 * @param object
	 * @return all object values in a string
	 */
	public static String dumpObject(Object object) {
		Field[] fields = object.getClass().getDeclaredFields();
		StringBuilder sb = new StringBuilder();
		sb.append(object.getClass().getSimpleName()).append('{');

		boolean firstRound = true;

		for (Field field : fields) {
			if (!firstRound) {
				sb.append(", ");
			}
			firstRound = false;
			field.setAccessible(true);
			try {
				final Object fieldObj = field.get(object);
				final String value;
				if (null == fieldObj) {
					value = "null";
				} else {
					value = fieldObj.toString();
				}
				sb.append(field.getName()).append('=').append('\'')
						.append(value).append('\'');
			} catch (IllegalAccessException ignore) {
				// this should never happen
			}
		}

		sb.append('}');
		return sb.toString();
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

		int paddingLeft = (int) activity.getResources().getDimension(
				R.dimen.d11);
		int paddingTop = (int) activity.getResources().getDimension(R.dimen.d7);

		TextView head = new TextView(activity);
		head.setText(title);
		head.setPadding(paddingLeft, paddingTop, paddingLeft, paddingTop);
		head.setGravity(Gravity.CENTER);
		head.setTextSize((int) (activity.getResources().getDimension(
				R.dimen.font_ll) / activity.getResources().getDisplayMetrics().density));

		ScrollView scroller = new ScrollView(activity);
		TextView msg = new TextView(activity);
		msg.setText(message);
		msg.setPadding(paddingLeft, paddingTop, paddingLeft, paddingTop);
		msg.setGravity(Gravity.CENTER);
		msg.setTextSize((int) (activity.getResources().getDimension(
				R.dimen.font_l) / activity.getResources().getDisplayMetrics().density));
		scroller.addView(msg);

		if (TextUtils.isEmpty(buttonText))
			buttonText = "OK";

		AlertDialog.Builder dialog = new AlertDialog.Builder(activity);

		if (isAlertCancelable)
			dialog.setCancelable(isAlertCancelable);
		if (!TextUtils.isEmpty(title)) {
			dialog.setCustomTitle(head);
		}
		dialog.setView(scroller);
		dialog.setPositiveButton(buttonText,
				new DialogInterface.OnClickListener() {

					public void onClick(DialogInterface dialog, int which) {
						if (finishActivityOnClickingOK) {
							activity.finish();
						}
						dialog.dismiss();

					}
				});
		dialog.show();
	}

	private static View error_view;
	static Activity activityForEnrollment;
	public static void showErrorMessage(String errormsg,int id, Activity a){
		activityForEnrollment=a;
		error_view = a.findViewById(id);
		error_view.setVisibility(View.VISIBLE);
		
		TextView text = (TextView)error_view.findViewById(R.id.tv_error_message);
		text.setText(errormsg);
		Animation slideIn = AnimationUtils.loadAnimation(
				a.getApplicationContext(), R.anim.error_slide_out);
		error_view.startAnimation(slideIn);
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
	  * Give this method label and value and it will compare and will make the filed red.
	  * @param tvLabel
	  * @param tvValue
	  */
	 public static void updateTextViews(TextView tvLabel, TextView tvValue) {
			// TODO change here whatever

			if (TextUtils.isEmpty(tvValue.getText().toString().trim())) {
				tvLabel.setTextColor(Color.RED);
			} else {
				tvLabel.setTextColor(R.color.tv_color_white_bg);
			}
		}
	 
	 /**
	  * Make the Text view background black used in the project.
	  * @param tv
	  */
	public static void updateTextViewMakeThemBlack(TextView tv) {
			tv.setTextColor(R.color.tv_color_white_bg);
	}

	 /**
	  * Give this method a textview with hint set on it, if tv doen't have any data
	  * its hint color will become red.
	  * @param tvLabel
	  * @param tvValue
	  */
	 public static void updateTextViewBasedOnHint(TextView tv) {

		 if (TextUtils.isEmpty(tv.getText().toString().trim())) {
				tv.setHintTextColor(Color.RED);
			} else {
				tv.setHintTextColor(R.color.tv_color_white_bg);
			}
		}
	 
	 /**
	  * For ImmigrationStatus only with LOVE.
	  * @param tvLabel
	  * @param tvValue
	  */
	public static void updateTextViewBasedonTheirText(TextView tv) {

		if (TextUtils.isEmpty(tv.getText().toString().trim())
				|| tv.getText().toString().trim()
						.equalsIgnoreCase("Document Type")) {
			tv.setTextColor(Color.RED);
		} else {
			tv.setTextColor(R.color.tv_color_white_bg);
		}
	}
	 
	 /**
	  * Give this method label and value and it will compare and will make the filed red.
	  * @param tvLabel
	  * @param tvValue
	  */
	 public static void updateEditTextHints(EditText editText) {
			// TODO change here whatever

			if (TextUtils.isEmpty(editText.getText().toString().trim())) {
				editText.setHintTextColor(Color.RED);
				editText.requestFocus();
			} else {
				editText.setHintTextColor(Color.BLACK);
			}
		}
	 
	 
	 
	 /**
	  * Returns proper date in String format
	  */
	public static String getProperFormattedDate(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
		String month = "";
		String day = "";

		if (monthOfYear < 9) {
			month = "0" + (monthOfYear + 1);

		} else {
			month = (monthOfYear + 1) + "";
		}


		if (dayOfMonth < 10) {
			day = "0" + dayOfMonth;
		} else {
			day = dayOfMonth + "";
		}
		return (month + "/" + day + "/" + year);
		
		
		
	}

	/**
	 * @author Faisal Khan
	 * @param Current Date
	 * @param Given Date
	 * @return Difference in days
	 */
	public static String diffDate(String currentdate, String givenDate) {

		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");

		Date d1 = null;
		Date d2 = null;
		try {
			d1 = new Date(System.currentTimeMillis());
			d2 = format.parse(givenDate);

			// in milliseconds
			long diff = d2.getTime() - d1.getTime();
			long diffDays = diff / (24 * 60 * 60 * 1000);
			System.out.print(diffDays + " days");
			return diffDays + "";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";

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
	public static CookieStore getCookieStore() {
		return cookieStore;
	}
}
