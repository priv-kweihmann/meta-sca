SRC_URI += "https://proxy.golang.org/go.uber.org/zap/@v/v1.18.1.zip;srcoutput=go.uber.org/zap;srcinput=go.uber.org/zap@v1.18.1;downloadfilename=go-uber-org-zap-1.18.1.zip;name=go-uber-org-zap"
SRC_URI[go-uber-org-zap.sha256sum] = "db413b242e76f0d8b8bc0a16d6108763c2ff6b2bec325edadbaf5bf13ae2d5aa"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/go.uber.org/zap/LICENSE.txt;md5=5e8153e456a82529ea845e0d511abb69 \
"

GOSRC_INCLUDEGUARD += "go.uber.org-zap-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.uber.org-atomic-sources.inc', '', 'go.uber.org-atomic-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.uber.org-multierr-sources.inc', '', 'go.uber.org-multierr-sources.inc', d)}
