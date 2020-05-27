SUMMARY = "A Ruby parser written in pure Ruby."
HOMEPAGE = "https://github.com/whitequark/parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c66fb0a7723eeead586d670198ad6a34"

DEPENDS += "ruby-ast-native"

SRC_URI[md5sum] = "4ef254f8294caa7a5c7091b5756e4926"
SRC_URI[sha256sum] = "2dc7392ccdb94451d2e43542f8504e8f67b98cbf5cea975866e9cd7da0104198"

GEM_NAME = "parser"

inherit rubygemsnative
