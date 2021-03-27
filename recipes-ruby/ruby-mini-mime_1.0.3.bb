SUMMARY = "RubyGem: mini_mime"
DESCRIPTION = "A lightweight mime type lookup toy"
HOMEPAGE = "https://github.com/discourse/mini_mime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=4778dbd817e04a19ab6050d5e59bb853"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "330b892f110ca12d51cc11e68551ccee"
SRC_URI[sha256sum] = "2431112eee6f932459a4cbe011b389601ff27502db5bc20584f03de56dd6e6da"

GEM_NAME = "mini_mime"

inherit rubygems
