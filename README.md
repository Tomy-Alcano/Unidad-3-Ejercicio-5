# Unidad-3-Ejercicio-5
Prog 3 Unidad 3 Ejercicio 5
Ejercicio 5 — Conexión a la base de datos
Este ejercicio da el primer paso en el trabajo con JDBC. El objetivo es que puedas establecer y verificar una conexión con una base de datos relacional desde una aplicación Swing.

Antes de comenzar a codificar, creá una base de datos llamada prog3 en tu motor de base de datos (MySQL, PostgreSQL o el que uses en la materia) y dentro de ella una tabla llamada clientes con la siguiente estructura:
<img width="731" height="88" alt="image" src="https://github.com/user-attachments/assets/51d2f7b5-dabc-4ef2-a48b-05b5894866b7" />

Luego construí una ventana con los siguientes elementos:

Una etiqueta con el texto "Estado de la conexión: sin verificar"
Un botón con el texto "Verificar conexión"
Cuando el usuario presione el botón:

Si la conexión se establece correctamente, la etiqueta debe cambiar a "✔ Conexión exitosa" en color verde
Si ocurre un error, la etiqueta debe cambiar a "✘ Error de conexión" en color rojo y debe mostrarse el mensaje de error en un JOptionPane
Encapsulá la lógica de conexión en una clase separada llamada Conexion, tal como se explicó en el Capítulo 8 de la unidad.

💡 Tip: recordá agregar el driver JDBC de tu motor como dependencia del proyecto. Si usás MySQL, el driver es mysql-connector-j. Si usás un proyecto Maven o Gradle, agregalo como dependencia en el archivo de configuración correspondiente.
<img width="482" height="303" alt="image" src="https://github.com/user-attachments/assets/5ef5c67e-3657-4f40-93f0-7d883634809d" />
<img width="482" height="305" alt="image" src="https://github.com/user-attachments/assets/f14eab8f-4c80-4bbf-9d11-509009d627ed" />

