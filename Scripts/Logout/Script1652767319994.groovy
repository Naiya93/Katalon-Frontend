import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://app.tryspeed.dev/login')

WebUI.setText(findTestObject('Object Repository/Speed/Logout/Page_Speed Sign in/input_Email Address_email'), 'naiya@tryspeed.com')

WebUI.click(findTestObject('Object Repository/Speed/Logout/Page_Speed Sign in/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Speed/Logout/Page_Speed Sign in/input_Password_password'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.sendKeys(findTestObject('Object Repository/Speed/Logout/Page_Speed Sign in/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Speed/Logout/Page_Dashboard - New Business - Speed/p_Payment Links'))

WebUI.click(findTestObject('Object Repository/Speed/Logout/Page_Single-use Links - New Business - Speed/span_Balances'))

WebUI.click(findTestObject('Object Repository/Speed/Logout/Page_Balances - New Business - Speed/span_Payments'))

WebUI.click(findTestObject('Object Repository/Speed/Logout/Page_Payments - New Business - Speed/span_Transactions'))

WebUI.click(findTestObject('Object Repository/Speed/Logout/Page_Transactions - New Business - Speed/span_Payouts'))

WebUI.click(findTestObject('Object Repository/Speed/Logout/Page_Payouts - New Business - Speed/span_Settings'))

WebUI.click(findTestObject('Object Repository/Speed/Logout/Page_Profile - New Business - Speed/span_Change Password'))

WebUI.click(findTestObject('Object Repository/Speed/Logout/Page_Change Password - New Business - Speed/span_Notifications'))

WebUI.click(findTestObject('Object Repository/Speed/Logout/Page_Notifications - New Business - Speed/div_Login Sessions'))

WebUI.click(findTestObject('Object Repository/Speed/Logout/Page_Login Sessions - New Business - Speed/span_Associated Accounts'))

WebUI.click(findTestObject('Object Repository/Speed/Logout/Page_Associated Accounts - New Business - Speed/p_Business Settings'))

WebUI.click(findTestObject('Object Repository/Speed/Logout/Page_Associated Accounts - New Business - Speed/div_Account Details'))

WebUI.click(findTestObject('Object Repository/Speed/Logout/Page_Account Details - New Business - Speed/span_Payout  Scheduling'))

WebUI.click(findTestObject('Object Repository/Speed/Logout/Page_Payout  Scheduling - New Business - Speed/span_Branding'))

WebUI.click(findTestObject('Object Repository/Speed/Logout/Page_Branding - New Business - Speed/input__MuiSwitch-input PrivateSwitchBase-in_eb982a'))

WebUI.click(findTestObject('Object Repository/Speed/Logout/Page_Branding - New Business - Speed/input__MuiSwitch-input PrivateSwitchBase-in_eb982a'))

WebUI.click(findTestObject('Object Repository/Speed/Logout/Page_Branding - New Business - Speed/body_You need to enable JavaScript to run t_54590e'))

WebUI.click(findTestObject('Object Repository/Speed/Logout/Page_Branding - New Business - Speed/div_mjnruPRPK847uEyVbCv2oDfT1UK2Jifbgg_MuiB_e28c9e'))

WebUI.click(findTestObject('Object Repository/Speed/Logout/Page_Branding - New Business - Speed/img_Logging out_MuiAvatar-img css-1hy9t21'))

WebUI.click(findTestObject('Object Repository/Speed/Logout/Page_Branding - New Business - Speed/li_Logout'))

