SRC_URI += "https://proxy.golang.org/github.com/google/uuid/@v/v1.3.0.zip;srcoutput=github.com/google/uuid;srcinput=github.com/google/uuid@v1.3.0;downloadfilename=github-com-google-uuid-1.3.0.zip;name=github-com-google-uuid"
SRC_URI[github-com-google-uuid.sha256sum] = "0a5fcc05ea492afeaca984a012485f6a15e2259b32f1206d6f36a88c88afc607"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/google/uuid/LICENSE;md5=88073b6dd8ec00fe09da59e0b6dfded1 \
"

GOSRC_INCLUDEGUARD += "github.com-google-uuid-sources.inc"

