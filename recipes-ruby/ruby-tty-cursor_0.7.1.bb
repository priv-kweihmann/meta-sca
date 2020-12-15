SUMMARY = "RubyGem: tty-cursor"
DESCRIPTION = "The purpose of this library is to help move the terminal cursor around and manipulate text by using intuitive method calls."
HOMEPAGE = "https://ttytoolkit.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c9f5a91217b4b11751b2084dda90ff19"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "172e75b40ba5ca5610b0109644667085"
SRC_URI[sha256sum] = "79534185e6a777888d88628b14b6a1fdf5154a603f285f80b1753e1908e0bf48"

GEM_NAME = "tty-cursor"

inherit rubygems
