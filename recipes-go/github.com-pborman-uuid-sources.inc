SRC_URI_append = " https://proxy.golang.org/github.com/pborman/uuid/@v/v1.2.1.zip;srcoutput=github.com/pborman/uuid;srcinput=github.com/pborman/uuid@v1.2.1;downloadfilename=github-com-pborman-uuid-1.2.1.zip;name=github-com-pborman-uuid"
SRC_URI[github-com-pborman-uuid.sha256sum] = "3699aef3b9e0a97863a4a90bf26254d1a6ba03a2b1d4f4d2a5061c4d29d9dd7f"

MOD_LICENSE_append = " \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/pborman/uuid/LICENSE;md5=88073b6dd8ec00fe09da59e0b6dfded1 \
"
