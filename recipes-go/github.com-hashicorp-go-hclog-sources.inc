SRC_URI += "https://proxy.golang.org/github.com/hashicorp/go-hclog/@v/v0.16.0.zip;srcoutput=github.com/hashicorp/go-hclog;srcinput=github.com/hashicorp/go-hclog@v0.16.0;downloadfilename=github-com-hashicorp-go-hclog-0.16.0.zip;name=github-com-hashicorp-go-hclog"
SRC_URI[github-com-hashicorp-go-hclog.sha256sum] = "ea892748d8f0a9d73282ea481f11b590067f93814ab33770544f8ab40721ba42"

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
