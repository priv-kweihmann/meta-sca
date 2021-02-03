SUMMARY = "RubyGem: excon"
DESCRIPTION = "EXtended http(s) CONnections"
HOMEPAGE = "https://github.com/excon/excon"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=8b04a0291ec55b31563a50b191b72cb1"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "d90a38c00d20fb07d51732aab9dacc68"
SRC_URI[sha256sum] = "4344c30920b6307abec145863035fe71bbb1be243fe8d60ce2fa61f333d0a99c"

GEM_NAME = "excon"

inherit rubygems
