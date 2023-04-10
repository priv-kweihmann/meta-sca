SRC_URI += "https://proxy.golang.org/go.uber.org/multierr/@v/v1.11.0.zip;srcoutput=go.uber.org/multierr;srcinput=go.uber.org/multierr@v1.11.0;downloadfilename=go-uber-org-multierr-1.11.0.zip;name=go-uber-org-multierr"
SRC_URI[go-uber-org-multierr.sha256sum] = "2249b5d2fdce61f6ee661a679d8552599af084a761cbbc871da77641bddce0c3"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/go.uber.org/multierr/LICENSE.txt;md5=721ac51ede11efb667ff53a866be23c4 \
"

GOSRC_INCLUDEGUARD += "go.uber.org-multierr-sources.inc"

