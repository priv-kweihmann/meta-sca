SRC_URI += "https://proxy.golang.org/github.com/go-pdf/fpdf/@v/v0.6.0.zip;srcoutput=github.com/go-pdf/fpdf;srcinput=github.com/go-pdf/fpdf@v0.6.0;downloadfilename=github-com-go-pdf-fpdf-0.6.0.zip;name=github-com-go-pdf-fpdf"
SRC_URI[github-com-go-pdf-fpdf.sha256sum] = "03a6909fc346ac972b008b77585ac3954d76b416c33b4b64dc22c5f35f0e1edb"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-pdf/fpdf/LICENSE;md5=70515c20e73965f55f888dd3f7a1d0e2 \
"

GOSRC_INCLUDEGUARD += "github.com-go-pdf-fpdf-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-boombuler-barcode-sources.inc', '', 'github.com-boombuler-barcode-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-phpdave11-gofpdi-sources.inc', '', 'github.com-phpdave11-gofpdi-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-ruudk-golang-pdf417-sources.inc', '', 'github.com-ruudk-golang-pdf417-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-image-sources.inc', '', 'golang.org-x-image-sources.inc', d)}
