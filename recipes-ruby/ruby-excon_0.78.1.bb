SUMMARY = "RubyGem: excon"
DESCRIPTION = "EXtended http(s) CONnections"
HOMEPAGE = "https://github.com/excon/excon"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=8b04a0291ec55b31563a50b191b72cb1"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "2e71c6f09a429b711b97f3bdc1943ef8"
SRC_URI[sha256sum] = "b994a87e250c8c896f2d2d2e93688a771e976b15a3fd20fd005a8e7d8241329a"

GEM_NAME = "excon"

inherit rubygems
