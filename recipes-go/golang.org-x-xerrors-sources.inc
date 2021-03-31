SRC_URI_append = " https://proxy.golang.org/golang.org/x/xerrors/@v/v0.0.0-20200804184101-5ec99f83aff1.zip;srcoutput=golang.org/x/xerrors;srcinput=golang.org/x/xerrors@v0.0.0-20200804184101-5ec99f83aff1;downloadfilename=golang-org-x-xerrors-0.0.0-20200804184101-5ec99f83aff1.zip;name=golang-org-x-xerrors"
SRC_URI[golang-org-x-xerrors.sha256sum] = "380aaa3368ae165628bb487cf4e695a55c1420072b8b7a6f59c122f6a23bb255"

MOD_LICENSE_append = " \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/golang.org/x/xerrors/LICENSE;md5=a413d6b3884e141783f23d00d5838777 \
"
