<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Exercício PHP - Accordion</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
  <script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#accordion" ).accordion();
  } );
  </script>
</head>
<body>
 
<div id="accordion">
  <h3>Português</h3>
  <div>
    <h1>
    Bem-vindo Mundo!
    </h1>
    <p>Exemplo de um programa PHP</p>     
  </div>
  <h3>English</h3>
  <div>
    <h1>
    Bem-vindo Mundo!
    </h1>
    <p>Exemplo de um programa PHP</p>     
  </div>
  <h3>Deutsch</h3>
  <div>
    <h1>
    Bem-vindo Mundo!
    </h1>
    <p>Exemplo de um programa PHP</p>     
  </div>
  <h3>Français</h3>
  <div>
    <h1>
    Bem-vindo Mundo!
    </h1>
    <p>Exemplo de um programa PHP</p>     
  </div>
</div>
 
 
</body>
</html>