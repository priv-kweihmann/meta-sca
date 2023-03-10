SRC_URI += "https://proxy.golang.org/golang.org/x/oauth2/@v/v0.6.0.zip;srcoutput=golang.org/x/oauth2;srcinput=golang.org/x/oauth2@v0.6.0;downloadfilename=golang-org-x-oauth2-0.6.0.zip;name=golang-org-x-oauth2"
SRC_URI[golang-org-x-oauth2.sha256sum] = "7d1eb25d3be3d0da86741eaf9a96cab6587cb08f60c1a0fc1ddcf6e7182db33c"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/oauth2/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-oauth2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-compute-metadata-sources.inc', '', 'cloud.google.com-go-compute-metadata-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-appengine-sources.inc', '', 'google.golang.org-appengine-sources.inc', d)}
