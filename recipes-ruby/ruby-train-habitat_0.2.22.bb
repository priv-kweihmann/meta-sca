SUMMARY = "RubyGem: train-habitat"
DESCRIPTION = "Allows applications using Train to speak to Habitat."
HOMEPAGE = "https://github.com/inspec/train-habitat"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f16f9b4dd2d3afd4d244ba4e5d9e715e"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "7f9ececb846199215c6e6bcc71f38f11"
SRC_URI[sha256sum] = "dbd80090cbf6404159fe9b406747e936ef2697df798bed4637d47dd90a16b161"

GEM_NAME = "train-habitat"

inherit rubygems
