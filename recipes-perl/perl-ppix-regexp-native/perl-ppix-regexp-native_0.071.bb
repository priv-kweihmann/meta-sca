SUMMARY = "Represent a regular expression of some sort"
HOMEPAGE = "https://metacpan.org/pod/PPIx::Regexp"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=46;md5=f65adea87f7327e8fde90145fc4d610c"

DEPENDS += "libmodule-build-perl-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-Regexp-${PV}.tar.gz"

SRC_URI[md5sum] = "dc032a957a7a7d9f67cad2f55391e4c9"
SRC_URI[sha256sum] = "06ff1db3a7509d67d40b1ca860b1c23f70e96616415c48aafad3c392440dec66"

S = "${WORKDIR}/PPIx-Regexp-${PV}"

inherit native
inherit cpan_build
