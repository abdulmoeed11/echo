package com.mqasoft.echo.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.core.view.WindowCompat
import com.mqasoft.echo.R

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80,
    background = Color.DarkGray,
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40,
    background = Color.DarkGray,

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun EchoTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = echoTypography,
        content = content
    )
}

private val ibmFont = FontFamily(
    Font(R.font.ibmregular),
    Font(R.font.ibmitalic, style = FontStyle.Italic),
    Font(R.font.ibmmedium, FontWeight.Medium),
    Font(R.font.ibmmediumitalic, FontWeight.Medium, style = FontStyle.Italic),
    Font(R.font.ibmbold, FontWeight.Bold),
    Font(R.font.ibmbolditalic, FontWeight.Bold, style = FontStyle.Italic)
)
private val defaultTypography = Typography()

private val echoTypography = Typography(
    displayLarge = defaultTypography.displayLarge.copy(fontFamily = ibmFont),
    displayMedium = defaultTypography.displayMedium.copy(fontFamily = ibmFont),
    displaySmall = defaultTypography.displaySmall.copy(fontFamily = ibmFont),

    headlineLarge = defaultTypography.headlineLarge.copy(fontFamily = ibmFont),
    headlineMedium = defaultTypography.headlineMedium.copy(fontFamily = ibmFont),
    headlineSmall = defaultTypography.headlineSmall.copy(fontFamily = ibmFont),

    titleLarge = defaultTypography.titleLarge.copy(fontFamily = ibmFont),
    titleMedium = defaultTypography.titleMedium.copy(fontFamily = ibmFont),
    titleSmall = defaultTypography.titleSmall.copy(fontFamily = ibmFont),

    bodyLarge = defaultTypography.bodyLarge.copy(fontFamily = ibmFont),
    bodyMedium = defaultTypography.bodyMedium.copy(fontFamily = ibmFont),
    bodySmall = defaultTypography.bodySmall.copy(fontFamily = ibmFont),

    labelLarge = defaultTypography.labelLarge.copy(fontFamily = ibmFont),
    labelMedium = defaultTypography.labelMedium.copy(fontFamily = ibmFont),
    labelSmall = defaultTypography.labelSmall.copy(fontFamily = ibmFont)
)