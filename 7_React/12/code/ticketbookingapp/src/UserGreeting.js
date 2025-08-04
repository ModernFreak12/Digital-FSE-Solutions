function LogoutButton(props) {
  return (  
    <button onClick={props.onClick}>
      Logout
    </button>
  );
}

function UserGreeting(props) {
  return (
    <div>
      <h1>Welcome back!</h1>
      <LogoutButton {...props} />
    </div>
  );
}

export default UserGreeting;
