function validacion(){
    var usuario = document.getElementById("usuario").value;
    var constrasenia = document.getElementById("contrasenia").value;

    if (usuario == "root" && constrasenia == "admin") {
        alert("Inicio exitoso");
        window.open(registro.html)
    }else {
        alert("Usuario erroneo");
    }
}