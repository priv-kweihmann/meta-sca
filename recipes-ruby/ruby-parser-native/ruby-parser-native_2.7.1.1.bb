SUMMARY = "A Ruby parser written in pure Ruby."
HOMEPAGE = "https://github.com/whitequark/parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c66fb0a7723eeead586d670198ad6a34"

DEPENDS += "ruby-ast-native"

SRC_URI[md5sum] = "4ab61cda104754cafd0fcfc0be6a7ca7"
SRC_URI[sha256sum] = "332d7f571612eb145d7fcb78687fb8a85f560365a2f338106e4749faeba772fd"

GEM_NAME = "parser"

inherit sca-sanity
inherit rubygemsnative
