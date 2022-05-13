SRC_URI += "https://proxy.golang.org/github.com/npillmayer/schuko/@v/v0.1.0.zip;srcoutput=github.com/npillmayer/schuko;srcinput=github.com/npillmayer/schuko@v0.1.0;downloadfilename=github-com-npillmayer-schuko-0.1.0.zip;name=github-com-npillmayer-schuko"
SRC_URI[github-com-npillmayer-schuko.sha256sum] = "6b06b40911c941c804494e3410f47128a71f3f8bb85baf27d48ae24421eb88ef"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/npillmayer/schuko/LICENSE;md5=e17c94d51197973a7d8e9509279dc358 \
"

GOSRC_INCLUDEGUARD += "github.com-npillmayer-schuko-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-davecgh-go-spew-sources.inc', '', 'github.com-davecgh-go-spew-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-sirupsen-logrus-sources.inc', '', 'github.com-sirupsen-logrus-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-spf13-viper-sources.inc', '', 'github.com-spf13-viper-sources.inc', d)}
