SRC_URI += "https://proxy.golang.org/github.com/gofrs/uuid/@v/v4.1.0+incompatible.zip;srcoutput=github.com/gofrs/uuid;srcinput=github.com/gofrs/uuid@v4.1.0+incompatible;downloadfilename=github-com-gofrs-uuid-4.1.0+incompatible.zip;name=github-com-gofrs-uuid"
SRC_URI[github-com-gofrs-uuid.sha256sum] = "530ea4c470dc8b985a16f2d384e65143d9cf7ef849e942f8a2e5d4530b4d3a4a"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gofrs/uuid/LICENSE;md5=ae4ba217c6e20c2d8f48f69966b9121b \
"

GOSRC_INCLUDEGUARD += "github.com-gofrs-uuid-sources.inc"

