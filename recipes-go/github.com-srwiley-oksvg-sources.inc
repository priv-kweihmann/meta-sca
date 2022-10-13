SRC_URI += "https://proxy.golang.org/github.com/srwiley/oksvg/@v/v0.0.0-20221011165216-be6e8873101c.zip;srcoutput=github.com/srwiley/oksvg;srcinput=github.com/srwiley/oksvg@v0.0.0-20221011165216-be6e8873101c;downloadfilename=github-com-srwiley-oksvg-0.0.0-20221011165216-be6e8873101c.zip;name=github-com-srwiley-oksvg"
SRC_URI[github-com-srwiley-oksvg.sha256sum] = "d8e517dd8a48583bc32892a7c430dda165f79907b1fc9e3d49fe59a2894f587b"

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
