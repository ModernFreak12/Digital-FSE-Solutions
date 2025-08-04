import { IndianPlayers } from "./players";

function ListofIndianPlayers() {
  return (
    <div>
      {
        IndianPlayers.map((p, index) => (
          <li key={index}>Mr. {p}</li>
        ))
      }
    </div>
  );
}

export default ListofIndianPlayers;
