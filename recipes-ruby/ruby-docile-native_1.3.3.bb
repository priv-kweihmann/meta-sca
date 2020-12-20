SUMMARY = "RubyGem: docile"
DESCRIPTION = "Docile treats the methods of a given ruby object as a DSL (domain specific language) within a given block"
HOMEPAGE = "https://ms-ati.github.io/docile/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e74ce31842082484e7525142a0cae01f"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "b2691bbbea8af1fd26f4c9966e4ec9f8"
SRC_URI[sha256sum] = "d8b06fe13fb16b3af48f338a3ffc7b9c65a46ece460d11f98781053740a945a2"

GEM_NAME = "docile"

inherit rubygems
inherit native
