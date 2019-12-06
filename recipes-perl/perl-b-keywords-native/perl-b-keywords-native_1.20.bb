SUMMARY = "Lists of reserved barewords and symbol names"
HOMEPAGE = "https://metacpan.org/pod/B::Keywords"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RU/RURBAN/B-Keywords-${PV}.tar.gz"

SRC_URI[md5sum] = "c26c461160f05994e677a9a0a70b7a03"
SRC_URI[sha256sum] = "60fec03b6e75c2810fa89b8b29e7f936a9d5224d6e52b509551d5f6f5fe95b8a"

S = "${WORKDIR}/B-Keywords-${PV}"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM  = "file://LICENSE;md5=d4036f260a45870203aaf8c730d179d0"

inherit native
inherit cpan
