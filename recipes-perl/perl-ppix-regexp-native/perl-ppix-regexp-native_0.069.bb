SUMMARY = "Represent a regular expression of some sort"
HOMEPAGE = "https://metacpan.org/pod/PPIx::Regexp"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-Regexp-${PV}.tar.gz"

SRC_URI[md5sum] = "d5e1843648c3641463e7305e2f03a2a4"
SRC_URI[sha256sum] = "f000601899f102d28187ca0e3021b2e1ea990992fcf3f28ca6c55f20dd91e062"

S = "${WORKDIR}/PPIx-Regexp-${PV}"

DEPENDS += "\
            libmodule-build-perl-native \
            "

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM  = "file://README;beginline=46;md5=f65adea87f7327e8fde90145fc4d610c"

inherit native
inherit cpan_build
