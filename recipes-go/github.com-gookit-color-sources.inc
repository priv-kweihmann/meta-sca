SRC_URI += "https://proxy.golang.org/github.com/gookit/color/@v/v1.5.0.zip;srcoutput=github.com/gookit/color;srcinput=github.com/gookit/color@v1.5.0;downloadfilename=github-com-gookit-color-1.5.0.zip;name=github-com-gookit-color"
SRC_URI[github-com-gookit-color.sha256sum] = "d2f3e18f172069d9ed1cdedc09009ab85ee2bb30fdbcd2a5a3acc9204cc171bb"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gookit/color/LICENSE;md5=e3aad5860068665df2e421afed153e7d \
"

GOSRC_INCLUDEGUARD += "github.com-gookit-color-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-xo-terminfo-sources.inc', '', 'github.com-xo-terminfo-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
