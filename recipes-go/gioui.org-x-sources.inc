SRC_URI += "https://proxy.golang.org/gioui.org/x/@v/v0.0.0-20230613140621-9d5605aaf764.zip;srcoutput=gioui.org/x;srcinput=gioui.org/x@v0.0.0-20230613140621-9d5605aaf764;downloadfilename=gioui-org-x-0.0.0-20230613140621-9d5605aaf764.zip;name=gioui-org-x"
SRC_URI[gioui-org-x.sha256sum] = "4fc87c56d42fb4b48a8ac0d2e1ac75fe81ebb0d0838d867ea2d02c45816daa9f"

GOSRC_LICENSE += "\
    MIT \
    Unlicense \
"
LIC_FILES_CHKSUM += "\
    file://src/gioui.org/x/LICENSE;md5=825dd3a6265562cc4ba57d0242dd320d \
"

GOSRC_INCLUDEGUARD += "gioui.org-x-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gioui.org-sources.inc', '', 'gioui.org-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'git.sr.ht--jackmordaunt-go-toast-sources.inc', '', 'git.sr.ht--jackmordaunt-go-toast-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'git.wow.st-gmp-jni-sources.inc', '', 'git.wow.st-gmp-jni-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-andybalholm-stroke-sources.inc', '', 'github.com-andybalholm-stroke-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-esiqveland-notify-sources.inc', '', 'github.com-esiqveland-notify-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-godbus-dbus-v5-sources.inc', '', 'github.com-godbus-dbus-v5-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-yuin-goldmark-sources.inc', '', 'github.com-yuin-goldmark-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-exp-shiny-sources.inc', '', 'golang.org-x-exp-shiny-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-exp-sources.inc', '', 'golang.org-x-exp-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-image-sources.inc', '', 'golang.org-x-image-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
