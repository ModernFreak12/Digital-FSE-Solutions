function LoginButton(props) {
  return (  
    <button onClick={props.onClick}>
      Login
    </button>
  );
}

function GuestGreeting(props) {
  return (
    <div>
      <h1>Please sign up.</h1>
      <LoginButton {...props} />
    </div>
  );
}

export default GuestGreeting;
