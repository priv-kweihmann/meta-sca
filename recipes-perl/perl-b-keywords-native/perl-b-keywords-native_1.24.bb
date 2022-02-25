SUMMARY = "Lists of reserved barewords and symbol names"
HOMEPAGE = "https://metacpan.org/pod/B::Keywords"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4036f260a45870203aaf8c730d179d0"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RU/RURBAN/B-Keywords-${PV}.tar.gz"

SRC_URI[md5sum] = "ee282ed8f8d64e3bea6ef59b0494765e"
SRC_URI[sha256sum] = "a5cf6bb285d06d17cee227783b723bb274213fd4153a5dee311d240e1169606e"

S = "${WORKDIR}/B-Keywords-${PV}"

inherit cpan
inherit cpan-upgrade-check
inherit native
