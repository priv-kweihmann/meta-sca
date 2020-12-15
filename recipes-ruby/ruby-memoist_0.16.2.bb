SUMMARY = "RubyGem: memoist"
DESCRIPTION = "memoize methods invocation"
HOMEPAGE = "https://github.com/matthewrudy/memoist"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=fb3611b020d67b86d53ecb8ff06ec16f"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "544fcdcceecf1527eb6e1b45809508f2"
SRC_URI[sha256sum] = "a52c53a3f25b5875151670b2f3fd44388633486dc0f09f9a7150ead1e3bf3c45"

GEM_NAME = "memoist"

inherit rubygems
