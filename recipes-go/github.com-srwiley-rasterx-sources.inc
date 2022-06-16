SRC_URI += "https://proxy.golang.org/github.com/srwiley/rasterx/@v/v0.0.0-20220615024203-67b7089efd25.zip;srcoutput=github.com/srwiley/rasterx;srcinput=github.com/srwiley/rasterx@v0.0.0-20220615024203-67b7089efd25;downloadfilename=github-com-srwiley-rasterx-0.0.0-20220615024203-67b7089efd25.zip;name=github-com-srwiley-rasterx"
SRC_URI[github-com-srwiley-rasterx.sha256sum] = "22a13cfcba4ef274002cb509f578042fd9a024adbc9145a8a24cdefefb6717e3"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/srwiley/rasterx/LICENSE;md5=47134d824e73ae9620691341587b7713 \
"

GOSRC_INCLUDEGUARD += "github.com-srwiley-rasterx-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-image-sources.inc', '', 'golang.org-x-image-sources.inc', d)}
