SRC_URI += "https://proxy.golang.org/go.uber.org/multierr/@v/v1.9.0.zip;srcoutput=go.uber.org/multierr;srcinput=go.uber.org/multierr@v1.9.0;downloadfilename=go-uber-org-multierr-1.9.0.zip;name=go-uber-org-multierr"
SRC_URI[go-uber-org-multierr.sha256sum] = "b029b936a6b10ae3fa158e14f89910da317bd678fc66f51f9c4612098005d367"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/go.uber.org/multierr/LICENSE.txt;md5=721ac51ede11efb667ff53a866be23c4 \
"

GOSRC_INCLUDEGUARD += "go.uber.org-multierr-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.uber.org-atomic-sources.inc', '', 'go.uber.org-atomic-sources.inc', d)}
