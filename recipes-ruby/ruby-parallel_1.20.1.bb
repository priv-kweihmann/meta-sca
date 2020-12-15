SUMMARY = "RubyGem: parallel"
DESCRIPTION = "Run any kind of code in parallel processes"
HOMEPAGE = "https://github.com/grosser/parallel"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE.txt;md5=01d743313af3f7a981bcce70a74e06c2"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "2047cd5b7f6915ed3d7a106f3fb28ecd"
SRC_URI[sha256sum] = "ed4faec4498bf921e10ac8683ed5840d91e2f307c26f8e24f8d8ae58415ea500"

GEM_NAME = "parallel"

inherit rubygems
