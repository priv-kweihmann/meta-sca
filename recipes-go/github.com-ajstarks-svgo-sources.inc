SRC_URI += "https://proxy.golang.org/github.com/ajstarks/svgo/@v/v0.0.0-20211024235047-1546f124cd8b.zip;srcoutput=github.com/ajstarks/svgo;srcinput=github.com/ajstarks/svgo@v0.0.0-20211024235047-1546f124cd8b;downloadfilename=github-com-ajstarks-svgo-0.0.0-20211024235047-1546f124cd8b.zip;name=github-com-ajstarks-svgo"
SRC_URI[github-com-ajstarks-svgo.sha256sum] = "e25b5dbb6cc86d2a0b5db08aad757c534681c2cecb30d84746e09c661cbd7c6f"

GOSRC_LICENSE += "\
    CC-BY-4.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/ajstarks/svgo/LICENSE-link.txt;md5=91b36dd971962750ade89a514bb74c91 \
    file://src/github.com/ajstarks/svgo/LICENSE;md5=3b22a81e54b780d09703d7337097cd5d \
"

GOSRC_INCLUDEGUARD += "github.com-ajstarks-svgo-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-ajstarks-deck-generate-sources.inc', '', 'github.com-ajstarks-deck-generate-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'honnef.co-go-tools-sources.inc', '', 'honnef.co-go-tools-sources.inc', d)}
