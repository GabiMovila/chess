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
        x: x,
        y: y
    };

    const url = `http://localhost:8080/api/v1/movePiece/${oldX}/${oldY}`
    try {
        await axios.post(url, body);
    }
    catch (error) {
        console.log(error);
    }
    finally {
        oldX = null;
        oldY = null;
    }

}
export { makeMove, buildMovePositions }