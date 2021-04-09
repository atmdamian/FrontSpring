const btnEnviar = document.getElementById('enviar');
let nombre;
let precio;
let descripcion;
const formulario = document.querySelector('#nuevo-producto');

eventListener();
function eventListener() {
	document.addEventListener('DOMContentLoaded', iniciarApp);

}
window.onload = function() {
	nombre = document.getElementById('nombre');
	precio = document.getElementById('precio');
	descripcion = document.getElementById('descripcion');


	nombre.addEventListener('blur', validarFormulario);
	precio.addEventListener('blur', validarFormulario);
	descripcion.addEventListener('blur', validarFormulario);

}
function iniciarApp() {
	document.getElementById("enviar").disabled = true;
}

function validarFormulario(e) {
	if (e.target.value.length > 0) {
		console.log('Si hay algo');
	} else {
		e.target.classList.add('border', 'border-red-600');
		mostrarError();
	}
}

function mostrarError() {
	const mensajeError = document.createElement('p');
	mensajeError.textContent = 'Todos los campos son obligatorios';
	mensajeError.classList.add('border', 'border-red-100', 'text-red-500', 'p-3', 'mt-5', 'text-center');
	formulario.appendChild(mensajeError);
}
