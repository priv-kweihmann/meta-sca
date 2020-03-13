SUMMARY = "A Ruby parser written in pure Ruby."
HOMEPAGE = "https://github.com/whitequark/parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c66fb0a7723eeead586d670198ad6a34"

SRC_URI[md5sum] = "d3cf0c89e1f8656374215d868f2624a3"
SRC_URI[sha256sum] = "69fc8210aaab40d568658cf026aecf8190cdbcdd1ea2925433d92e67287bdda6"

GEM_NAME = "parser"

DEPENDS += "\
            ruby-ast-native \ 
            "

inherit sca-sanity
inherit rubygemsnative
