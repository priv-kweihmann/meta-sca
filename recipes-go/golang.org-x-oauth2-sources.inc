SRC_URI += "https://proxy.golang.org/golang.org/x/oauth2/@v/v0.9.0.zip;srcoutput=golang.org/x/oauth2;srcinput=golang.org/x/oauth2@v0.9.0;downloadfilename=golang-org-x-oauth2-0.9.0.zip;name=golang-org-x-oauth2"
SRC_URI[golang-org-x-oauth2.sha256sum] = "ad7cf179bcdfdd3bd37d41a1b09a82ae4f1b23eacc08d15be16c8f74dcccd6f3"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/oauth2/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-oauth2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-compute-metadata-sources.inc', '', 'cloud.google.com-go-compute-metadata-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-appengine-sources.inc', '', 'google.golang.org-appengine-sources.inc', d)}
