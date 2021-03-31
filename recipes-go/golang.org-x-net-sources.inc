SRC_URI_append = " https://proxy.golang.org/golang.org/x/net/@v/v0.0.0-20210331060903-cb1fcc7394e5.zip;srcoutput=golang.org/x/net;srcinput=golang.org/x/net@v0.0.0-20210331060903-cb1fcc7394e5;downloadfilename=golang-org-x-net-0.0.0-20210331060903-cb1fcc7394e5.zip;name=golang-org-x-net"
SRC_URI[golang-org-x-net.sha256sum] = "6ef4f2201a538fe9c3cde2ed5e748f06f30d6c9ead13124a4c1b75e959a615db"

MOD_LICENSE_append = " \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/golang.org/x/net/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"
