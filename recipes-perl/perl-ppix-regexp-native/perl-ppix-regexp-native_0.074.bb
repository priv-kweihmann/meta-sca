SUMMARY = "Represent a regular expression of some sort"
HOMEPAGE = "https://metacpan.org/pod/PPIx::Regexp"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=46;md5=f65adea87f7327e8fde90145fc4d610c"

DEPENDS += "libmodule-build-perl-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-Regexp-${PV}.tar.gz"

SRC_URI[md5sum] = "1fc8e10b7851eacc51c2ca084e35d686"
SRC_URI[sha256sum] = "c4c02ef32d5357ac3f81c8cb6d7da5f1c9e9bea2f47f1476c847efac276d109f"

S = "${WORKDIR}/PPIx-Regexp-${PV}"

inherit native
inherit cpan_build
