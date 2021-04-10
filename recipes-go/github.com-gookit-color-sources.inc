SRC_URI += "https://proxy.golang.org/github.com/gookit/color/@v/v1.4.2.zip;srcoutput=github.com/gookit/color;srcinput=github.com/gookit/color@v1.4.2;downloadfilename=github-com-gookit-color-1.4.2.zip;name=github-com-gookit-color"
SRC_URI[github-com-gookit-color.sha256sum] = "da649e806704b461a251024f5b496d6e728bb559c8a79d28935d9e386b36ccd9"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gookit/color/LICENSE;md5=e3aad5860068665df2e421afed153e7d \
"

GOSRC_INCLUDEGUARD += "github.com-gookit-color-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-xo-terminfo-sources.inc', '', 'github.com-xo-terminfo-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
