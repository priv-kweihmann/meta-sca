SRC_URI += "https://proxy.golang.org/github.com/srwiley/rasterx/@v/v0.0.0-20220730225603-2ab79fcdd4ef.zip;srcoutput=github.com/srwiley/rasterx;srcinput=github.com/srwiley/rasterx@v0.0.0-20220730225603-2ab79fcdd4ef;downloadfilename=github-com-srwiley-rasterx-0.0.0-20220730225603-2ab79fcdd4ef.zip;name=github-com-srwiley-rasterx"
SRC_URI[github-com-srwiley-rasterx.sha256sum] = "4e76d6b2bd959c0ab7be2fbe1d9c454817e17d3d64ee49a7d78b1bddb7790a75"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/srwiley/rasterx/LICENSE;md5=47134d824e73ae9620691341587b7713 \
"

GOSRC_INCLUDEGUARD += "github.com-srwiley-rasterx-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-image-sources.inc', '', 'golang.org-x-image-sources.inc', d)}
