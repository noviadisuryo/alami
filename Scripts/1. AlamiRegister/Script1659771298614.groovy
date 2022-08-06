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

WebUI.navigateToUrl('https://dev.p2p.alamisharia.co.id/register')

'Assert Text "Cara Syariah Yang Aman" Present\r\n'
WebUI.verifyTextPresent('Cara Syariah yang Aman.', false)

'Verify text "MEmberi Pendanaan dan Mendapatkan Pembiayaan"'
WebUI.verifyTextPresent('Memberi Pendanaan dan Mendapatkan Pembiayaan.', false)

'Assert ALAMI LOGO \r\n'
WebUI.verifyElementVisible(findTestObject('Page_ALAMI Daftar  ALAMI Peer-to-Peer Lending Syariah/img'))

'Assert Pemberi Dana Element Visible\r\n'
WebUI.verifyElementVisible(findTestObject('Page_ALAMI Daftar  ALAMI Peer-to-Peer Lending Syariah/div_Pemberi Dana'))

'Assert Penerima Dana Element Visible'
WebUI.verifyElementVisible(findTestObject('Page_ALAMI Daftar  ALAMI Peer-to-Peer Lending Syariah/div_Penerima Dana                                     Gabung sebagaipenerima Pembiayaan'))

'Assert text "Pengguna hanyabisa memiliki satu jenis akun" present\r\n'
WebUI.verifyTextPresent('Pengguna hanya bisa memiliki satu jenis akun', false)

'Click on PEMBERI DANA button'
WebUI.click(findTestObject('Object Repository/Sample/Page_ALAMI Daftar  ALAMI Peer-to-Peer Lendi_33cbd2/img'))

'Input nama'
WebUI.setText(findTestObject('Object Repository/Sample/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/input_Nama Lengkap_name'), 
    'noviadi')

'Input Email\r\n'
WebUI.setText(findTestObject('Object Repository/Sample/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/input_Email_email'), 
    'noviadisuryox@mailinator.com')

'Input no HP'
WebUI.setText(findTestObject('Object Repository/Sample/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/input_No. Handphone_phone'), 
    '084373829392382')

'Input Password'
WebUI.setEncryptedText(findTestObject('Object Repository/Sample/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/input_Password_password'), 
    'imKFKCOIsaMQnz1TDE8yhA==')

'Pilih INDIVIDUAL account'
WebUI.click(findTestObject('Object Repository/Sample/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/label_Individual'))

'Pilih REFFERAL dari Facebook (Opsi #1)'
WebUI.selectOptionByValue(findTestObject('Object Repository/Sample/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/select_-- Silahkan Pilih --                _9f24ad'), 
    '1', true)

'Click Lanjutkan'
WebUI.click(findTestObject('Object Repository/Sample/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/button_Lanjutkan'), 
    FailureHandling.STOP_ON_FAILURE)

// Email Randomizer Start //
'Verify jika text "Email Sudah Digunakan" tidak muncul\r\n'
String Ms = WebUI.verifyTextPresent('Email Sudah digunakan', false)

'Fungsi, jika email sudah digunakan, generate random email'
if (Ms.equals('true')) {
    int RN

    RN = ((Math.random() * 500) as int)

    WebUI.setText(findTestObject('Object Repository/Sample/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/input_Email_email'), 
        ('noviadisuryox' + RN) + '@mailinator.com')

    WebUI.click(findTestObject('Object Repository/Sample/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/button_Lanjutkan'))
}

// Email Randomizer End //
'Click element'
WebUI.click(findTestObject('Page_Daftar Sebagai Pemberi Dana  ALAMI Peer-to-Peer Lending Syariah/p_Plaza 89'))

'Scroll ke element konten paling bawah'
WebUI.dragAndDropByOffset(findTestObject('Page_Daftar Sebagai Pemberi Dana  ALAMI Peer-to-Peer Lending Syariah/p_Plaza 89'), 
    0, 0)

'Klik PAGE DOWN\r\n'
WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ARROW_DOWN))

'Tick opsi 1'
WebUI.click(findTestObject('Page_Daftar Sebagai Pemberi Dana  ALAMI Peer-to-Peer Lending Syariah/input_Saya tertarik update info terbaru ALAMI. (Opsional)_langganan'))

'Tick opsi 2'
WebUI.click(findTestObject('Object Repository/Sample/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/input_Saya sudah membaca dan setuju dengan__c3b002'))

'Click button LANJUTKAN'
WebUI.click(findTestObject('Object Repository/Sample/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/button_Lanjutkan_1'))

