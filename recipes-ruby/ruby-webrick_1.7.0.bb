SUMMARY = "RubyGem: webrick"
DESCRIPTION = "WEBrick is an HTTP server toolkit that can be configured as an HTTPS server, a proxy server, and a virtual-host server."
HOMEPAGE = "https://github.com/ruby/webrick"

LICENSE = "Ruby & BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=19aaf65c88a40b508d17ae4be539c4b5"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "00739c2de1b9986f8db84355ac0da787"
SRC_URI[sha256sum] = "87e9b8e39947b7925338a5eb55427b11ce1f2b25a3645770ec9f39d8ebdb8cb4"

GEM_NAME = "webrick"

inherit rubygems
