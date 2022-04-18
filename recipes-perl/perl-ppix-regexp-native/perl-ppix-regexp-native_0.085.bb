SUMMARY = "Represent a regular expression of some sort"
HOMEPAGE = "https://metacpan.org/pod/PPIx::Regexp"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=46;md5=f65adea87f7327e8fde90145fc4d610c"

DEPENDS += "libmodule-build-perl-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-Regexp-${PV}.tar.gz"

SRC_URI[md5sum] = "1a536cf698d9604d5edf631131a1ce11"
SRC_URI[sha256sum] = "2ef0bb89248438e0138fc64c9ab0cacd0a532e908882a07dd8f0b841f130cf1d"

S = "${WORKDIR}/PPIx-Regexp-${PV}"

inherit cpan_build
inherit cpan-upgrade-check
inherit native
