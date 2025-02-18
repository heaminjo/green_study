const Ingredient = ({ name, amount, measurement }, i) => {
  return <li key={i}>{name + " " + amount + measurement}</li>;
};
export default Ingredient;
