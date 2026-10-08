SRC_URI += "https://proxy.golang.org/github.com/mattn/go-colorable/@v/v0.1.16.zip;srcoutput=github.com/mattn/go-colorable;srcinput=github.com/mattn/go-colorable@v0.1.16;downloadfilename=github-com-mattn-go-colorable-0.1.16.zip;name=github-com-mattn-go-colorable"
SRC_URI[github-com-mattn-go-colorable.sha256sum] = "1b43236db9dc34e69edf02373e3ba86c058cc34c672f3e3610425cadcf6efd57"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/mattn/go-colorable/LICENSE;md5=24ce168f90aec2456a73de1839037245 \
"

GOSRC_INCLUDEGUARD += "github.com-mattn-go-colorable-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mattn-go-isatty-sources.inc', '', 'github.com-mattn-go-isatty-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
