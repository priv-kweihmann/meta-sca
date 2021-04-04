SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/meta/@v/v0.3.0.zip;srcoutput=github.com/gobuffalo/meta;srcinput=github.com/gobuffalo/meta@v0.3.0;downloadfilename=github-com-gobuffalo-meta-0.3.0.zip;name=github-com-gobuffalo-meta"
SRC_URI[github-com-gobuffalo-meta.sha256sum] = "7eac458cfdba7aafacbf5f0587b2f9139a178f597fe42adc7d72893fee6fd5b3"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobuffalo/meta/LICENSE;md5=e15c553ebb88e0f83deb605759a42839 \
"

GOSRC_INCLUDEGUARD += "github.com-gobuffalo-meta-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-burntsushi-toml-sources.inc', '', 'github.com-burntsushi-toml-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-envy-sources.inc', '', 'github.com-gobuffalo-envy-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-flect-sources.inc', '', 'github.com-gobuffalo-flect-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-rogpeppe-go-internal-sources.inc', '', 'github.com-rogpeppe-go-internal-sources.inc', d)}
