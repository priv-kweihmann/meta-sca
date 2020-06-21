SUMMARY = "A Ruby parser written in pure Ruby."
HOMEPAGE = "https://github.com/whitequark/parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c66fb0a7723eeead586d670198ad6a34"

DEPENDS += "ruby-ast-native"

SRC_URI[md5sum] = "cb408fc7c5b66ec83dc9843ca4d8de22"
SRC_URI[sha256sum] = "b6629f5772e6e4d1c83ce56dfb48a20f9ad589c5462ebe751ad64db8a1fd6080"

GEM_NAME = "parser"

inherit rubygemsnative
