SUMMARY = "RubyGem: excon"
DESCRIPTION = "EXtended http(s) CONnections"
HOMEPAGE = "https://github.com/excon/excon"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=8b04a0291ec55b31563a50b191b72cb1"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "7091d6257fb4aa46cbf2c99dec9ecbf3"
SRC_URI[sha256sum] = "05b579499c852f6880b0be1d231aba8f893558ce593ab17bdd00ea6ec9d1c84a"

GEM_NAME = "excon"

inherit rubygems
