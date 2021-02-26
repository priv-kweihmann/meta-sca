SUMMARY = "RubyGem: psych"
DESCRIPTION = "Psych is a YAML parser and emitter"
HOMEPAGE = "https://github.com/ruby/psych"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6049ec73dcc7c3993367081b94cbd00a"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "0419dd0487d6bdb86812ea0d04ec444e"
SRC_URI[sha256sum] = "2a01e5eb59b1a80d287f0b5e3c980eca5e5609c811eb7f7ee0f7564254dac48a"

GEM_NAME = "psych"

inherit rubygems
inherit native
