SUMMARY = "RubyGem: uber"
DESCRIPTION = "A gem-authoring framework."
HOMEPAGE = "https://github.com/apotonick/uber"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a6bdd96db3845e32cb1f0234df032a60"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "5532f4e37f28261d96fc47ab2f2635e3"
SRC_URI[sha256sum] = "5beeb407ff807b5db994f82fa9ee07cfceaa561dad8af20be880bc67eba935dc"

GEM_NAME = "uber"

inherit rubygems
