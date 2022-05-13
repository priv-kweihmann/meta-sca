SRC_URI += "https://proxy.golang.org/github.com/srwiley/rasterx/@v/v0.0.0-20220128185129-2efea2b9ea41.zip;srcoutput=github.com/srwiley/rasterx;srcinput=github.com/srwiley/rasterx@v0.0.0-20220128185129-2efea2b9ea41;downloadfilename=github-com-srwiley-rasterx-0.0.0-20220128185129-2efea2b9ea41.zip;name=github-com-srwiley-rasterx"
SRC_URI[github-com-srwiley-rasterx.sha256sum] = "7168d33ae9cb4ce0425a269aae0a51c7b3bb021e3a6477411845a7c67dc691db"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/srwiley/rasterx/LICENSE;md5=47134d824e73ae9620691341587b7713 \
"

GOSRC_INCLUDEGUARD += "github.com-srwiley-rasterx-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-image-sources.inc', '', 'golang.org-x-image-sources.inc', d)}
