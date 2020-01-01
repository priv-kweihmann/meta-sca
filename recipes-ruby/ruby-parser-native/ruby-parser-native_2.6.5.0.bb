SUMMARY = "A Ruby parser written in pure Ruby."
HOMEPAGE = "https://github.com/whitequark/parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM  = "file://LICENSE.txt;md5=c66fb0a7723eeead586d670198ad6a34"

SRC_URI[md5sum] = "bca487b8926b28fe18dba5a33faf4ccb"
SRC_URI[sha256sum] = "3c8a1a1e26ba7b93a0d848b2a1fd558164881c879b18fe19c58a9946c9deaa25"

GEM_NAME = "parser"

DEPENDS += "\
            ruby-ast-native \ 
            "

inherit sca-sanity
inherit rubygemsnative
