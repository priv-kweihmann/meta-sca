SRC_URI_append = " https://proxy.golang.org/golang.org/x/sync/@v/v0.0.0-20210220032951-036812b2e83c.zip;srcoutput=golang.org/x/sync;srcinput=golang.org/x/sync@v0.0.0-20210220032951-036812b2e83c;downloadfilename=golang-org-x-sync-0.0.0-20210220032951-036812b2e83c.zip;name=golang-org-x-sync"
SRC_URI[golang-org-x-sync.sha256sum] = "92a8663af035a6831dcc9cc9d895a1f4bb51fc21efe97f04fa0676fc14992a46"

MOD_LICENSE_append = " \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/golang.org/x/sync/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"
