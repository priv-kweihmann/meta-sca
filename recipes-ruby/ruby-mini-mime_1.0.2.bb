SUMMARY = "RubyGem: mini_mime"
DESCRIPTION = "A lightweight mime type lookup toy"
HOMEPAGE = "https://github.com/discourse/mini_mime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=4778dbd817e04a19ab6050d5e59bb853"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "4300e2028c2f689bb466a7952dd34871"
SRC_URI[sha256sum] = "0a0ecc37505f011ce78419188f894774806e143a75babaf8485a8fee7b06b5ab"

GEM_NAME = "mini_mime"

inherit rubygems
