SRC_URI_append = " https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20210330210617-4fbd30eecc44.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20210330210617-4fbd30eecc44;downloadfilename=golang-org-x-sys-0.0.0-20210330210617-4fbd30eecc44.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "a69f19fba66d35d2930202b2618e0b2e0b47f72c5939bad314140dd7799e29d0"

MOD_LICENSE_append = " \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"
