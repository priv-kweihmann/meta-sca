SRC_URI += "https://proxy.golang.org/github.com/hashicorp/go-hclog/@v/v1.2.2.zip;srcoutput=github.com/hashicorp/go-hclog;srcinput=github.com/hashicorp/go-hclog@v1.2.2;downloadfilename=github-com-hashicorp-go-hclog-1.2.2.zip;name=github-com-hashicorp-go-hclog"
SRC_URI[github-com-hashicorp-go-hclog.sha256sum] = "c7872ba43e640d7e09b68a7abd9bb5a9fafe95bb59903bb28fe6580a20dc6303"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/hashicorp/go-hclog/LICENSE;md5=ec7f605b74b9ad03347d0a93a5cc7eb8 \
"

GOSRC_INCLUDEGUARD += "github.com-hashicorp-go-hclog-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-fatih-color-sources.inc', '', 'github.com-fatih-color-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mattn-go-colorable-sources.inc', '', 'github.com-mattn-go-colorable-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mattn-go-isatty-sources.inc', '', 'github.com-mattn-go-isatty-sources.inc', d)}
