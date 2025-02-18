const Recipes = ({ name, ingredients, steps }) => (
  <section id={name.toLowerCase().replace(/ /g, "-")}>
    {/* id 에 space 가 포함되지않도록 하기위해 모든 space 를 - 으로 변경  
        => JSX 내부의 주석  */}
    <h1>{name}</h1>
    <ul className="ingredients">
      {ingredients.map(({ name, amount, measurement }, i) => (
        <li key={i}>{name + " " + amount + measurement}</li>
      ))}
    </ul>
    <section className="instructions">
      <h3>조리방법</h3>
      {steps.map((step, i) => (
        <p key={i}>{i + 1 + ". " + step}</p>
      ))}
    </section>
  </section>
);
export default Recipes;
