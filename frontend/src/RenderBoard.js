import { makeMove } from "./MovesContainer";
import Table from "./Table.css"

function RenderBoard() {
    let parentTable = document.querySelector("#board");
    for (let i = 8; i >= 1; i--) {
        let row = document.createElement("tr");
        for (let j = 1; j <= 8; j++) {
            let divCell = document.createElement("td");
            let cellId = "" + j + i;
            divCell.setAttribute("id", cellId);
            if ((i + j) % 2 == 0) {
                divCell.setAttribute("class", "Table-black-box");
            }
            else {
                divCell.setAttribute("class", "Table-white-box");
            }
            divCell.addEventListener("click", function () {
                makeMove(j, i);
            })
            row.appendChild(divCell);
        }
        parentTable.appendChild(row);
    }

}
export default RenderBoard;