SUMMARY = "Lists of reserved barewords and symbol names"
HOMEPAGE = "https://metacpan.org/pod/B::Keywords"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4036f260a45870203aaf8c730d179d0"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RU/RURBAN/B-Keywords-${PV}.tar.gz"

SRC_URI[md5sum] = "c316d3362c579e756fbaff9b9d693c97"
SRC_URI[sha256sum] = "5a25e89c7d251ba76fc4f7f60d079bd265561b2316ff1f2795d9dbf0c30f8888"

S = "${WORKDIR}/B-Keywords-${PV}"

inherit cpan
inherit native
