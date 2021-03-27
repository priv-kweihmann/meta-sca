SUMMARY = "Represent a regular expression of some sort"
HOMEPAGE = "https://metacpan.org/pod/PPIx::Regexp"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=46;md5=f65adea87f7327e8fde90145fc4d610c"

DEPENDS += "libmodule-build-perl-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-Regexp-${PV}.tar.gz"

SRC_URI[md5sum] = "ff09a67dd40668939324b34ffea00434"
SRC_URI[sha256sum] = "b5976781958a5a74a84427f5e55df7406f83d8ab0ce12560f1ebccb81e5c2441"

S = "${WORKDIR}/PPIx-Regexp-${PV}"

inherit cpan_build
inherit native
