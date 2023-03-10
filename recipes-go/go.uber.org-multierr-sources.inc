SRC_URI += "https://proxy.golang.org/go.uber.org/multierr/@v/v1.10.0.zip;srcoutput=go.uber.org/multierr;srcinput=go.uber.org/multierr@v1.10.0;downloadfilename=go-uber-org-multierr-1.10.0.zip;name=go-uber-org-multierr"
SRC_URI[go-uber-org-multierr.sha256sum] = "4f9b84b659dea0f46b036655fd3bd81a608de982fe2456e38637dc9eb24faf0d"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/go.uber.org/multierr/LICENSE.txt;md5=721ac51ede11efb667ff53a866be23c4 \
"

GOSRC_INCLUDEGUARD += "go.uber.org-multierr-sources.inc"

