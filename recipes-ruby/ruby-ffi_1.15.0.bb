SUMMARY = "RubyGem: ffi"
DESCRIPTION = "Ruby FFI library"
HOMEPAGE = "https://github.com/ffi/ffi/wiki"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=0b4e3af2fd54eb00a94b967e6b927818"

DEPENDS += ""
RDEPENDS_${PN} += "bash \
                  libffi"

SRC_URI[md5sum] = "d5d910a1a5b079caf88d73bd2c956a3c"
SRC_URI[sha256sum] = "621057e9bd2bd5771a072015ed57b71f9be43b5d9f18b53863d4bbb5c772015b"

GEM_NAME = "ffi"

inherit rubygems
