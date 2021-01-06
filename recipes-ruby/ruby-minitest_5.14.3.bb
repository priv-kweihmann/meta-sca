SUMMARY = "RubyGem: minitest"
DESCRIPTION = "minitest provides a complete suite of testing facilities supportingTDD, BDD, mocking, and benchmarking.    I had a class with Jim Weirich on testing last week and we were     allowed to choose our testing frameworks"
HOMEPAGE = "https://github.com/seattlerb/minitest"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.rdoc;beginline=741;endline=764;md5=5db85eba7780ac1765a03fe0e5ec1657"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "c03e88a9508d6807970a51c5b8fba0d9"
SRC_URI[sha256sum] = "b2f80910d5ae04615c1f94645882b87cf22c17123c0ebd0e4cd8e8867883f246"

GEM_NAME = "minitest"

inherit rubygems
