SRC_URI += "https://proxy.golang.org/github.com/go-kit/log/@v/v0.1.0.zip;srcoutput=github.com/go-kit/log;srcinput=github.com/go-kit/log@v0.1.0;downloadfilename=github-com-go-kit-log-0.1.0.zip;name=github-com-go-kit-log"
SRC_URI[github-com-go-kit-log.sha256sum] = "e0676df7357654a000008dfad3b6b211cba3595f32d3e220edd63a4c9d0d9254"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-kit/log/LICENSE;md5=5b7c15ad5fffe2ff6e9d58a6c161f082 \
    file://src/github.com/go-kit/log/term/LICENSE;md5=8dadfef729c08ec4e631c4f6fc5d43a0 \
"

GOSRC_INCLUDEGUARD += "github.com-go-kit-log-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-logfmt-logfmt-sources.inc', '', 'github.com-go-logfmt-logfmt-sources.inc', d)}
