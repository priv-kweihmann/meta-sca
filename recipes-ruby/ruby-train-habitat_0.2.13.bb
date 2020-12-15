SUMMARY = "RubyGem: train-habitat"
DESCRIPTION = "Allows applications using Train to speak to Habitat."
HOMEPAGE = "https://github.com/inspec/train-habitat"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f16f9b4dd2d3afd4d244ba4e5d9e715e"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "33658bcc3ad24c44cbc10f789f5e7542"
SRC_URI[sha256sum] = "16a4662679686391cc0b9934f8cc160781fc2c28930a617c0b0de0b7e717c4f0"

GEM_NAME = "train-habitat"

inherit rubygems
