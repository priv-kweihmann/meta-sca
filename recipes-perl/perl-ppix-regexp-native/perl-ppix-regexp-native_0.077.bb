SUMMARY = "Represent a regular expression of some sort"
HOMEPAGE = "https://metacpan.org/pod/PPIx::Regexp"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=46;md5=f65adea87f7327e8fde90145fc4d610c"

DEPENDS += "libmodule-build-perl-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-Regexp-${PV}.tar.gz"

SRC_URI[md5sum] = "44adb933d74d813917ad70282b0d26a3"
SRC_URI[sha256sum] = "c40d257d5929b95d8c0452d8c1fa17c4f338a069f3c6d3b79b9c1442d7b36980"

S = "${WORKDIR}/PPIx-Regexp-${PV}"

inherit native
inherit cpan_build
