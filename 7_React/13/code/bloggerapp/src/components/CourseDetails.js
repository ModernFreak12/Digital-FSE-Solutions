const CourseDetails = ({ courses }) => {
  return (
    <div>
      {courses.map((course) => (
        <div>
          <h3>{course.name}</h3>
          <p>{course.date}</p>
        </div>
      ))}
    </div>
  );
};

export default CourseDetails;
