SUMMARY = "A Ruby parser written in pure Ruby."
HOMEPAGE = "https://github.com/whitequark/parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM  = "file://LICENSE.txt;md5=c66fb0a7723eeead586d670198ad6a34"

SRC_URI[md5sum] = "f48fa8d982e79b0813194d8d61fccbbf"
SRC_URI[sha256sum] = "d11a7ca1bebe72fdc738ade09ffd2e004be69b9a20d074e66a6dd9b5b2d9b490"

GEM_NAME = "parser"

DEPENDS += "\
            ruby-ast-native \ 
            "

inherit sca-sanity
inherit rubygemsnative
