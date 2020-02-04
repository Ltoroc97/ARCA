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

WebUI.callTestCase(findTestCase('Orden del Dia/Crear Nueva Orden/Crear Encabezado/DiligenciarInformacion_Encabezado'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OrdenDia/Crear Orden del Dia/IngresarOpcion_NuevaOrden/Agragar Temas/div_Agregar Tema'))

not_run: WebUI.click(findTestObject('Object Repository/OrdenDia/Crear Orden del Dia/IngresarOpcion_NuevaOrden/Agragar Temas/div_i  Cargando Formulario'))

WebUI.selectOptionByValue(findTestObject('Object Repository/OrdenDia/Crear Orden del Dia/IngresarOpcion_NuevaOrden/Agragar Temas/select_Seleccione una FuenteAgenda TpicaFun_712602'), 
    '4', true)

WebUI.setText(findTestObject('Object Repository/OrdenDia/Crear Orden del Dia/IngresarOpcion_NuevaOrden/Agragar Temas/input_Tema_OtroTema'), 
    'Automatización Pruebas')

WebUI.selectOptionByValue(findTestObject('Object Repository/OrdenDia/Crear Orden del Dia/IngresarOpcion_NuevaOrden/Agragar Temas/select_Seleccione un CarcterAprobatorioDeli_41a743'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OrdenDia/Crear Orden del Dia/IngresarOpcion_NuevaOrden/Agragar Temas/select_Seleccione un ComitComit de Auditora_93b966'), 
    '7', true)

WebUI.click(findTestObject('Object Repository/OrdenDia/Crear Orden del Dia/IngresarOpcion_NuevaOrden/Agragar Temas/input'))

WebUI.click(findTestObject('Object Repository/OrdenDia/Crear Orden del Dia/IngresarOpcion_NuevaOrden/Agragar Temas/input'))

WebUI.selectOptionByValue(findTestObject('Object Repository/OrdenDia/Crear Orden del Dia/IngresarOpcion_NuevaOrden/Agragar Temas/select_Seleccione un AlcanceEPM MatrizGrupo EPMNA'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OrdenDia/Crear Orden del Dia/IngresarOpcion_NuevaOrden/Agragar Temas/select_Seleccione una DependenciaDireccin S_196a9f'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/OrdenDia/Crear Orden del Dia/IngresarOpcion_NuevaOrden/Agragar Temas/input_Duracin (Minutos)_Duracion'), 
    '45')

WebUI.click(findTestObject('Object Repository/OrdenDia/Crear Orden del Dia/IngresarOpcion_NuevaOrden/Agragar Temas/div_Guardar'))

WebUI.click(findTestObject('Object Repository/OrdenDia/Crear Orden del Dia/IngresarOpcion_NuevaOrden/Agragar Temas/img'))

WebUI.comment('Tema número dos')

WebUI.click(findTestObject('Page_/div_Agregar Tema'))

WebUI.selectOptionByValue(findTestObject('Page_/Seleccione una Fuente Uno'), '4', true)

WebUI.click(findTestObject('Page_/input_S_optradio'))

WebUI.setText(findTestObject('Page_/input_Duracin (Minutos)_Duracion'), '15')

WebUI.click(findTestObject('Page_/div_Guardar'))

WebUI.click(findTestObject('Page_/img'))

WebUI.click(findTestObject('Object Repository/OrdenDia/Crear Orden del Dia/IngresarOpcion_NuevaOrden/Agragar Temas/b_DURACIN TOTAL 1 HORAS 0 MINUTOS'))

