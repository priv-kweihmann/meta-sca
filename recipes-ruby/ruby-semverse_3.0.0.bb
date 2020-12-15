SUMMARY = "RubyGem: semverse"
DESCRIPTION = "An elegant library for representing and comparing SemVer versions and constraints"
HOMEPAGE = "https://github.com/berkshelf/semverse/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0ea6ed752656ac5be37c1a1a18c684f1"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "886e22f94921973281882c6da159795e"
SRC_URI[sha256sum] = "28dc827d3376097b478c0a06111bb1259eb8341f0f2498dd23feae39c59449e3"

GEM_NAME = "semverse"

inherit rubygems
