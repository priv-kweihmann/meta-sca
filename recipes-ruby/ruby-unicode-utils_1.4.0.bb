SUMMARY = "RubyGem: unicode_utils"
DESCRIPTION = "additional Unicode aware functions for Ruby 1.9"
HOMEPAGE = "http://github.com/lang/unicode_utils"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3a45ef0a68a7d2a77bf618aec9bcc9f8"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "41c03db8fcf1f3d9732cc75cb3b582d3"
SRC_URI[sha256sum] = "b922d0cf2313b6b7136ada6645ce7154ffc86418ca07d53b058efe9eb72f2a40"

GEM_NAME = "unicode_utils"

inherit rubygems
