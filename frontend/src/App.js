
import './App.css';
import RenderTable from './RenderBoard';
import StartButton from './StartButton';

function App() {
  RenderTable()
  return (
    <div className="App">
      <StartButton />
    </div>
  );
}

export default App;
