package musaib.components

import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.opacity
import com.varabyte.kobweb.compose.ui.modifiers.scale
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.animation.Keyframes
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px


val UserNameStyle = CssStyle {
    base {
        Modifier.fontSize(FontSize.XLarge)
    }
    Breakpoint.SM {
        Modifier.fontSize(FontSize.Larger)
    }
    Breakpoint.MD {
        Modifier.fontSize(FontSize.Larger)
    }
    Breakpoint.LG {
        Modifier.fontSize(FontSize.Larger)
    }
}

val UsersMessageStyle = CssStyle {
    base {
        Modifier.fontSize(FontSize.Medium)
    }
    Breakpoint.SM {
        Modifier.fontSize(FontSize.XLarge)
    }
    Breakpoint.MD {
        Modifier.fontSize(FontSize.Large)
    }
    Breakpoint.LG {
        Modifier.fontSize(FontSize.XXLarge)
    }
}

val HeroContainerKeyFrames = Keyframes {
    0.percent {
        Modifier
            .margin(left = (-30).percent)  // Start from far left
            .opacity(0)
            .scale(1)  // Start slightly smaller
    }

    100.percent {
        Modifier
            .margin(left = 0.px)  // Final position
            .opacity(1)
            .scale(1.0)  // Normal size
    }
}




val SectionTitleStyle = CssStyle {
    base {
        Modifier
            .fontSize(FontSize.Large)
    }
    Breakpoint.SM {
        Modifier.fontSize(FontSize.Large)
    }
    Breakpoint.MD {
        Modifier.fontSize(FontSize.XLarge)
    }
    Breakpoint.LG {
        Modifier.fontSize(FontSize.XXLarge)
    }
}



val SectionDiscriptionStyle = CssStyle {
    base {
        Modifier.fontSize(FontSize.Medium)
            .margin(topBottom = 0.75.cssRem)

    }
    Breakpoint.SM {
        Modifier.fontSize(FontSize.Small)
            .margin(topBottom = 0.75.cssRem)
    }
    Breakpoint.MD {
        Modifier.fontSize(FontSize.Small)
            .margin(topBottom = 2.cssRem)
    }
    Breakpoint.LG {
        Modifier.fontSize(FontSize.Medium)
            .margin(topBottom = 2.cssRem)
    }

    Breakpoint.XL {
        Modifier.fontSize(FontSize.Large)
            .margin(topBottom = 2.cssRem)
    }
}

val AboutDiscriptionStyle = CssStyle {
    base {
        Modifier.fontSize(FontSize.Medium)
            .margin(topBottom = 0.75.cssRem)

    }
    Breakpoint.SM {
        Modifier.fontSize(FontSize.Small)
            .margin(topBottom = 0.75.cssRem)
            .textAlign(TextAlign.Justify)
    }
    Breakpoint.MD {
        Modifier.fontSize(FontSize.Small)
            .margin(topBottom = 2.cssRem)
            .textAlign(TextAlign.Center)
    }
    Breakpoint.LG {
        Modifier.fontSize(FontSize.Medium)
            .margin(topBottom = 2.cssRem)
            .textAlign(TextAlign.Center)
    }

    Breakpoint.XL {
        Modifier.fontSize(FontSize.Large)
            .margin(topBottom = 2.cssRem)
            .textAlign(TextAlign.Center)
    }
}


