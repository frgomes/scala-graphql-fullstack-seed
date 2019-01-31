package repositories

import something.Domain
import something.Domain.Picture
import something.PictureRepoLike

class PictureRepo extends PictureRepoLike {

  private val pictures = Map(
    "1" -> List(Picture(50, 50, Some("/assets/images/cheesecake1.jpeg")),
                Picture(50,30, Some("/assets/images/cheesecake2.jpeg"))
            ),
    "2" -> List(Picture(60, 30, Some("/assets/images/nutella.jpeg")))
  )


  override def picturesByProduct(id: String): List[Domain.Picture] = pictures.getOrElse(id, List())
}
