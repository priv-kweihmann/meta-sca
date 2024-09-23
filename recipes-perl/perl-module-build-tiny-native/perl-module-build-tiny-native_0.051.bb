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

SRC_URI[sha256sum] = "74fdce35e8cd4d787bc2d4fc1d43a291b7bbced4e94dc5fc592bd81ca93a98e9"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/Module-Build-Tiny-${PV}"

inherit cpan_build
inherit_defer native
