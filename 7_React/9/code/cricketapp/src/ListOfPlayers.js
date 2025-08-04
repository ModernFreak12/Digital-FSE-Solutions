import { players } from "./players";

function ListofPlayers() {
  return (
    <div>
      {
        players.map((item) => {
          return (
            <div>
              <li>Mr. {item.name} <span>{item.score}</span></li>
            </div>
          );
        })
      }
    </div>
  );
}

export default ListofPlayers;
