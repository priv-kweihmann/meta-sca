SRC_URI += "https://proxy.golang.org/github.com/srwiley/oksvg/@v/v0.0.0-20220128195007-1f435e4c2b44.zip;srcoutput=github.com/srwiley/oksvg;srcinput=github.com/srwiley/oksvg@v0.0.0-20220128195007-1f435e4c2b44;downloadfilename=github-com-srwiley-oksvg-0.0.0-20220128195007-1f435e4c2b44.zip;name=github-com-srwiley-oksvg"
SRC_URI[github-com-srwiley-oksvg.sha256sum] = "0d4dfbd6ac7cb4eb19c0d445b3e380b069cede0230df67b62d4b5d31bb7a4740"

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
