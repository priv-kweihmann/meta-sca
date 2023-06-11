SRC_URI += "https://proxy.golang.org/modernc.org/ccgo/v3/@v/v3.16.14.zip;srcoutput=modernc.org/ccgo/v3;srcinput=modernc.org/ccgo/v3@v3.16.14;downloadfilename=modernc-org-ccgo-v3-3.16.14.zip;name=modernc-org-ccgo-v3"
SRC_URI[modernc-org-ccgo-v3.sha256sum] = "3178d17f431bfe21e226d021842eaf4137ef698c622368c9100cf2bfbcf1c6a5"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/modernc.org/ccgo/v3/LICENSE;md5=479232f45c61b557ca15c91bb62675db \
"

GOSRC_INCLUDEGUARD += "modernc.org-ccgo-v3-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-kballard-go-shellquote-sources.inc', '', 'github.com-kballard-go-shellquote-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'modernc.org-cc-v3-sources.inc', '', 'modernc.org-cc-v3-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'modernc.org-libc-sources.inc', '', 'modernc.org-libc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'modernc.org-mathutil-sources.inc', '', 'modernc.org-mathutil-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'modernc.org-opt-sources.inc', '', 'modernc.org-opt-sources.inc', d)}
