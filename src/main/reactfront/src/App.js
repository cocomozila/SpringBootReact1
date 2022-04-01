import './App.css';
import axios from 'axios';
import { useEffect, useState } from 'react';

function App() {

  const baseUrl = "http://localhost:8080";
  const baseUrl2 = "https://jsonplaceholder.typicode.com/posts";

  const [posts, setPosts] = useState([]);  
  
  async function getPost() {
    await axios.get("https://jsonplaceholder.typicode.com/posts")
    .then(Response => setPosts(Response.data))
    .catch((error)=>{
      console.error(error);
    });
  }

  useEffect(()=>{
    getPost();
  }, []);

return (
    <ul>
        {/* posts.id */}
        {/* posts.title */}
        {posts.map((post, index)=>(
          <li key={index}>
            <div>{post.title}</div>
            <div>{post.body}</div>
            <hr/>
          </li>
        ))}
    </ul>
);
}

export default App;
