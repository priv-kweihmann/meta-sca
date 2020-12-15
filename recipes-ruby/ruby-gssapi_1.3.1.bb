SUMMARY = "RubyGem: gssapi"
DESCRIPTION = "A FFI wrapper around the system GSSAPI library"
HOMEPAGE = "http://github.com/zenchild/gssapi"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=97fb757cd9918aafc0a447460b5897cd"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-ffi"

SRC_URI[md5sum] = "4bd2df09d8e0ab4c6d2e1828c344eba1"
SRC_URI[sha256sum] = "c51cf30842ee39bd93ce7fc33e20405ff8a04cda9dec6092071b61258284aee1"

GEM_NAME = "gssapi"

inherit rubygems
