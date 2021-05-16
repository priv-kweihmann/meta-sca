SRC_URI += "https://proxy.golang.org/golang.org/x/oauth2/@v/v0.0.0-20210514164344-f6687ab2804c.zip;srcoutput=golang.org/x/oauth2;srcinput=golang.org/x/oauth2@v0.0.0-20210514164344-f6687ab2804c;downloadfilename=golang-org-x-oauth2-0.0.0-20210514164344-f6687ab2804c.zip;name=golang-org-x-oauth2"
SRC_URI[golang-org-x-oauth2.sha256sum] = "2c82b9577aadca3c01aadcb01ed135b43a1c154091865f32bc8e52f27dd4d884"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/oauth2/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-oauth2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-sources.inc', '', 'cloud.google.com-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-appengine-sources.inc', '', 'google.golang.org-appengine-sources.inc', d)}
