const BookDetails = (props) => {
  return (
    <ul>
      {props.books.map((book) => (
        <div>
          <h3>{book.bname}</h3>
          <h4>{book.price}</h4>
        </div>
      ))}
    </ul>
  );
};

export default BookDetails;
