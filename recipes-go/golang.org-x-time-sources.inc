SRC_URI_append = " https://proxy.golang.org/golang.org/x/time/@v/v0.0.0-20210220033141-f8bda1e9f3ba.zip;srcoutput=golang.org/x/time;srcinput=golang.org/x/time@v0.0.0-20210220033141-f8bda1e9f3ba;downloadfilename=golang-org-x-time-0.0.0-20210220033141-f8bda1e9f3ba.zip;name=golang-org-x-time"
SRC_URI[golang-org-x-time.sha256sum] = "c7d7c223c3e70e09d8ca969ed1e1247974281a28ca6773b3b552ec33725e2e6b"

MOD_LICENSE_append = " \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/golang.org/x/time/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"
