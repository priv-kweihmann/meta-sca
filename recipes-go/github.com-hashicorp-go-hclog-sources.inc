SRC_URI += "https://proxy.golang.org/github.com/hashicorp/go-hclog/@v/v1.2.1.zip;srcoutput=github.com/hashicorp/go-hclog;srcinput=github.com/hashicorp/go-hclog@v1.2.1;downloadfilename=github-com-hashicorp-go-hclog-1.2.1.zip;name=github-com-hashicorp-go-hclog"
SRC_URI[github-com-hashicorp-go-hclog.sha256sum] = "2759f338e16b662d92d590524a63a2429f8d8693a96a759e4eba11b54644fa34"

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
