SUMMARY = "Lists of reserved barewords and symbol names"
HOMEPAGE = "https://metacpan.org/pod/B::Keywords"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4036f260a45870203aaf8c730d179d0"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RU/RURBAN/B-Keywords-${PV}.tar.gz"

SRC_URI[md5sum] = "7c730bee51f9c447d07901455bd65513"
SRC_URI[sha256sum] = "a664181020cdbf09ba711fed0abd26867386c81cb4652804c361f3c4c1d55344"

S = "${WORKDIR}/B-Keywords-${PV}"

inherit cpan
inherit native
