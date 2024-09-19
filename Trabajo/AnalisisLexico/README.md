# Programa de Análisis Léxico

Este proyecto es una implementación de un analizador léxico en Java para un lenguaje simple. El analizador está diseñado para reconocer identificadores, números enteros y decimales, espacios en blanco y operadores de asignación y suma. El proyecto incluye la construcción de un autómata finito determinista (AFD) para procesar los tokens del lenguaje.

## Contenido del Proyecto:

**Código Fuente**
AnalizadorLexico.java: Implementación del analizador léxico en Java.

**Archivos de Entrada**
prueba.txt: Ejemplo de archivo de entrada para testear nuestro analizador léxico.

**Documentación**
README.md: Documentacion

**Documentos Adicionales**
ReporteAFD.pdf: Documento que detalla la construcción del AFD usando el método de elementos punteados.

La construcción del AFD se detalla en el documento ReporteAFD.pdf. En él se describe el método de elementos punteados para la obtención del AFD, así como las transiciones y estados del autómata.

## Requisitos

Para ejecutar este proyecto, necesitas tener instalado Java. Si no lo tienes, puedes instalarlo utilizando el siguiente comando en tu terminal:

    sudo apt install default-jdk

**Nota**: Este procedimiento es válido para Ubuntu y otras distribuciones basadas en Debian.

## Cómo Ejecutar el Programa
En la ubicacion del programa ejecutar en la terminal.

Para compilar:
    javac AnalizadorLexico.java

Para ejecutar:
    java AnalizadorLexico prueba.txt



