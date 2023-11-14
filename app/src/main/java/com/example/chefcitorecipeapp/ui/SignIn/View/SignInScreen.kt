package com.example.chefcitorecipeapp.ui.SignIn.View

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.chefcitorecipeapp.ui.Receta.View.RecetaScreen
import com.example.chefcitorecipeapp.ui.theme.ChefcitoRecipeAppTheme
import com.example.chefcitorecipeapp.ui.theme.ColorMain
import com.example.chefcitorecipeapp.ui.theme.Fondo

@Composable
fun SigninScreen (){
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Fondo)
    ){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Fondo),
            contentAlignment = Alignment.Center
        ){
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Fondo),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = ColorMain),
                    contentAlignment = Alignment.Center
                ){

                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SigninScreenPreview() {
    ChefcitoRecipeAppTheme {

        val navController = rememberNavController()
        SigninScreen()

    }
}