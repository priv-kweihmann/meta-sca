SUMMARY = "Lists of reserved barewords and symbol names"
HOMEPAGE = "https://metacpan.org/pod/B::Keywords"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4036f260a45870203aaf8c730d179d0"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RU/RURBAN/B-Keywords-${PV}.tar.gz"

SRC_URI[md5sum] = "2ce30d5dd0562e2d098acab2f344ee03"
SRC_URI[sha256sum] = "9e7eb67695929487c61aaf2dae8baf9dda1ad87602bb5a094f10744b12765e3e"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/B-Keywords-${PV}"

inherit cpan
inherit_defer native
