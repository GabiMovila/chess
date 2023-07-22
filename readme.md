# Chess game
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/9a86505b9342424abe59e83f7a98c3d9)](https://app.codacy.com/gh/GabiMovila/chess/dashboard?utm_source=gh&utm_medium=referral&utm_content=&utm_campaign=Badge_grade)
## Frontend

## Backend

![General Architecture](./Architecture.png "Title")

## Requests structure

### Backend expected request 

``` javascript
{
    oldPosition: {
        x: oldX,
        y: oldY
    },
    newPosition:
    {
        x: newX,
        y: newY
    }
}

```
The URL for the requests is `/api/v1/movePiece/`. This request will be automatically built by clicking 2 squares on the board (old position and new position).
### Backend response

``` javascript
{
    "validMove": true,
    "capturedPiece": false,
    "givesCheck": false,
    "promotingPiece": false
}
```

The logic for the backend request-response is that whenever you need to move a piece you should specify the old position and the desired new position by clicking from one square to another.

The response contains all the cosnequences of the desired move. For example the first parameter shows whether the move is possible or not. The second one shows whether when the move is done an opposing piece is being captured etc.

All the parameters to be proeprly documented on the ASCIIDOC or swagger.

## Board notation
![Chess board](./board.png "Board")

The board has 2 dimensions: X horizontally and Y vertically. Each of these has a value between 1 and 8.