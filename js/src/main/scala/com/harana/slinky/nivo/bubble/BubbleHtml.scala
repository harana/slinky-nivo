package com.harana.slinky.nivo.bubble

import com.harana.slinky.bootstrap.SyntheticMouseEvent
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("react-nivo", "BubbleHtml")
@js.native
object ReactBubbleHtml extends js.Object

@react object BubbleHtml extends ExternalComponent {

  case class Props(root: BubbleData,
                   identity: Option[String | BubbleData => String] = None,
                   value: Option[String | BubbleData => String] = None,
                   width: Int,
                   height: Int,
                   leavesOnly: Option[Boolean] = None,
                   padding: Option[Int] = None,
                   colors: Option[String | Unit => String | Seq[String]] = None,
                   colorBy: Option[String] = None,
                   borderWidth: Option[Int] = None,
                   borderColor: Option[String | BubbleData => String] = None,
                   marginTop: Option[Int] = None,
                   marginRight: Option[Int] = None,
                   marginBottom: Option[Int] = None,
                   marginLeft: Option[Int] = None,
                   enableLabel: Option[Boolean] = None,
                   label: Option[String | BubbleData => String] = None,
                   labelFormat: Option[String | BubbleData => String] = None,
                   labelTextColor: Option[String | BubbleData => String] = None,
                   labelSkipRadius: Option[Int] = None,
                   isInteractive: Option[Boolean] = None,
                   isZoomable: Option[Boolean] = None,
                   onClick: Option[(BubbleData, SyntheticMouseEvent) => HTMLElement] = None,
                   animate: Option[Boolean] = None,
                   motionStiffness: Option[Int] = None,
                   motionDamping: Option[Int] = None)

  override val component = ReactBubbleHtml
}