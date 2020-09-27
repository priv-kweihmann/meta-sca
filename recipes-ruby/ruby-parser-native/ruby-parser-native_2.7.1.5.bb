SUMMARY = "A Ruby parser written in pure Ruby."
HOMEPAGE = "https://github.com/whitequark/parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c66fb0a7723eeead586d670198ad6a34"

DEPENDS += "ruby-ast-native"

SRC_URI[md5sum] = "2ac9fcded6bb678f0fc4079dbebb3d03"
SRC_URI[sha256sum] = "d4c4794be14b4ffe89510648265ebfded5da107eb571422287a4c66a08b7966e"

GEM_NAME = "parser"

inherit rubygemsnative
