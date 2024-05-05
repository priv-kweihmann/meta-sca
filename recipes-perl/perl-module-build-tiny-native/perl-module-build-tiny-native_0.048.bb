SUMMARY = "A tiny replacement for Module::Build"
HOMEPAGE = "https://metacpan.org/pod/Module::Build::Tiny"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2b9e8b5e2bd19fcc97ac84b78a271a64"

DEPENDS += "\
            perl-extutils-config-native \
            perl-extutils-helper-native \
            perl-extutils-installpaths-native \
           "

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/Module-Build-Tiny-${PV}.tar.gz"

SRC_URI[sha256sum] = "79a73e506fb7badabdf79137a45c6c5027daaf6f9ac3dcfb9d4ffcce92eb36bd"

S = "${WORKDIR}/Module-Build-Tiny-${PV}"

inherit cpan_build
inherit native
