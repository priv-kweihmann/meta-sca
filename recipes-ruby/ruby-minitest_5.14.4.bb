SUMMARY = "RubyGem: minitest"
DESCRIPTION = "minitest provides a complete suite of testing facilities supportingTDD, BDD, mocking, and benchmarking.    I had a class with Jim Weirich on testing last week and we were     allowed to choose our testing frameworks"
HOMEPAGE = "https://github.com/seattlerb/minitest"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.rdoc;beginline=777;endline=800;md5=5db85eba7780ac1765a03fe0e5ec1657"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "58943b92082de063540e80961d7c437f"
SRC_URI[sha256sum] = "f4716634d71b3ffb627cd63ba4f6f0f77c7a3f17353b1bdf52c8a7f2e0e4e7a7"

GEM_NAME = "minitest"

inherit rubygems
