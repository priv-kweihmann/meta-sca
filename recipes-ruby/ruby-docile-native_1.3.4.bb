SUMMARY = "RubyGem: docile"
DESCRIPTION = "Docile treats the methods of a given ruby object as a DSL (domain specific language) within a given block"
HOMEPAGE = "https://ms-ati.github.io/docile/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e74ce31842082484e7525142a0cae01f"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "e853e56a9d1f5d054aa6b2f107cd9093"
SRC_URI[sha256sum] = "9a4299249739c956557fa912abe20ee620399e214773c232e46b37673d0d2872"

GEM_NAME = "docile"

inherit rubygems
inherit native
