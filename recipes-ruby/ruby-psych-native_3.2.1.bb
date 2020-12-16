SUMMARY = "RubyGem: psych"
DESCRIPTION = "Psych is a YAML parser and emitter"
HOMEPAGE = "https://github.com/ruby/psych"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6049ec73dcc7c3993367081b94cbd00a"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "2601ab487745235953ae42dfa78e447d"
SRC_URI[sha256sum] = "0236a5b255e0a26ca9c640e3422c13d17dca72afd4aa68109be09c410a67805f"

GEM_NAME = "psych"

inherit rubygems
inherit native
