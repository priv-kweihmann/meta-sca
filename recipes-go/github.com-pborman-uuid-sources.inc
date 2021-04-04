SRC_URI += "https://proxy.golang.org/github.com/pborman/uuid/@v/v1.2.1.zip;srcoutput=github.com/pborman/uuid;srcinput=github.com/pborman/uuid@v1.2.1;downloadfilename=github-com-pborman-uuid-1.2.1.zip;name=github-com-pborman-uuid"
SRC_URI[github-com-pborman-uuid.sha256sum] = "3699aef3b9e0a97863a4a90bf26254d1a6ba03a2b1d4f4d2a5061c4d29d9dd7f"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/pborman/uuid/LICENSE;md5=88073b6dd8ec00fe09da59e0b6dfded1 \
"

GOSRC_INCLUDEGUARD += "github.com-pborman-uuid-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-uuid-sources.inc', '', 'github.com-google-uuid-sources.inc', d)}
