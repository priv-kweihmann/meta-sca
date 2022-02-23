SUMMARY = "Represent a regular expression of some sort"
HOMEPAGE = "https://metacpan.org/pod/PPIx::Regexp"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=46;md5=f65adea87f7327e8fde90145fc4d610c"

DEPENDS += "libmodule-build-perl-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-Regexp-${PV}.tar.gz"

SRC_URI[md5sum] = "d5317095ee89a5359b5ded871ec6e329"
SRC_URI[sha256sum] = "5fb1907f7456bd01d82d57deef0cab4c66b6b7fb530fae0c0f4d360bf1b1dd4f"

S = "${WORKDIR}/PPIx-Regexp-${PV}"

inherit cpan_build
inherit cpan-upgrade-check
inherit native
