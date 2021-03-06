package com.marspotato.supportsmallshop.util;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;



import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Config {	
	//some enum about network
	public static int WIFI_ERROR = 0;
	public static int NETWORK_ERROR = 1;
	public static int OTHERS_ERROR = 2;
	
	public static int NAME_MAX_LENGTH = 20;
	public static int SHORT_DESCRIPTION_MAX_LENGTH = 30;
	public static int FULL_DESCRIPTION_MAX_LENGTH = 200;
	public static int OPEN_HOURS_MAX_LENGTH = 100;
	public static int SEARCH_TAGS_MAX_LENGTH = 200;
	public static int ADDRESS_MAX_LENGTH = 150;
	public static int PHONE_MAX_LENGTH = 10;
	
	public final static String licenseUrl = "http://www.gnu.org/licenses/gpl-3.0.txt";
	public final static String[] shopTypes = new String[]{"食肆", "零售（食物）","零售（其他）", "服務"}; 
	public final static String deviceType  = "google-android"; 
	
	public final static int DEFAULT_SEARCH_RANGE = 100;
	
	public final static int WHOLE_HK = 0;
	public final static int HK_ISLAND = 1;
	public final static int KOWL0ON = 2;	
	public final static int NEW_TERRITORIES = 3;
	
	public final static int HK_NORTH_LAT1000000 = 22562222;
	public final static int HK_SOUTH_LAT1000000 = 22153889;
	public final static int HK_EAST_LNG1000000 = 114441667;
	public final static int HK_WEST_LNG1000000 = 113835278;
	
	//REMARKS: this is development purpose ID, and URL
	public static final String GCM_SENDER_ID = "458074465130";
	public static final String HOST_URL = "http://supportsmallshop1.marspotato.com//supportsmallshop";
	//public static final String HOST_URL = "http://supportsmallshop.marspotato.com/supportsmallshop";
	
	//the default http timeout
	public static final int DEFAULT_HTTP_TIMEOUT = 10000;//10000ms = 10 seconds
	
	//after the initial fail, the number of retry of http call
	public static final int DEFAULT_HTTP_MAX_RETRY = 1;
	
	//max number of image to be cached in disk
	public static final int MAX_DISK_CACHE_IMAGE = 100;
	
	public static DateTimeFormatter defaultDisplayDateFormatter = DateTimeFormat.forPattern("yyyy-MM-dd");

	public static DateTimeFormatter defaultDateTimeFormatter = ISODateTimeFormat.basicDateTimeNoMillis();
	
	public static Gson defaultGSON = new GsonBuilder().registerTypeAdapter(DateTime.class, new DateTimeTypeConverter()).setPrettyPrinting().excludeFieldsWithoutExposeAnnotation().create();
	
	//time for a button to be disabled to avoid double action
	public static final int AVOID_DOUBLE_CLICK_PERIOD = 500;//500ms
	
	//THE time(in ms) that the progress bar will be delayed to show
	public static final int MS_GAME_PROGRESS_BAR_DELAY = 500; 
	
}
