SUMMARY = "RubyGem: tty-prompt"
DESCRIPTION = "A beautiful and powerful interactive command line prompt with a robust API for getting and validating complex inputs."
HOMEPAGE = "https://ttytoolkit.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c9f5a91217b4b11751b2084dda90ff19"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-pastel \
                  ruby-tty-reader"

SRC_URI[md5sum] = "7a98f5b7520238a9442e97643ffb564b"
SRC_URI[sha256sum] = "a7987ebec253303c3c9a3e17b1bfc02e1df4e987dd6ca55e2f5bfdaa6b041e9c"

GEM_NAME = "tty-prompt"

inherit rubygems
