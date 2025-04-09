//Página HTML + JavaScript que suma dos números
<!DOCTYPE html>
<html>
<head><title>Suma JS</title></head>
<body>
    <input type="number" id="num1" placeholder="Número 1">
    <input type="number" id="num2" placeholder="Número 2">
    <button onclick="sumar()">Sumar</button>
    <p id="resultado"></p>

    <script>
        function sumar() {
            const a = parseFloat(document.getElementById('num1').value);
            const b = parseFloat(document.getElementById('num2').value);
            const resultado = a + b;
            document.getElementById('resultado').innerText = "Resultado: " + resultado;
        }
    </script>
</body>
</html>

