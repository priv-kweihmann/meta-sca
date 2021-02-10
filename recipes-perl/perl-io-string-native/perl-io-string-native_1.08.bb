SUMMARY = "Emulate file interface for in-core strings"
HOMEPAGE = "https://metacpan.org/pod/IO::String"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=16;md5=9ec31d28c1f3dbb643ce3ca6f890a0b0"

SRC_URI = "https://cpan.metacpan.org/authors/id/G/GA/GAAS/IO-String-${PV}.tar.gz"

SRC_URI[md5sum] = "250e5424f290299fc3d6b5d1e9da3835"
SRC_URI[sha256sum] = "2a3f4ad8442d9070780e58ef43722d19d1ee21a803bf7c8206877a10482de5a0"

S = "${WORKDIR}/IO-String-${PV}"

inherit cpan
inherit native
