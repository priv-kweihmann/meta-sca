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

SRC_URI[md5sum] = "916d2701a87a159df7f01c612c1c9dbe"
SRC_URI[sha256sum] = "68f4e4620e8a75124ce2dadee48d2ba5160b9167012924588d6fb242ff2d7206"

S = "${WORKDIR}/Module-Build-Tiny-${PV}"

inherit cpan_build
inherit native
