import './Pieces.css'

function RenderPieces() {
    document.getElementById("11").className += " " + "Black-rook";
    document.getElementById("21").className += " " + "Black-horse";
    document.getElementById("31").className += " " + "Black-bishop";
    document.getElementById("41").className += " " + "Black-queen";
    document.getElementById("51").className += " " + "Black-king";
    document.getElementById("61").className += " " + "Black-bishop";
    document.getElementById("71").className += " " + "Black-horse";
    document.getElementById("81").className += " " + "Black-rook";

    for(let i = 1; i <= 8; i++){
        document.getElementById(`${i}2`).className += " " + "Black-pawn";
    }

    document.getElementById("18").className += " " + "White-rook";
    document.getElementById("28").className += " " + "White-horse";
    document.getElementById("38").className += " " + "White-bishop";
    document.getElementById("48").className += " " + "White-queen";
    document.getElementById("58").className += " " + "White-king";
    document.getElementById("68").className += " " + "White-bishop";
    document.getElementById("78").className += " " + "White-horse";
    document.getElementById("88").className += " " + "White-rook";

    for(let i = 1; i <= 8; i++){
        document.getElementById(`${i}7`).className += " " + "White-pawn";
    }
}
export default RenderPieces;