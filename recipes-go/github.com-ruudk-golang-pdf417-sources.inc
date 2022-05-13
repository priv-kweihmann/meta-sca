SRC_URI += "https://proxy.golang.org/github.com/ruudk/golang-pdf417/@v/v0.0.0-20201230142125-a7e3863a1245.zip;srcoutput=github.com/ruudk/golang-pdf417;srcinput=github.com/ruudk/golang-pdf417@v0.0.0-20201230142125-a7e3863a1245;downloadfilename=github-com-ruudk-golang-pdf417-0.0.0-20201230142125-a7e3863a1245.zip;name=github-com-ruudk-golang-pdf417"
SRC_URI[github-com-ruudk-golang-pdf417.sha256sum] = "f0006c0f60789da76c1b3fef73bb63f5581744fbe3ab5973ec718b40c6822f69"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/ruudk/golang-pdf417/LICENSE;md5=e4d6b4661aaeb3a45ce41735bcac8129 \
"

GOSRC_INCLUDEGUARD += "github.com-ruudk-golang-pdf417-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-boombuler-barcode-sources.inc', '', 'github.com-boombuler-barcode-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-phpdave11-gofpdf-sources.inc', '', 'github.com-phpdave11-gofpdf-sources.inc', d)}
