SRC_URI += "https://proxy.golang.org/go.uber.org/zap/@v/v1.20.0.zip;srcoutput=go.uber.org/zap;srcinput=go.uber.org/zap@v1.20.0;downloadfilename=go-uber-org-zap-1.20.0.zip;name=go-uber-org-zap"
SRC_URI[go-uber-org-zap.sha256sum] = "3dc21f94c0e326a5c03a6a186ca26e9ebe60264e0fe7099d02177c262c4ef494"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/go.uber.org/zap/LICENSE.txt;md5=5e8153e456a82529ea845e0d511abb69 \
"

GOSRC_INCLUDEGUARD += "go.uber.org-zap-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-benbjohnson-clock-sources.inc', '', 'github.com-benbjohnson-clock-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.uber.org-atomic-sources.inc', '', 'go.uber.org-atomic-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.uber.org-multierr-sources.inc', '', 'go.uber.org-multierr-sources.inc', d)}
