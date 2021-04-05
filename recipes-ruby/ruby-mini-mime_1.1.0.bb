SUMMARY = "RubyGem: mini_mime"
DESCRIPTION = "A lightweight mime type lookup toy"
HOMEPAGE = "https://github.com/discourse/mini_mime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=4778dbd817e04a19ab6050d5e59bb853"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "aab3c6a3973d16336157d2c36ec43142"
SRC_URI[sha256sum] = "30f2cca8a3c62b5c067f73a1834479dbd85d71f1291d65ffac933dc90796674d"

GEM_NAME = "mini_mime"

inherit rubygems
