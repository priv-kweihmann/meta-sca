SUMMARY = "RubyGem: unf_ext"
DESCRIPTION = "Unicode Normalization Form support library for CRuby"
HOMEPAGE = "https://github.com/knu/ruby-unf_ext"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=eeabce56bdb2bf10564523e7b9e42412"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "f9062518fe49934b0d22f04b5cbb98fd"
SRC_URI[sha256sum] = "e4e9b1f0c48467fa271d53b180f4ace4c0ff88f01a69ae3da2c30038443e8471"

GEM_NAME = "unf_ext"

inherit rubygems
