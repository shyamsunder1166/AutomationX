package repo;

import org.openqa.selenium.By;

public interface HotelSearchResultsRepo {

    By hotelsLoading = By.cssSelector("div.listingLoading");
    By userRatingLabels = By.cssSelector("div#hlistpg_fr_user_rating>ul>li label"); //get in list
    By hotelNames = By.cssSelector("div.listingRowOuter p#hlistpg_hotel_name>span[id^='htl_id']"); //get list of hotels. If count is < x then scroll and again get hotels.
    By sliderMinRange = By.cssSelector("div.input-range__slider");
    By locationPopUp = By.cssSelector(".whiteText.latoBlack.font22");
}
