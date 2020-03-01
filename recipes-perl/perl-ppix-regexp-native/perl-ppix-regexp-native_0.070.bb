SUMMARY = "Represent a regular expression of some sort"
HOMEPAGE = "https://metacpan.org/pod/PPIx::Regexp"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-Regexp-${PV}.tar.gz"

SRC_URI[md5sum] = "4e1f495ef2383a9b886b28034eda85c8"
SRC_URI[sha256sum] = "da93c086bc05cc6fd016f385d24db17f45b1ae72d07f07c111fb4e935e317d53"

S = "${WORKDIR}/PPIx-Regexp-${PV}"

DEPENDS += "\
            libmodule-build-perl-native \
            "

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM  = "file://README;beginline=46;md5=f65adea87f7327e8fde90145fc4d610c"

inherit native
inherit cpan_build
