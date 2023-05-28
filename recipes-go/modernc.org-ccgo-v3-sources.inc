SRC_URI += "https://proxy.golang.org/modernc.org/ccgo/v3/@v/v3.16.13.zip;srcoutput=modernc.org/ccgo/v3;srcinput=modernc.org/ccgo/v3@v3.16.13;downloadfilename=modernc-org-ccgo-v3-3.16.13.zip;name=modernc-org-ccgo-v3"
SRC_URI[modernc-org-ccgo-v3.sha256sum] = "bfc293300cd1ce656ba0ce0cee1f508afec2518bc4214a6b10ccfad6e8e6046e"

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
