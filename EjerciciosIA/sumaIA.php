<!-- Página HTML + PHP para sumar dos números-->
 <!DOCTYPE html>
<html>
<head><title>Suma PHP</title></head>
<body>
    <form method="post">
        Número 1: <input type="number" name="num1" required><br>
        Número 2: <input type="number" name="num2" required><br>
        <input type="submit" value="Sumar">
    </form>
    <?php
        if ($_SERVER["REQUEST_METHOD"] == "POST") {
            $num1 = $_POST["num1"];
            $num2 = $_POST["num2"];
            echo "<p>Resultado: " . ($num1 + $num2) . "</p>";
        }
    ?>
</body>
</html>
