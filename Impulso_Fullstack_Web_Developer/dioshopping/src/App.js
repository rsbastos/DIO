import { BrowserRouter as Router } from 'react-router-dom';
import { Provider } from 'react-redux';
import Routes from './routes';
import { Container } from '@material-ui/core';
import Header from './components/Header';

const App = () => { 
  return(
    <Container maxWidth="xl">
      <Router>
        <Header />
        <Routes />
      </Router>      
    </Container>
    
  )
}
 

export default App;
