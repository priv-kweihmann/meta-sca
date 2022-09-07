SRC_URI += "https://proxy.golang.org/github.com/srwiley/oksvg/@v/v0.0.0-20220904191616-8889df18e8f4.zip;srcoutput=github.com/srwiley/oksvg;srcinput=github.com/srwiley/oksvg@v0.0.0-20220904191616-8889df18e8f4;downloadfilename=github-com-srwiley-oksvg-0.0.0-20220904191616-8889df18e8f4.zip;name=github-com-srwiley-oksvg"
SRC_URI[github-com-srwiley-oksvg.sha256sum] = "dc3c198bbd0b482014ed0acaee6ef2abb35ddea35360ce5c9ff4fae2c030e339"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    CC-BY-3.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/srwiley/oksvg/LICENSE;md5=47134d824e73ae9620691341587b7713 \
    file://src/github.com/srwiley/oksvg/testdata/LICENSE;md5=9ee94e42d1ccc4f613e3d49244b9b399 \
"

GOSRC_INCLUDEGUARD += "github.com-srwiley-oksvg-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-srwiley-rasterx-sources.inc', '', 'github.com-srwiley-rasterx-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-image-sources.inc', '', 'golang.org-x-image-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
