package recloudstream

import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.TvType

class AnimePaheProvider : MainAPI() {

    override var mainUrl = "https://animepahe.ru"

    override var name = "AnimePahe"

    override var lang = "en"

    override val supportedTypes = setOf(
        TvType.Anime,
        TvType.AnimeMovie
    )
}
