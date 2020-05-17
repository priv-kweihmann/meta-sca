SUMMARY = "A Ruby parser written in pure Ruby."
HOMEPAGE = "https://github.com/whitequark/parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c66fb0a7723eeead586d670198ad6a34"

DEPENDS += "ruby-ast-native"

SRC_URI[md5sum] = "b04ba0b7eb5ef0019e6622dad1ee21f2"
SRC_URI[sha256sum] = "205f885d36e897eb3adaea35959fa0d377b955a9c35c4a7cc8bbc5badba0faf5"

GEM_NAME = "parser"

inherit rubygemsnative
