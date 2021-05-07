SRC_URI += "https://proxy.golang.org/go.uber.org/multierr/@v/v1.7.0.zip;srcoutput=go.uber.org/multierr;srcinput=go.uber.org/multierr@v1.7.0;downloadfilename=go-uber-org-multierr-1.7.0.zip;name=go-uber-org-multierr"
SRC_URI[go-uber-org-multierr.sha256sum] = "abee21bbd1cb62b0721680430ef8e098717299d10b4382876b9aa40664e6556c"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/go.uber.org/multierr/LICENSE.txt;md5=721ac51ede11efb667ff53a866be23c4 \
"

GOSRC_INCLUDEGUARD += "go.uber.org-multierr-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.uber.org-atomic-sources.inc', '', 'go.uber.org-atomic-sources.inc', d)}
