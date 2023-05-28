SRC_URI += "https://proxy.golang.org/modernc.org/token/@v/v1.1.0.zip;srcoutput=modernc.org/token;srcinput=modernc.org/token@v1.1.0;downloadfilename=modernc-org-token-1.1.0.zip;name=modernc-org-token"
SRC_URI[modernc-org-token.sha256sum] = "3efaa49e9fb10569da9e09e785fa230cd5c0f50fcf605f3b5439dfcd61577c58"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/modernc.org/token/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "modernc.org-token-sources.inc"

