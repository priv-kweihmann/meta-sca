SUMMARY = "Lists of reserved barewords and symbol names"
HOMEPAGE = "https://metacpan.org/pod/B::Keywords"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4036f260a45870203aaf8c730d179d0"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RU/RURBAN/B-Keywords-${PV}.tar.gz"

SRC_URI[md5sum] = "9544eb97dc72083f3edec77db0d4ae5c"
SRC_URI[sha256sum] = "ef10b9085e674eaa417ccb7d692fb6cd98f7bb67de2a127eba3457d8ae587cff"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/B-Keywords-${PV}"

inherit cpan
inherit_defer native
