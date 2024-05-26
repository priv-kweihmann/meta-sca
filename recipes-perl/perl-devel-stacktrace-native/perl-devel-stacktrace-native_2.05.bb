SUMMARY = "An object representing a stack trace"
HOMEPAGE = "https://metacpan.org/pod/Devel::StackTrace"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c15f2badb666f40116f8db9265d63c27"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Devel-StackTrace-${PV}.tar.gz"

SRC_URI[md5sum] = "b8ca19bb4c76e98a04373618db9c7c3c"
SRC_URI[sha256sum] = "63cb6196e986a7e578c4d28b3c780e7194835bfc78b68eeb8f00599d4444888c"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/Devel-StackTrace-${PV}"

inherit cpan
inherit_defer native
