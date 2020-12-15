SUMMARY = "RubyGem: tty-box"
DESCRIPTION = "Draw various frames and boxes in the terminal window."
HOMEPAGE = "https://ttytoolkit.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=4de86edc00706aa95e14a4b5be1cc7e0"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-pastel \
                  ruby-strings \
                  ruby-tty-cursor"

SRC_URI[md5sum] = "fa61739e13d1392dd0c3d8c81f9a4358"
SRC_URI[sha256sum] = "483f96bc0b3fbb2de273155739d13837f1a41dc2597260ec10967d39891d4868"

GEM_NAME = "tty-box"

inherit rubygems
