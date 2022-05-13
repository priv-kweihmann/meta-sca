SRC_URI += "https://proxy.golang.org/github.com/phpdave11/gofpdi/@v/v1.0.13.zip;srcoutput=github.com/phpdave11/gofpdi;srcinput=github.com/phpdave11/gofpdi@v1.0.13;downloadfilename=github-com-phpdave11-gofpdi-1.0.13.zip;name=github-com-phpdave11-gofpdi"
SRC_URI[github-com-phpdave11-gofpdi.sha256sum] = "09b728136cf290f4ee87aa47b60f2f9df2b3f4f64119ff10f12319bc3438b58d"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/phpdave11/gofpdi/LICENSE;md5=c34303085b2b2da9504d2cf8f0b74df7 \
"

GOSRC_INCLUDEGUARD += "github.com-phpdave11-gofpdi-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pkg-errors-sources.inc', '', 'github.com-pkg-errors-sources.inc', d)}
