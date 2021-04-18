SUMMARY = "Represent a regular expression of some sort"
HOMEPAGE = "https://metacpan.org/pod/PPIx::Regexp"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=46;md5=f65adea87f7327e8fde90145fc4d610c"

DEPENDS += "libmodule-build-perl-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-Regexp-${PV}.tar.gz"

SRC_URI[md5sum] = "c3cceed2dc9a5dc3e5b7a6cfecdf9778"
SRC_URI[sha256sum] = "014cbe2c78a1e25189b59eb6af25e9ee3b4066d18eccbc31fdf2e9f07adb35f8"

S = "${WORKDIR}/PPIx-Regexp-${PV}"

inherit cpan_build
inherit cpan-upgrade-check
inherit native
