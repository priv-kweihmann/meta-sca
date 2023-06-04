SUMMARY = "A tiny replacement for Module::Build"
HOMEPAGE = "https://metacpan.org/pod/Module::Build::Tiny"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=147a7b891d1584d3d33e478b1f2327c5"

DEPENDS += "\
            perl-extutils-config-native \
            perl-extutils-helper-native \
            perl-extutils-installpaths-native \
           "

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/Module-Build-Tiny-${PV}.tar.gz"

SRC_URI[md5sum] = "55b4c9ca8e48c5adda464aeb3b772a85"
SRC_URI[sha256sum] = "be193027e2debb4c9926434aaf1aa46c9fc7bf4db83dcc347eb6e359ee878289"

S = "${WORKDIR}/Module-Build-Tiny-${PV}"

inherit cpan_build
inherit native
