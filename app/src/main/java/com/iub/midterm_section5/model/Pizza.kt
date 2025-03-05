import android.os.Parcelable
import com.iub.midterm_section5.model.Topping
import com.iub.midterm_section5.model.ToppingPlacement
import kotlinx.parcelize.Parcelize

@Parcelize
data class Pizza(
    val toppings: Map<Topping, ToppingPlacement> = emptyMap()
) : Parcelable {

    val price: Double
        get() = 9.99 + toppings.asSequence()
            .sumOf { (_, toppingPlacement) ->
                when (toppingPlacement) {
                    ToppingPlacement.Left, ToppingPlacement.Right -> 0.5
                    ToppingPlacement.All -> 1.0
                }
            }

    fun withTopping(topping: Topping, placement: ToppingPlacement?): Pizza {
        return copy(
            toppings = if (placement == null) {
                toppings - topping  // Removes the topping if placement is null
            } else {
                toppings + (topping to placement) // Adds/updates the topping with placement
            }
        )
    }
}
