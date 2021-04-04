SRC_URI += "https://proxy.golang.org/github.com/gofrs/uuid/@v/v4.0.0+incompatible.zip;srcoutput=github.com/gofrs/uuid;srcinput=github.com/gofrs/uuid@v4.0.0+incompatible;downloadfilename=github-com-gofrs-uuid-4.0.0+incompatible.zip;name=github-com-gofrs-uuid"
SRC_URI[github-com-gofrs-uuid.sha256sum] = "8cadafda9aea197d34898d6945692173ac1d8abf3b559c4e5a59a577fc60f55e"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gofrs/uuid/LICENSE;md5=ae4ba217c6e20c2d8f48f69966b9121b \
"

GOSRC_INCLUDEGUARD += "github.com-gofrs-uuid-sources.inc"

