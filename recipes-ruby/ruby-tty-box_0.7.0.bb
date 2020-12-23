SUMMARY = "RubyGem: tty-box"
DESCRIPTION = "Draw various frames and boxes in the terminal window."
HOMEPAGE = "https://ttytoolkit.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8a34fdc5240f4b23e21fb8e468f44256"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-pastel \
                  ruby-strings \
                  ruby-tty-cursor"

SRC_URI[md5sum] = "4a2c97513449fb7da0d1c8020ff977b0"
SRC_URI[sha256sum] = "17f453a0c1df43871fdb6de461ee797b78574dacc652372fa2ae98a00785df8b"

GEM_NAME = "tty-box"

inherit rubygems
