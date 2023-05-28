SRC_URI += "https://proxy.golang.org/gioui.org/@v/v0.0.0-20230526230622-e3ef98dda382.zip;srcoutput=gioui.org;srcinput=gioui.org@v0.0.0-20230526230622-e3ef98dda382;downloadfilename=gioui-org-0.0.0-20230526230622-e3ef98dda382.zip;name=gioui-org"
SRC_URI[gioui-org.sha256sum] = "845719d147350e8c06b2953ff48c3f531a858c32c6b94331e682bd4ed048659f"

GOSRC_LICENSE += "\
    MIT \
    Unlicense \
"
LIC_FILES_CHKSUM += "\
    file://src/gioui.org/LICENSE;md5=dde5f9fd8ce48e8651e625128022e572 \
"

GOSRC_INCLUDEGUARD += "gioui.org-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gioui.org-cpu-sources.inc', '', 'gioui.org-cpu-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gioui.org-shader-sources.inc', '', 'gioui.org-shader-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-text-typesetting-sources.inc', '', 'github.com-go-text-typesetting-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-exp-shiny-sources.inc', '', 'golang.org-x-exp-shiny-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-exp-sources.inc', '', 'golang.org-x-exp-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-image-sources.inc', '', 'golang.org-x-image-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
