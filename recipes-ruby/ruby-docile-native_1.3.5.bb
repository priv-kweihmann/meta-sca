SUMMARY = "RubyGem: docile"
DESCRIPTION = "Docile treats the methods of a given ruby object as a DSL (domain specific language) within a given block"
HOMEPAGE = "https://ms-ati.github.io/docile/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e74ce31842082484e7525142a0cae01f"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "b07475d7f767d0b3f260223721369986"
SRC_URI[sha256sum] = "7f980b18ea99e95aed225efdd1694d9d8e10e3fdbd133718c6006d8e9bceedae"

GEM_NAME = "docile"

inherit rubygems
inherit native
