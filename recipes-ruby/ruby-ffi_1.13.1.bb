SUMMARY = "RubyGem: ffi"
DESCRIPTION = "Ruby FFI library"
HOMEPAGE = "https://github.com/ffi/ffi/wiki"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=0b4e3af2fd54eb00a94b967e6b927818"

DEPENDS = ""
RDEPENDS_${PN} += "bash libffi"

SRC_URI[md5sum] = "569d4561359cb3c8d8360d26bd1be4ed"
SRC_URI[sha256sum] = "4e15f52ee45af7c5674d656041855448adbb5022618be252cd602d81b8e2978a"

GEM_NAME = "ffi"

inherit rubygems
