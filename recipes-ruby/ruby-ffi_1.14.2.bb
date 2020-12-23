SUMMARY = "RubyGem: ffi"
DESCRIPTION = "Ruby FFI library"
HOMEPAGE = "https://github.com/ffi/ffi/wiki"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=0b4e3af2fd54eb00a94b967e6b927818"

DEPENDS += ""
RDEPENDS_${PN} += "bash \
                  libffi"

SRC_URI[md5sum] = "5306117e5b4ad2332d31cc2661867942"
SRC_URI[sha256sum] = "7dce3fe0f047a6f774d141d4667c9d23ee28c8dc72fbef6194dca398808f0f96"

GEM_NAME = "ffi"

inherit rubygems
