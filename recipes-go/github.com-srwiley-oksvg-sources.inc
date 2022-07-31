SRC_URI += "https://proxy.golang.org/github.com/srwiley/oksvg/@v/v0.0.0-20220731023508-a61f04f16b76.zip;srcoutput=github.com/srwiley/oksvg;srcinput=github.com/srwiley/oksvg@v0.0.0-20220731023508-a61f04f16b76;downloadfilename=github-com-srwiley-oksvg-0.0.0-20220731023508-a61f04f16b76.zip;name=github-com-srwiley-oksvg"
SRC_URI[github-com-srwiley-oksvg.sha256sum] = "5d804fb1fbd5c22c31a4de7516d9cb6e37eef9115e4e9704510ffc31c8520258"

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
