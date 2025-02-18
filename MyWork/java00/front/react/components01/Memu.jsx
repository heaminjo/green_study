import { data as recipes } from "./recipeData.js";
import Recipe from "./Recipe.jsx";

const Menu = () => (
  <article>
    <header>
      <h1>맛잇는 조리법</h1>
    </header>
    <div className="recipes">
      {recipes.map(
        (recipe, i) => (
          <Recipe key={i} {...recipe} />
        )
        //map 순회하여 data테이블에 각 레시피와 인덱스 값을 꺼낸다.
        // ...recipe : 펼침연산자
        // name:recipe.name, ingredients:recipe.ingredients, steps:recipe.steps
      )}
    </div>
  </article>
); //Main_end
export default Menu;
