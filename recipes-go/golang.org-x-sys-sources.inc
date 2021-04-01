SRC_URI_append = " https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20210331175145-43e1dd70ce54.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20210331175145-43e1dd70ce54;downloadfilename=golang-org-x-sys-0.0.0-20210331175145-43e1dd70ce54.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "08f1929456fc6463ad8585f2974fab7437c354b9f47bff54d06d359d20cf6b10"

MOD_LICENSE_append = " \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"
