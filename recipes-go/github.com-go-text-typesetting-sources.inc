SRC_URI += "https://proxy.golang.org/github.com/go-text/typesetting/@v/v0.0.0-20220411150340-35994bc27a7b.zip;srcoutput=github.com/go-text/typesetting;srcinput=github.com/go-text/typesetting@v0.0.0-20220411150340-35994bc27a7b;downloadfilename=github-com-go-text-typesetting-0.0.0-20220411150340-35994bc27a7b.zip;name=github-com-go-text-typesetting"
SRC_URI[github-com-go-text-typesetting.sha256sum] = "aec5a909ba6f92e9c772f229306a342e758a27940656e5adb625eabaa7857805"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    Unlicense \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-text/typesetting/LICENSE;md5=72e4ee4d6a5273e2974e8c4c8a272733 \
"

GOSRC_INCLUDEGUARD += "github.com-go-text-typesetting-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-benoitkugler-textlayout-sources.inc', '', 'github.com-benoitkugler-textlayout-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-image-sources.inc', '', 'golang.org-x-image-sources.inc', d)}
