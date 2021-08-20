SRC_URI += "https://proxy.golang.org/go.uber.org/zap/@v/v1.19.0.zip;srcoutput=go.uber.org/zap;srcinput=go.uber.org/zap@v1.19.0;downloadfilename=go-uber-org-zap-1.19.0.zip;name=go-uber-org-zap"
SRC_URI[go-uber-org-zap.sha256sum] = "6437824258873fed421b7975b8e4cafd1be80cdc15e553beaa887b499dd01420"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/go.uber.org/zap/LICENSE.txt;md5=5e8153e456a82529ea845e0d511abb69 \
"

GOSRC_INCLUDEGUARD += "go.uber.org-zap-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.uber.org-atomic-sources.inc', '', 'go.uber.org-atomic-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.uber.org-multierr-sources.inc', '', 'go.uber.org-multierr-sources.inc', d)}
