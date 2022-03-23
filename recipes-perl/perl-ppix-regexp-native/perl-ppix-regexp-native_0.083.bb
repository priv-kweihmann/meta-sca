SUMMARY = "Represent a regular expression of some sort"
HOMEPAGE = "https://metacpan.org/pod/PPIx::Regexp"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=46;md5=f65adea87f7327e8fde90145fc4d610c"

DEPENDS += "libmodule-build-perl-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-Regexp-${PV}.tar.gz"

SRC_URI[md5sum] = "e3e080c96e10b338a882d72542f7a8c9"
SRC_URI[sha256sum] = "31cbfa6f02f9430547feef462aae94de0a99a94aba98b254556afa0d80249167"

S = "${WORKDIR}/PPIx-Regexp-${PV}"

inherit cpan_build
inherit cpan-upgrade-check
inherit native
