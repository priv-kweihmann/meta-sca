SUMMARY = "RubyGem: minitest"
DESCRIPTION = "minitest provides a complete suite of testing facilities supportingTDD, BDD, mocking, and benchmarking.    I had a class with Jim Weirich on testing last week and we were     allowed to choose our testing frameworks"
HOMEPAGE = "https://github.com/seattlerb/minitest"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.rdoc;beginline=741;endline=764;md5=5db85eba7780ac1765a03fe0e5ec1657"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "486ddf8c8e8a80f1cdf54166750b4b6b"
SRC_URI[sha256sum] = "9b401338e287c50cd2354353b4b781d3766d863cae413b2a1bf585d237131e9c"

GEM_NAME = "minitest"

inherit rubygems
