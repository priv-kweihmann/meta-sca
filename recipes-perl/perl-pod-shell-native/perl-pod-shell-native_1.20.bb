SUMMARY = "a formatter for spellchecking Pod"
HOMEPAGE = "https://metacpan.org/pod/Pod::Spell"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=886efa7fcab87e46e4276a3db135992e"

DEPENDS += "\
            perl-class-tiny-native \
            perl-en-lingua-inflect-native \
            perl-file-sharedir-native \
            perl-path-tiny-native \
           "

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DO/DOLMEN/Pod-Spell-${PV}.tar.gz"

SRC_URI[md5sum] = "5e4d4c2b74e3cb780c5531cb8bfb04d4"
SRC_URI[sha256sum] = "6383f7bfe22bc0d839a08057a0ce780698b046184aea935be4833d94986dd03c"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/Pod-Spell-${PV}"

inherit cpan
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-perl \
    nativesdk-perl-class-tiny \
    nativesdk-perl-en-lingua-inflect \
    nativesdk-perl-path-tiny \
"
