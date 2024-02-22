import React, { useState } from 'react';
import axios from 'axios';
import { Button } from '@mui/base';
import RenderPieces from './RenderPieces';
//TODO de schimbat use state-ul sa nu mi mai randeze eroare cand am response body gol si 
//modificat si in backend endpointul sa nu mai returneze vreun tip de data
const StartButton = () => {
    const [response, setResponse] = useState(null);
    const [error, setError] = useState(null);
    // const url = process.env.HOSTNAME + "/api/v1/start"; 
    const url = "http://localhost:8080/api/v1/start"

    const fetchData = async () => {
        try {
            console.log(url)
            const response = await axios.post(url);
            setResponse(response.data);
            RenderPieces()
        } catch (error) {
            setError(error.message);
        }
    };

    return (
        <div>
            <Button onClick={fetchData}>Start Game</Button>
            {error && <div>Error: {error}</div>}
            {response && (
                <div>
                    <p>Response:</p>
                    <pre>{JSON.stringify(response, null, 2)}</pre>
                </div>
            )}
        </div>
    );
};

export default StartButton;
