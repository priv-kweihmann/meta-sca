SRC_URI += "https://proxy.golang.org/github.com/phpdave11/gofpdf/@v/v1.4.2.zip;srcoutput=github.com/phpdave11/gofpdf;srcinput=github.com/phpdave11/gofpdf@v1.4.2;downloadfilename=github-com-phpdave11-gofpdf-1.4.2.zip;name=github-com-phpdave11-gofpdf"
SRC_URI[github-com-phpdave11-gofpdf.sha256sum] = "4db05258f281b40d8a17392fd71648779ea758a9aa506a8d1346ded737ede43f"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/phpdave11/gofpdf/LICENSE;md5=70515c20e73965f55f888dd3f7a1d0e2 \
"

GOSRC_INCLUDEGUARD += "github.com-phpdave11-gofpdf-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-boombuler-barcode-sources.inc', '', 'github.com-boombuler-barcode-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-phpdave11-gofpdi-sources.inc', '', 'github.com-phpdave11-gofpdi-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-ruudk-golang-pdf417-sources.inc', '', 'github.com-ruudk-golang-pdf417-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-image-sources.inc', '', 'golang.org-x-image-sources.inc', d)}
