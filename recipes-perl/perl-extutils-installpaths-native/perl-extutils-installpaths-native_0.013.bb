SUMMARY = "Build.PL install path logic made easy"
HOMEPAGE = "https://metacpan.org/pod/ExtUtils::InstallPaths"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9882d5f66a36f5df1054bc3ad6051f9d"

DEPENDS += "perl-extutils-config-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/ExtUtils-InstallPaths-${PV}.tar.gz"

SRC_URI[md5sum] = "84d9af4ab9c2d5211681122bcc6e67a3"
SRC_URI[sha256sum] = "65969d3ad8a3a2ea8ef5b4213ed5c2c83961bb5bd12f7ad35128f6bd5b684aa0"

S = "${WORKDIR}/ExtUtils-InstallPaths-${PV}"

inherit cpan
inherit_defer native
