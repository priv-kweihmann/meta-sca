SUMMARY = "RubyGem: thor"
DESCRIPTION = "Thor is a toolkit for building powerful command-line interfaces."
HOMEPAGE = "http://whatisthor.com/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=690cce21f4e069148a52834e1ecf352e"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "052eb36fd3e522331af98449556991dc"
SRC_URI[sha256sum] = "7572061e3cbe6feee57828670e6a25a66dd397f05c1f8515d49f770a7d9d70f5"

GEM_NAME = "thor"

inherit rubygems
