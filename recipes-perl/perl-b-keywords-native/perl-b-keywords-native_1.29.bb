SUMMARY = "Lists of reserved barewords and symbol names"
HOMEPAGE = "https://metacpan.org/pod/B::Keywords"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4036f260a45870203aaf8c730d179d0"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RU/RURBAN/B-Keywords-${PV}.tar.gz"

SRC_URI[md5sum] = "42fe078471120b9fda9664cada845eb7"
SRC_URI[sha256sum] = "e0aa19d3390409f0ece7342ab041c5b432c31d7cf1abf182c134b6aab78784b0"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/B-Keywords-${PV}"

inherit cpan
inherit cpan-fixups
inherit_defer native
