SUMMARY = "RubyGem: thor"
DESCRIPTION = "Thor is a toolkit for building powerful command-line interfaces."
HOMEPAGE = "http://whatisthor.com/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=690cce21f4e069148a52834e1ecf352e"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "0d39b5be66778612f3233253e5b78ae6"
SRC_URI[sha256sum] = "cacae12a3761be4ccbe63be19261352b108f86c721c37d87664328efeaa6d0a3"

GEM_NAME = "thor"

inherit rubygems
