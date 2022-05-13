SRC_URI += "https://proxy.golang.org/github.com/ajstarks/deck/@v/v0.0.0-20220504212752-e4bcd985d902.zip;srcoutput=github.com/ajstarks/deck;srcinput=github.com/ajstarks/deck@v0.0.0-20220504212752-e4bcd985d902;downloadfilename=github-com-ajstarks-deck-0.0.0-20220504212752-e4bcd985d902.zip;name=github-com-ajstarks-deck"
SRC_URI[github-com-ajstarks-deck.sha256sum] = "e9a14e9d68d215cc9f6082744fa051c118f53ff4fecff7a29c232f0566ba00e8"

GOSRC_LICENSE += "\
    CC-BY-4.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/ajstarks/deck/LICENSE-link.txt;md5=91b36dd971962750ade89a514bb74c91 \
    file://src/github.com/ajstarks/deck/LICENSE;md5=3b22a81e54b780d09703d7337097cd5d \
"

GOSRC_INCLUDEGUARD += "github.com-ajstarks-deck-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'fyne.io-fyne-v2-sources.inc', '', 'fyne.io-fyne-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gioui.org-sources.inc', '', 'gioui.org-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-ajstarks-deck-generate-sources.inc', '', 'github.com-ajstarks-deck-generate-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-ajstarks-fc-sources.inc', '', 'github.com-ajstarks-fc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-ajstarks-giocanvas-sources.inc', '', 'github.com-ajstarks-giocanvas-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-ajstarks-openvg-sources.inc', '', 'github.com-ajstarks-openvg-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-ajstarks-svgo-sources.inc', '', 'github.com-ajstarks-svgo-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-disintegration-gift-sources.inc', '', 'github.com-disintegration-gift-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-fogleman-gg-sources.inc', '', 'github.com-fogleman-gg-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-pdf-fpdf-sources.inc', '', 'github.com-go-pdf-fpdf-sources.inc', d)}
