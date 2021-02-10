SUMMARY = "RubyGem: rexml"
DESCRIPTION = "An XML toolkit for Ruby"
HOMEPAGE = "https://github.com/ruby/rexml"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=19aaf65c88a40b508d17ae4be539c4b5"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "ac353f70b3402cc01c283860dcbd9789"
SRC_URI[sha256sum] = "036b31f3c052be42b7a2e6914f3322daaecce46b172806f38fea4297389b7bd6"

GEM_NAME = "rexml"

inherit rubygems
inherit native
