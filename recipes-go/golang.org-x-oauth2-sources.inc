SRC_URI += "https://proxy.golang.org/golang.org/x/oauth2/@v/v0.0.0-20220630143837-2104d58473e0.zip;srcoutput=golang.org/x/oauth2;srcinput=golang.org/x/oauth2@v0.0.0-20220630143837-2104d58473e0;downloadfilename=golang-org-x-oauth2-0.0.0-20220630143837-2104d58473e0.zip;name=golang-org-x-oauth2"
SRC_URI[golang-org-x-oauth2.sha256sum] = "7a657b081f45b36bd456ab4cb3fb99700c6f60e07ce97e0f93d1ea373cd3c449"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/oauth2/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-oauth2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-compute-sources.inc', '', 'cloud.google.com-go-compute-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-appengine-sources.inc', '', 'google.golang.org-appengine-sources.inc', d)}
