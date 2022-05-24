import React from 'react';
import { connect } from 'react-redux';
import { Paper, Grid, Typography, List, makeStyles } from '@material-ui/core';
import Item from '../components/Item';
import Card from '../components/Card';

const useStyles = makeStyles((theme) => ({
    root: {
      flexGrow: 1,
      marginTop: '5px',
    },
    paper: {
      padding: theme.spacing(2),
      textAlign: 'center'
    },
  }));

const HomePage = ({ products }) => {
    const classes = useStyles();

    const categorys = products.map(
        category => {
            const container = { }; 
            container['id'] = category.id_categorys;
            container['name'] = category.name_categorys;
            return container;   
        }
    )

    return(
        <Grid container spacing={3} className={classes.root}>
            <Grid item xs={3}>
                <Paper className={classes.paper}>
                    <Typography variant='h5'>
                        Categorias
                    </Typography>
                    <List>
                        {categorys.map(
                            category => {
                                return (
                                    <Item
                                        key = {category.id}
                                        name= {category.name}
                                        //details="3"
                                    />
                                )
                            }
                        )}
                                                                        
                    </List>
                </Paper>
            </Grid>
            <Grid container xs={9} spacing={3} className={classes.root}>
                {products.map(item => {
                    return(
                        <Card key={item.id_product} name={item.name_product} price={item.price} image={item.image}>
                            {item.name_product}
                        </Card>
                    )
                })}                
                <Card name="Arsenal 2020" price="99.00" image="./images/produtos/arsenal.jpg">
                    Arsenal
                </Card>           
            </Grid>
        </Grid> 
    )
}

const mapStateToProps = state => ({
    products: state.products    
})

export default connect(mapStateToProps)(HomePage);