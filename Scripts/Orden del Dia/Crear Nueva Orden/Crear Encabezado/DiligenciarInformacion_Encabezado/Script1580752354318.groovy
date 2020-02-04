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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Orden del Dia/Crear Nueva Orden/SeleccionarOpcion_OrdenDia'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OrdenDia/Crear Orden del Dia/IngresarOpcion_NuevaOrden/DiligenciarEncabezado/input_Fecha_datepicker'))

WebUI.click(findTestObject('Object Repository/OrdenDia/Crear Orden del Dia/IngresarOpcion_NuevaOrden/DiligenciarEncabezado/a_25'))

WebUI.selectOptionByValue(findTestObject('Object Repository/OrdenDia/Crear Orden del Dia/IngresarOpcion_NuevaOrden/DiligenciarEncabezado/select_Ituango AntioquiaSala de Juntas EPM _876a9b'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OrdenDia/Crear Orden del Dia/IngresarOpcion_NuevaOrden/DiligenciarEncabezado/select_000102030405060708091011121314151617_d567da'), 
    '10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OrdenDia/Crear Orden del Dia/IngresarOpcion_NuevaOrden/DiligenciarEncabezado/select_000102030405060708091011121314151617_d567da_1'), 
    '11', true)

WebUI.click(findTestObject('Object Repository/OrdenDia/Crear Orden del Dia/IngresarOpcion_NuevaOrden/DiligenciarEncabezado/input_Bloqueo para actualizacin de anexos_d_7ae79c'))

not_run: WebUI.click(findTestObject('Object Repository/OrdenDia/Crear Orden del Dia/IngresarOpcion_NuevaOrden/DiligenciarEncabezado/a_26'))

not_run: WebUI.click(findTestObject('Object Repository/OrdenDia/Crear Orden del Dia/IngresarOpcion_NuevaOrden/DiligenciarEncabezado/input_Bloqueo para actualizacin de anexos_d_7ae79c'))

WebUI.click(findTestObject('Object Repository/OrdenDia/Crear Orden del Dia/IngresarOpcion_NuevaOrden/DiligenciarEncabezado/a_24'))

WebUI.click(findTestObject('Object Repository/OrdenDia/Crear Orden del Dia/IngresarOpcion_NuevaOrden/DiligenciarEncabezado/img_Bloqueo para actualizacin de anexos_btn_d5c92a'))

WebUI.navigateToUrl('https://epmco.sharepoint.com/sites/EPMJD-UAT/SitePages/OrdenDia.aspx?Dato=266')

WebUI.click(findTestObject('Object Repository/OrdenDia/Crear Orden del Dia/IngresarOpcion_NuevaOrden/DiligenciarEncabezado/img'))

WebUI.click(findTestObject('Object Repository/OrdenDia/Crear Orden del Dia/IngresarOpcion_NuevaOrden/DiligenciarEncabezado/div_PuntoTemaDuracinInicioFinalCarcterComit_ab06b0'))

