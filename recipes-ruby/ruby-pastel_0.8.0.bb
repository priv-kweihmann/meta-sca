SUMMARY = "RubyGem: pastel"
DESCRIPTION = "Terminal strings styling with intuitive and clean API."
HOMEPAGE = "https://ttytoolkit.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=51301a5886c31f0a5f89c467cb243c7f"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-tty-color"

SRC_URI[md5sum] = "0b238cba4ecffadc6ef557c6803d5a01"
SRC_URI[sha256sum] = "481da9fb7d2f6e6b1a08faf11fa10363172dc40fd47848f096ae21209f805a75"

GEM_NAME = "pastel"

inherit rubygems
