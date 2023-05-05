SUMMARY = "A tiny replacement for Module::Build"
HOMEPAGE = "https://metacpan.org/pod/Module::Build::Tiny"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6374136f6774db2f51cc116f5efbf705"

DEPENDS += "\
            perl-extutils-config-native \
            perl-extutils-helper-native \
            perl-extutils-installpaths-native \
           "

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/Module-Build-Tiny-${PV}.tar.gz"

SRC_URI[md5sum] = "5d897e7adda77642dd4c27f2ebbf0a2d"
SRC_URI[sha256sum] = "d20692eee246d0b329b7f7659f36286b14ae0696fe91078a64b7078f8876d300"

S = "${WORKDIR}/Module-Build-Tiny-${PV}"

inherit cpan_build
inherit native
