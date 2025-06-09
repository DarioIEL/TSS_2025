let prodotti = ["Pasta", "Pane", "Vino", "Carne", "Insalata"];
let prezzi = [0.9, 1, 5.40, 12.7, 0.8];
let quants = [3, 2, 3, 2.5, 1];



let listaSpesa = document.getElementById("listaSpesa");

let grandTotal = 0;

for(let i = 0; i < prodotti.length; i++){
    let subtotal = quants[i] * prezzi[i];
    grandTotal += subtotal;
    // listaSpesa.innerHTML += `<tr> 
    //                         <td> ${prodotti[i]} </td> 
    //                         <td> ${prezzi[i]} </td> 
    //                         <td> ${quants[i]} </td> 
    //                         <td> ${subtotal.toFixed(2)} €</td>
    //                         </tr> 
    //                         `;  

    let tr = document.createElement("tr");
    tr.innerHTML = `<td> ${prodotti[i]} </td>
                    <td> ${prezzi[i]} </td> 
                    <td> ${quants[i]} </td> 
                    <td> ${subtotal.toFixed(2)} €</td>`;




    // let tdProd = document.createElement("td");
    // tdProd.textContent = prodotti[i];
    // tr.appendChild(tdProd);



    listaSpesa.appendChild(tr);
}

let totale = document.getElementById("totale");
totale.innerHTML = grandTotal + " € ";