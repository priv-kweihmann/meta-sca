SUMMARY = "Lists of reserved barewords and symbol names"
HOMEPAGE = "https://metacpan.org/pod/B::Keywords"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4036f260a45870203aaf8c730d179d0"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RU/RURBAN/B-Keywords-${PV}.tar.gz"

SRC_URI[md5sum] = "0cea59c1a2381310fd6d7619be85d038"
SRC_URI[sha256sum] = "2daa155d2f267fb0dedd87f8a4c4fb5663879fc106517b1ee258353ef87aed34"

S = "${WORKDIR}/B-Keywords-${PV}"

inherit cpan
inherit_defer native
