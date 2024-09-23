SUMMARY = "Build.PL install path logic made easy"
HOMEPAGE = "https://metacpan.org/pod/ExtUtils::InstallPaths"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9882d5f66a36f5df1054bc3ad6051f9d"

DEPENDS += "perl-extutils-config-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/ExtUtils-InstallPaths-${PV}.tar.gz"

SRC_URI[md5sum] = "34fb12d1b245e44142846c72905beffc"
SRC_URI[sha256sum] = "ae65d20cc3c7e14b3cd790915c84510f82dfb37a4c9b88aa74b2e843af417d01"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/ExtUtils-InstallPaths-${PV}"

inherit cpan
inherit_defer native
