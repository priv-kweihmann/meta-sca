SRC_URI_append = " https://proxy.golang.org/go.uber.org/multierr/@v/v1.6.0.zip;srcoutput=go.uber.org/multierr;srcinput=go.uber.org/multierr@v1.6.0;downloadfilename=go-uber-org-multierr-1.6.0.zip;name=go-uber-org-multierr"
SRC_URI[go-uber-org-multierr.sha256sum] = "5238ef4df5394e9b69cc2062592476ab5d8bafa4b876e2aff5413de9b5c05a27"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/go.uber.org/multierr/LICENSE.txt;md5=f65b21a547112d1bc7b11b90f9b31997 \
"
