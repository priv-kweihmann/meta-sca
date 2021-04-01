SRC_URI_append = " https://proxy.golang.org/golang.org/x/net/@v/v0.0.0-20210331212208-0fccb6fa2b5c.zip;srcoutput=golang.org/x/net;srcinput=golang.org/x/net@v0.0.0-20210331212208-0fccb6fa2b5c;downloadfilename=golang-org-x-net-0.0.0-20210331212208-0fccb6fa2b5c.zip;name=golang-org-x-net"
SRC_URI[golang-org-x-net.sha256sum] = "40a25aa5d1f09209ad78388f04bf42b45798d1c0a308e842e2c3e813eac5e501"

MOD_LICENSE_append = " \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/golang.org/x/net/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"
