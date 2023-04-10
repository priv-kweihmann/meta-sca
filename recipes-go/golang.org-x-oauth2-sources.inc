SRC_URI += "https://proxy.golang.org/golang.org/x/oauth2/@v/v0.7.0.zip;srcoutput=golang.org/x/oauth2;srcinput=golang.org/x/oauth2@v0.7.0;downloadfilename=golang-org-x-oauth2-0.7.0.zip;name=golang-org-x-oauth2"
SRC_URI[golang-org-x-oauth2.sha256sum] = "b682f8cf62ed36f3bec9f8a832ff61a2af1124f31f42c4e1e3f3efd23d88f93f"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/oauth2/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-oauth2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-compute-metadata-sources.inc', '', 'cloud.google.com-go-compute-metadata-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-appengine-sources.inc', '', 'google.golang.org-appengine-sources.inc', d)}
