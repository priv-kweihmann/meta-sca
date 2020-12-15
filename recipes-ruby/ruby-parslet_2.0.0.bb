SUMMARY = "RubyGem: parslet"
DESCRIPTION = "Parser construction library with great error reporting in Ruby."
HOMEPAGE = "http://kschiess.github.io/parslet"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2f65b5b49ca1663d46c6265e50511d18"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "4d7c0a5ae11b4a667af5a0dd43e0b044"
SRC_URI[sha256sum] = "d45130695d39b43d7e6a91f4d2ec66b388a8d822bae38de9b4de9a5fbde1f606"

GEM_NAME = "parslet"

inherit rubygems
