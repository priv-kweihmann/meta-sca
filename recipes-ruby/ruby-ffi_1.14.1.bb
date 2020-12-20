SUMMARY = "RubyGem: ffi"
DESCRIPTION = "Ruby FFI library"
HOMEPAGE = "https://github.com/ffi/ffi/wiki"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=0b4e3af2fd54eb00a94b967e6b927818"

DEPENDS += ""
RDEPENDS_${PN} += "bash \
                  libffi"

SRC_URI[md5sum] = "1866ed4fdd8d305c86412d071e8aa46b"
SRC_URI[sha256sum] = "01f281baf35e3b3314eca601a12543dd1f10d167d327fb0ec282cb43cb9567e4"

GEM_NAME = "ffi"

inherit rubygems
