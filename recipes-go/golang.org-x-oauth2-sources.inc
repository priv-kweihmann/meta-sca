SRC_URI += "https://proxy.golang.org/golang.org/x/oauth2/@v/v0.8.0.zip;srcoutput=golang.org/x/oauth2;srcinput=golang.org/x/oauth2@v0.8.0;downloadfilename=golang-org-x-oauth2-0.8.0.zip;name=golang-org-x-oauth2"
SRC_URI[golang-org-x-oauth2.sha256sum] = "774ad761b3732b86eaa3d70c30bcaed6dd09e96eec3cdeb2c0a9c112ce168704"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/oauth2/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-oauth2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-compute-metadata-sources.inc', '', 'cloud.google.com-go-compute-metadata-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-appengine-sources.inc', '', 'google.golang.org-appengine-sources.inc', d)}
