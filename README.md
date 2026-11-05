# U2-ejercicio13

### Sistema de Control de Acceso por Tarjeta

Este ejercicio consiste en desarrollar un sistema de control de acceso en Java mediante la colaboración entre objetos.

La clase `TarjetaRFID` representa las credenciales de los empleados, almacenando un código único y su nivel de acceso. La clase `LectorTarjetas` recibe la interacción simulada del usuario y envía la tarjeta y la zona solicitada al objeto `ControladorDeAcceso`.

El controlador mantiene una base de datos interna de permisos y verifica si el nivel de acceso de la tarjeta es suficiente para ingresar a la zona. El método `verificarAcceso()` retorna un valor booleano que permite al lector informar si el acceso fue autorizado o denegado.

El objetivo es practicar la **comunicación entre objetos**, las asociaciones, el uso de colecciones (`Map`), los métodos con retorno booleano y la validación de permisos.
