import logo from './logo.svg';
import './App.css';
import UserGreeting from './UserGreeting';
import GuestGreeting from './GuestGreeting';
import { useState } from 'react';

function Greeting(props) {
  const isLoggedIn = props.isLoggedIn;
  const onClick = props.onClick;

  if (isLoggedIn) {
    return <UserGreeting onClick={onClick} />;
  } else {
    return <GuestGreeting onClick={onClick} />;
  }
}

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginLogout = () => {
    setIsLoggedIn(!isLoggedIn);
  };

  return (
    <div className="App">
      <Greeting isLoggedIn={isLoggedIn} onClick={handleLoginLogout} />
    </div>
  );
}

export default App;
