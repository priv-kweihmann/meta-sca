SUMMARY = "Extremely flexible deep comparison"
HOMEPAGE = "https://metacpan.org/pod/Test::Deep"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-1.0-or-later & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=227c31033a83e1d419d9f75d0c150a09"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RJ/RJBS/Test-Deep-${PV}.tar.gz"

SRC_URI[md5sum] = "02a83480ffeaf93e7498c4dbd5b507b1"
SRC_URI[sha256sum] = "42781e9943a7a215e662c4973b9feafdc019fd16469bdb849a8537ee58956273"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/Test-Deep-${PV}"

inherit cpan
inherit cpan-fixups
inherit_defer native
