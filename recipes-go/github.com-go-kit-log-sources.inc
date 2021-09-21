SRC_URI += "https://proxy.golang.org/github.com/go-kit/log/@v/v0.2.0.zip;srcoutput=github.com/go-kit/log;srcinput=github.com/go-kit/log@v0.2.0;downloadfilename=github-com-go-kit-log-0.2.0.zip;name=github-com-go-kit-log"
SRC_URI[github-com-go-kit-log.sha256sum] = "b88e09ff7e769ea9d73998f5ef4e03e3678b87ecc8df28ce31e5173ea0be6290"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-kit/log/LICENSE;md5=5b7c15ad5fffe2ff6e9d58a6c161f082 \
    file://src/github.com/go-kit/log/term/LICENSE;md5=8dadfef729c08ec4e631c4f6fc5d43a0 \
"

GOSRC_INCLUDEGUARD += "github.com-go-kit-log-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-logfmt-logfmt-sources.inc', '', 'github.com-go-logfmt-logfmt-sources.inc', d)}
