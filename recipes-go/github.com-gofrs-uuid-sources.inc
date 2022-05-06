SRC_URI += "https://proxy.golang.org/github.com/gofrs/uuid/@v/v4.2.0+incompatible.zip;srcoutput=github.com/gofrs/uuid;srcinput=github.com/gofrs/uuid@v4.2.0+incompatible;downloadfilename=github-com-gofrs-uuid-4.2.0+incompatible.zip;name=github-com-gofrs-uuid"
SRC_URI[github-com-gofrs-uuid.sha256sum] = "23955c7a756843618708474ff21c4229f611d05e9712876f65a1f5f87dac75b7"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gofrs/uuid/LICENSE;md5=ae4ba217c6e20c2d8f48f69966b9121b \
"

GOSRC_INCLUDEGUARD += "github.com-gofrs-uuid-sources.inc"

