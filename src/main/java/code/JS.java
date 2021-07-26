package code;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\data\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement element=driver.findElement(By.xpath("//img[@alt='Google']"));
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript(JS.script(), "");
}
public static String tag() {
	return "function prepareiFrame() {\r\n"
			+ "        var ifrm = document.createElement(\"iframe\");\r\n"
			+ "        ifrm.setAttribute(\"script\", \"<script id=\"mNCC\" language=\"javascript\">medianet_width=\"300\";medianet_height=\"250\";medianet_adt1=\"8CU4YVI5Q\";medianet_adt2=\"151177843\";medianet_bdrId=\"229\";medianet_crid=\"151177843\";medianet_versionId=\"3111299\";medianet_bdata=\"rclcd%3D10%7C%7Cdvc%3D4%7C%7Cctr_mdl_id%3D2021051110%7C%7Cctgid%3D-1%7C%7Cmax_brw%3Dsafari%7C%7Ctmt%3D%5B%5D%7C%7Ctms%3Dctr!2%3Av_1%2Cm_2021051110%2Cs_0.007969844%7C1%3Av_9%2Cm_2021050923%2Cs_0.003708253%7C%23%7C%7Cid%3D14824072897395297_2089025099_1511778432291%7C%7Cstate%3DIL%7C%7Cbid_scr%3D-1.0%7C%7Csd_td%3D36898000543173054464%7C%7Cctr_uri%3D2%7C%7Cmm%3D1.0%7C%7Cctr%3D3.4335046E-4%7C%7Cvfci%3D-1%7C%7Cbid_v%3D1%7C%7Cscr%3D2.2085%7C%7Cctr_urc%3D2%7C%7Cbrw%3Dsafari%7C%7Cwxh%3D300x250%7C%7Cvfcc%3D-1%7C%7Cbid_mdl_id%3D1%7C%7Cadv%3D1819%7C%7Cadgid%3D230047%7C%7Cvwb%3D0.25%7C%7Cm_ss%3D-1%7C%7Cbf%3D0.01%7C%7Cvsb%3D2%7C%7Cm_os%3Dios%7C%7Ccity%3DChicago%7C%7Ccmp%3D114800%7C%7Csuid%3DCAESEODFnW1CReAu7jQg_GGyz_A%7C%7Csgmt%3Dsegment_broad_education%7C%7Catg_bm%3D1.00%7C%7Cgmt%3D-500%7C%7Cadid%3D338821%7C%7Crcf%3D7%7C%7Cadblk%3D1902416518%7C%7Citype%3DTEST%7C%7Ccc%3Dusa%7C%7Cmptd%3D640%7C%7Ccrid%3D151177843%7C%7Cctr_scr%3D0.0068%7C%7Cctr_uc%3D7.2849%7C%7Cmm_ptd%3D2207615287300%7C%7Cgv%3D0.33%7C%7Ccs%3Dybndspv2%7C%7Cctr_v%3D2%7C%7Ccsc%3D0%7C%7Cctr_ui%3D102.0%7C%7Cdlog%3DdGlkPTgwNjY3ODA0M3x8cGlkPThQTzc3TjJQS0A%3D\";medianet_auctionid=\"${acid}\";medianet_misc={\"kat\":\"{\"kasts\":\"tstype=-10402||gbid=-2\",\"katbid\":-5,\"kapc\":100,\"kals\":\"templates_threshold||pc=100\",\"kata\":\"at5\",\"kalog\":\"TPTD=5642||CI=2370||MPTD=672||SI=371||SID=10||UUID=3o7iBfzwQlvX0F5TqA||HID=1\"}\"};medianet_requrl=\"https://www.greatschools.org/illinois/grant-park/2255-Grant-Park-Elementary-School\";medianet_pid=\"8PO77N2PK\";medianet_ecrid=\"216773276\";medianet_tpid=\"T2RY773\";medianet_adomain=\"omjego.com\";medianet_ctype=\"1\";medianet_natasset=\"[{\"link\":{\"url\":\"https://m7-c.pmsrv.co/v2/ac?r=07060640320020743387732041574719&id=qxKblFWmcUfzxd%2BZuD1M4BAiK6Fi2ST1IAB%2BPHkP7%2FKamGgymwfEa9IBNIJcF2zsnyBOR1avi%2F8%3D&p=8CU4YVI5Q&ssp=151177843&v=le78X66G1CnAj47uG4ongFd6wYSiOXXE5jh7yFPC7NFxOS8T6gTpkOr9b2onBHrrjKi71WlFeuQA8qhcv4xLdFrMY7i9h%2Bgyf3OxFYRFEyehoP4kNlB2xS7NjcaH8okxum94sEhk8vECmi%2B3R%2BGpNQ%3D%3D&dlog=tid%3D806678043%7C%7Cpid%3D8PO77N2PK%40\"},\"imptrackers\":[\"https://m7-c.pmsrv.co/v2/tr?r=07060640320020743387732041574719&id=qxKblFWmcUfzxd%2BZuD1M4BAiK6Fi2ST1IAB%2BPHkP7%2FKamGgymwfEazJMFokF0SZS7PyGstE7DvdusqPlKEyzig%3D%3D&v=%2F2Tj%2FYotL2SV7vxfrobUKcCPju4biieAIdpj1aasMxISyOyyqu5PT4xgGmabbxQVUgxvae0w8UCuh4UyU%2BaVObeZ0SSXJulNfGtzEXabh%2FQ%3D&ad_rank=${AD_POSITION}&ad_bid=${AUCTION_PRICE}&dlog=tid%3D806678043%7C%7Cpid%3D8PO77N2PK%40\"],\"title\":{\"text\":\"This Secret IRS Loophole Is Making Retirement Accounts Soar\"},\"img\":{\"url\":\"https://img.pmsrv.co/v1/media/9d8d0394-caac-4612-8706-5e397f64904c/2d83bd4e-4c6a-4709-b214-1db421b75018\",\"w\":1200,\"h\":627},\"desc\":{\"value\":\"This Asset is Outperforming Stocks\"},\"cta\":{\"value\":\"Learn More\"},\"spons\":{\"value\":\"GoldCo\"}}]\";medianet_app=0;</script><script src=\"https://contextual.media.net/nmedianet.js?cid=8CU734595\"></script>\");\r\n"
			+ "        ifrm.style.width = \"640px\";\r\n"
			+ "        ifrm.style.height = \"480px\";\r\n"
			+ "        document.body.appendChild(ifrm);\r\n"
			+ "    }\r\n"
			+ "\r\n"
			+ "    //call it\r\n"
			+ "    prepareiFrame()";
	
}

public static String script() {
	
	return "function prepareiFrame() {\r\n"
			+ "        var ifrm = document.createElement(\"iframe\");\r\n"
			+ "        var script_tag = document.createElement('script');\r\n"
			+ "		script_tag.type = 'text/javascript';\r\n"
			+ "		script_tag.text = 'alert(\"<script id=\"mNCC\" language=\"javascript\">medianet_width=\"300\";medianet_height=\"250\";medianet_adt1=\"8CU4YVI5Q\";medianet_adt2=\"151177843\";medianet_bdrId=\"229\";medianet_crid=\"151177843\";medianet_versionId=\"3111299\";medianet_bdata=\"rclcd%3D10%7C%7Cdvc%3D4%7C%7Cctr_mdl_id%3D2021051110%7C%7Cctgid%3D-1%7C%7Cmax_brw%3Dsafari%7C%7Ctmt%3D%5B%5D%7C%7Ctms%3Dctr!2%3Av_1%2Cm_2021051110%2Cs_0.007969844%7C1%3Av_9%2Cm_2021050923%2Cs_0.003708253%7C%23%7C%7Cid%3D14824072897395297_2089025099_1511778432291%7C%7Cstate%3DIL%7C%7Cbid_scr%3D-1.0%7C%7Csd_td%3D36898000543173054464%7C%7Cctr_uri%3D2%7C%7Cmm%3D1.0%7C%7Cctr%3D3.4335046E-4%7C%7Cvfci%3D-1%7C%7Cbid_v%3D1%7C%7Cscr%3D2.2085%7C%7Cctr_urc%3D2%7C%7Cbrw%3Dsafari%7C%7Cwxh%3D300x250%7C%7Cvfcc%3D-1%7C%7Cbid_mdl_id%3D1%7C%7Cadv%3D1819%7C%7Cadgid%3D230047%7C%7Cvwb%3D0.25%7C%7Cm_ss%3D-1%7C%7Cbf%3D0.01%7C%7Cvsb%3D2%7C%7Cm_os%3Dios%7C%7Ccity%3DChicago%7C%7Ccmp%3D114800%7C%7Csuid%3DCAESEODFnW1CReAu7jQg_GGyz_A%7C%7Csgmt%3Dsegment_broad_education%7C%7Catg_bm%3D1.00%7C%7Cgmt%3D-500%7C%7Cadid%3D338821%7C%7Crcf%3D7%7C%7Cadblk%3D1902416518%7C%7Citype%3DTEST%7C%7Ccc%3Dusa%7C%7Cmptd%3D640%7C%7Ccrid%3D151177843%7C%7Cctr_scr%3D0.0068%7C%7Cctr_uc%3D7.2849%7C%7Cmm_ptd%3D2207615287300%7C%7Cgv%3D0.33%7C%7Ccs%3Dybndspv2%7C%7Cctr_v%3D2%7C%7Ccsc%3D0%7C%7Cctr_ui%3D102.0%7C%7Cdlog%3DdGlkPTgwNjY3ODA0M3x8cGlkPThQTzc3TjJQS0A%3D\";medianet_auctionid=\"${acid}\";medianet_misc={\"kat\":\"{\"kasts\":\"tstype=-10402||gbid=-2\",\"katbid\":-5,\"kapc\":100,\"kals\":\"templates_threshold||pc=100\",\"kata\":\"at5\",\"kalog\":\"TPTD=5642||CI=2370||MPTD=672||SI=371||SID=10||UUID=3o7iBfzwQlvX0F5TqA||HID=1\"}\"};medianet_requrl=\"https://www.greatschools.org/illinois/grant-park/2255-Grant-Park-Elementary-School\";medianet_pid=\"8PO77N2PK\";medianet_ecrid=\"216773276\";medianet_tpid=\"T2RY773\";medianet_adomain=\"omjego.com\";medianet_ctype=\"1\";medianet_natasset=\"[{\"link\":{\"url\":\"https://m7-c.pmsrv.co/v2/ac?r=07060640320020743387732041574719&id=qxKblFWmcUfzxd%2BZuD1M4BAiK6Fi2ST1IAB%2BPHkP7%2FKamGgymwfEa9IBNIJcF2zsnyBOR1avi%2F8%3D&p=8CU4YVI5Q&ssp=151177843&v=le78X66G1CnAj47uG4ongFd6wYSiOXXE5jh7yFPC7NFxOS8T6gTpkOr9b2onBHrrjKi71WlFeuQA8qhcv4xLdFrMY7i9h%2Bgyf3OxFYRFEyehoP4kNlB2xS7NjcaH8okxum94sEhk8vECmi%2B3R%2BGpNQ%3D%3D&dlog=tid%3D806678043%7C%7Cpid%3D8PO77N2PK%40\"},\"imptrackers\":[\"https://m7-c.pmsrv.co/v2/tr?r=07060640320020743387732041574719&id=qxKblFWmcUfzxd%2BZuD1M4BAiK6Fi2ST1IAB%2BPHkP7%2FKamGgymwfEazJMFokF0SZS7PyGstE7DvdusqPlKEyzig%3D%3D&v=%2F2Tj%2FYotL2SV7vxfrobUKcCPju4biieAIdpj1aasMxISyOyyqu5PT4xgGmabbxQVUgxvae0w8UCuh4UyU%2BaVObeZ0SSXJulNfGtzEXabh%2FQ%3D&ad_rank=${AD_POSITION}&ad_bid=${AUCTION_PRICE}&dlog=tid%3D806678043%7C%7Cpid%3D8PO77N2PK%40\"],\"title\":{\"text\":\"This Secret IRS Loophole Is Making Retirement Accounts Soar\"},\"img\":{\"url\":\"https://img.pmsrv.co/v1/media/9d8d0394-caac-4612-8706-5e397f64904c/2d83bd4e-4c6a-4709-b214-1db421b75018\",\"w\":1200,\"h\":627},\"desc\":{\"value\":\"This Asset is Outperforming Stocks\"},\"cta\":{\"value\":\"Learn More\"},\"spons\":{\"value\":\"GoldCo\"}}]\";medianet_app=0;</script><script src=\"https://contextual.media.net/nmedianet.js?cid=8CU734595\"></script>\")'; \r\n"
			+ "	   ifrm.style.width = \"640px\";\r\n"
			+ "        ifrm.style.height = \"480px\";\r\n"
			+ "        document.body.appendChild(ifrm);\r\n"
			+ "        `document.getElementById('targetFrame').contentWindow.body.appendChild(scriptTag)`;\r\n"
			+ "    }\r\n"
			+ "\r\n"
			+ "    //call it\r\n"
			+ "    prepareiFrame()";
}
}
