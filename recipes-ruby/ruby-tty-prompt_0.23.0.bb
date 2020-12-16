SUMMARY = "RubyGem: tty-prompt"
DESCRIPTION = "A beautiful and powerful interactive command line prompt with a robust API for getting and validating complex inputs."
HOMEPAGE = "https://ttytoolkit.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c9f5a91217b4b11751b2084dda90ff19"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-pastel \
                  ruby-tty-reader"

SRC_URI[md5sum] = "273bcaf1bcc4acf504204146eca35921"
SRC_URI[sha256sum] = "624a277a3c79e007083c8602c663f982f28b580275ab01b3b4a14c5ee8e51b66"

GEM_NAME = "tty-prompt"

inherit rubygems
