import Recipe from "./Recipe02.jsx";
import { data as recipes } from "./recipeData.js";
// return <Recipes02 {...data} />;
// const recipes = recipe.map(recipes, i);
// <Recipes02 {...recipes} key={i} />;
// <article>
//   <header>
//     <h1>** 맛있는 조리법 **</h1>
//   </header>
//   <div className="recipes">
//     {recipes.map(
//       (recipe, i) => (
//         <Recipe02 key={i} {...recipe} />
//       )
//       // ...recipe : 펼침연산자
//       // name:recipe.name, ingredients:recipe.ingredients, steps:recipe.steps
//     )}
//   </div>
// </article>; //Main_end

const Main = () => {
  <article>
    <header>
      <h1>** 맛있는 조리법 **</h1>
    </header>
    <div className="recipes">
      {recipes.map(
        (recipe, i) => (
          <Recipe key={i} {...recipe} />
        )
        // ...recipe : 펼침연산자
        // name:recipe.name, ingredients:recipe.ingredients, steps:recipe.steps
      )}
    </div>
  </article>;
};
export default Main;
