SUMMARY = "RubyGem: psych"
DESCRIPTION = "Psych is a YAML parser and emitter"
HOMEPAGE = "https://github.com/ruby/psych"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6049ec73dcc7c3993367081b94cbd00a"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "ce06d61e68a422959a2f3ea44339348c"
SRC_URI[sha256sum] = "14c0a2e194ae1b1c1ca96b10b4e8c36af1642dbf4fef25a6518d9b47706a1965"

GEM_NAME = "psych"

inherit rubygems
inherit native
