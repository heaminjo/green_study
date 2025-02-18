import Ingredient from "./Ingredient";

const IngredientsList = ({ ingredients }) => {
  <ul className="ingredients">
    {ingredients.map((ingre, i) => (
      //객체를 한덩어리로 받아 props로 펼쳐서 전달달
      <Ingredient key={i} {...ingre} />

      // <li key={i}>{name + " " + amount + measurement}</li>
    ))}
  </ul>;
};
export default IngredientsList;
