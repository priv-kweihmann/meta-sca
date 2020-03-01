SUMMARY = "A Ruby parser written in pure Ruby."
HOMEPAGE = "https://github.com/whitequark/parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c66fb0a7723eeead586d670198ad6a34"

SRC_URI[md5sum] = "be1c3aa941c1f64d8af9d748a2ac6457"
SRC_URI[sha256sum] = "92d5a290374539c826dc2c4428372f05ae9caa9b6bfed2b44f37ffbb758379d7"

GEM_NAME = "parser"

DEPENDS += "\
            ruby-ast-native \ 
            "

inherit sca-sanity
inherit rubygemsnative
