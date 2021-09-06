SRC_URI += "https://proxy.golang.org/github.com/rs/zerolog/@v/v1.24.0.zip;srcoutput=github.com/rs/zerolog;srcinput=github.com/rs/zerolog@v1.24.0;downloadfilename=github-com-rs-zerolog-1.24.0.zip;name=github-com-rs-zerolog"
SRC_URI[github-com-rs-zerolog.sha256sum] = "7f95fc0c0488e67c0869872ca15cfa37ba6e8eb7857be3245618ad2e7bae1bcc"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/rs/zerolog/LICENSE;md5=298ce0a5a34ff24389ba1355acd24929 \
    file://src/github.com/rs/zerolog/hlog/internal/mutil/LICENSE;md5=976eee5cbc46a62e179b59f362e3af60 \
"

GOSRC_INCLUDEGUARD += "github.com-rs-zerolog-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-coreos-go-systemd-v22-sources.inc', '', 'github.com-coreos-go-systemd-v22-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pkg-errors-sources.inc', '', 'github.com-pkg-errors-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-rs-xid-sources.inc', '', 'github.com-rs-xid-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
