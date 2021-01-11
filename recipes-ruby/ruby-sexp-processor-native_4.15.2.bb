SUMMARY = "RubyGem: sexp_processor"
DESCRIPTION = "sexp_processor branches from ParseTree bringing all the generic sexpprocessing tools with it"
HOMEPAGE = "https://github.com/seattlerb/sexp_processor"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.rdoc;beginline=70;endline=93;md5=5db85eba7780ac1765a03fe0e5ec1657"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "82b604f3dbc34c220552a8b35c1eb343"
SRC_URI[sha256sum] = "0684494bd59480fc5c9c589871080f37adc5384c339be2a9b8a0369fd300cf68"

GEM_NAME = "sexp_processor"

inherit rubygems
inherit native
