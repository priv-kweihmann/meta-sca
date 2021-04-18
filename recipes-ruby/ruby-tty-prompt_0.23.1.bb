SUMMARY = "RubyGem: tty-prompt"
DESCRIPTION = "A beautiful and powerful interactive command line prompt with a robust API for getting and validating complex inputs."
HOMEPAGE = "https://ttytoolkit.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ccb3f6c9399ae36f003ef2debf871be1"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-pastel \
                  ruby-tty-reader"

SRC_URI[md5sum] = "c4cca5f2f20b6441f7f055147cb6a941"
SRC_URI[sha256sum] = "fcdbce905238993f27eecfdf67597a636bc839d92192f6a0eef22b8166449ec8"

GEM_NAME = "tty-prompt"

inherit rubygems
