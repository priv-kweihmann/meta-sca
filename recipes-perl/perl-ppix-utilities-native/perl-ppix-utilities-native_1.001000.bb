SUMMARY = "Extensions to PPI"
HOMEPAGE = "https://metacpan.org/pod/PPIx::Utilities"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2ffee94e0815161d2b18352b0fb7d42b"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/EL/ELLIOTJS/PPIx-Utilities-${PV}.tar.gz"

SRC_URI[md5sum] = "4dc113960205173cf114ae3bdaa37f61"
SRC_URI[sha256sum] = "03a483386fd6a2c808f09778d44db06b02c3140fb24ba4bf12f851f46d3bcb9b"

S = "${WORKDIR}/PPIx-Utilities-${PV}"

inherit cpan
inherit native
