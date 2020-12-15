SUMMARY = "RubyGem: builder"
DESCRIPTION = "Builder provides a number of builder objects that make creating structured datasimple to do"
HOMEPAGE = "http://onestepback.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=343a457ff389ad704b1794e9b11e031e"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "3f97760c1802f23c7ddd5e789eba21fa"
SRC_URI[sha256sum] = "99caf08af60c8d7f3a6b004029c4c3c0bdaebced6c949165fe98f1db27fbbc10"

GEM_NAME = "builder"

inherit rubygems
