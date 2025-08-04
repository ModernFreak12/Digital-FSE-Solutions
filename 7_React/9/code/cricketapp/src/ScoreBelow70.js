import { players } from "./players";

function Scorebelow70() {
  let players70 = [];

  return (
    players.map((item) => {
      if (item.score <= 70) {
        players70.push(item);
      }
    }),
    <div>
      {
        players70.map((item, index) => {
          return (
            <li key={index}>Mr. {item.name} <span>{item.score}</span></li>
          );
        })
      }
    </div>
  );
}

export default Scorebelow70;
