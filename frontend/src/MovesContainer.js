import axios from "axios";

let oldX = null;
let oldY = null;

function buildMovePositions(x, y) {
    if (oldX === null || oldY === null) {
        oldX = x;
        oldY = y;
        return;
    }
    makeMove(x, y)
}

async function makeMove(x, y) {
    const body = {
        oldPosition: {
            x: oldX,
            y: oldY
        },
        newPosition:
        {
            x: x,
            y: y
        }
    };

    const url = `http://localhost:8080/api/v1/movePiece/`
    try {
        var response = await axios.post(url, body);
        console.log(response.data)
        if(response.data.validMove){
            renderPieceToNewSquare();
        }
    }
    catch (error) {
        console.log(error);
    }
    finally {
        oldX = null;
        oldY = null;
    }

    function renderPieceToNewSquare(){
        let cssClasses = document.getElementById(`${oldX}${oldY}`).classList; 
        var elements = Array.from(cssClasses)
        var classToBeMoved = elements.pop();
        document.getElementById(`${oldX}${oldY}`).classList= elements;
        document.getElementById(`${x}${y}`).className += " " + classToBeMoved;
    }

}
export { makeMove, buildMovePositions }