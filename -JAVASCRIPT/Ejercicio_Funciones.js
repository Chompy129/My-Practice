/*
ImporteSinImpuestos debe ser númerico y tipoProducto debe ser un número entero.
Calcula segun el importe y el tipo de producto. Envia una alerta del resultado.
*/
function obtenerImporteConImpuestos(importeSinImpuestos, tipoProducto){
	var Impuesto;
	switch(tipoProducto){//Determina la operación según el tipo de producto indicado.
		case 1: Impuesto= Math.round(importeSinImpuestos * 1.21); break;
		case 2: Impuesto= Math.round(importeSinImpuestos * 1.1); break;
		case 3: Impuesto= Math.round(importeSinImpuestos * 1.05); break;
		default: alert("Error 1: No se coloco un tipo de producto valido."); break;
	}; //Cierre de switch
	if(tipoProducto >= 1 && tipoProducto <= 3){alert("Su impuesto es "+Impuesto+".");
		if(importeSinImpuestos == 0){alert("¿Estas bromeando verdad?\nSi no vas a importar nada no hubieras venido en primer lugar.")}
		else if(importeSinImpuestos < 0){alert("No admitimos números negativos, ¿en que estabas pensando?")};
	};//Cierre de condicion
	
};//Fin función obtenerImporteConImpuestos.
/*
importeSinImpuestos debe ser númerico.
Calcula el importe para cada tipo y los junta en un array.
*/
function obtenerImporteConImpuestos2(importeSinImpuestos){
	var Impuesto= [];
	Impuesto[1]= Math.round(importeSinImpuestos * 1.21);
	Impuesto[2]= Math.round(importeSinImpuestos * 1.1);
	Impuesto[3]= Math.round(importeSinImpuestos * 1.05);
	return Impuesto;
}//Fin función obtenerImporteConImpuestos2.

function Activar(){
	var isI = Number(prompt("Indique la cantidad de su importe"));
	var tP= Number(prompt("indique el tipo de producto\n\nValores posibles: 1, 2, 3"));
	obtenerImporteConImpuestos(isI, tP);

	var Rpt= obtenerImporteConImpuestos2(isI);
	alert("Para el producto tipo 1 obtendrias: "+Rpt[1]+"\nPara el producto tipo 2 obtendrias: "+Rpt[2]+"\nPara el producto tipo 3 obtendrias: "+Rpt[3]+"\nEn otros tipos obtendrias: "+Rpt[0]);
}