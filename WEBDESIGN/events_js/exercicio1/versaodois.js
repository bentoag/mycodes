    


function manipulaValores(){
    var nota_1 = document.getElementById('nota_1').value;
    var nota_2 = document.getElementById('nota_2').value;
    var nota_3 = document.getElementById('nota_3').value;
    var calculomedia = calcularMedia(nota_1, nota_2, nota_3);
    document.getElementById('valormedia').value = calculomedia;
    document.getElementById('resultadoDaMedia').innerHTML = "A média é igual a:  " + calculomedia;
   
}   

function calcularMedia(a,b,c){
    var media = (parseFloat(a) + parseFloat(b) + parseFloat(c))/3;
    return media;
}

function mudaCor(mudar){   
    var media = document.getElementById('valormedia').value;
    var mudacortexto = document.getElementById('resultadoDaMedia');    

    if(mudar){
        if(media >= 7.0){
            mudacortexto.style.color = 'green';
        }else{
            mudacortexto.style.color = 'red';
        }                                   
    }else{
        mudacortexto.style.color = 'black';   
    }         
}


