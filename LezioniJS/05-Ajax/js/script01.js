
//Chiamo un endopoint di una API esterna

let urlEndpoint = "https://pokeapi.co/api/v2/pokemon/bulbasaur/";

let nomePokemon = "";

try {
    
    //fetchAPI che esegue una chiamata esterna
    fetch(urlEndpoint)
    //in questo primo then gestisco la chiamata al server e la sua risposta
    .then(data => {
        if(data.ok){
            console.log("Il server ha risposto");
    }else if(data.status == 404){
        throw "Errore nel recupero dati";
    }
    console.log(data);  
    return data.json(); //la prima then mi restituisce una promise
})
.then(response =>{
    // console.log(response.name);
    nomePokemon = response.name;
    console.log("nome del pokemon", nomePokemon);
    
})

} catch (error) {
    console.log(error);
    
}

