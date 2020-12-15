SUMMARY = "RubyGem: zeitwerk"
DESCRIPTION = "Zeitwerk implements constant autoloading with Ruby semantics"
HOMEPAGE = "https://github.com/fxn/zeitwerk"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=5812b5ac986b987e30b9a65d087d8cd7"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "22fe9df84493232b314198b2a4f3cc9c"
SRC_URI[sha256sum] = "f4d6279b0ef0cb35c9e1bddbcecd6b148df82f1cf7b8023ac03d6625f567869c"

GEM_NAME = "zeitwerk"

inherit rubygems
