SUMMARY = "Lists of reserved barewords and symbol names"
HOMEPAGE = "https://metacpan.org/pod/B::Keywords"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4036f260a45870203aaf8c730d179d0"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RU/RURBAN/B-Keywords-${PV}.tar.gz"

SRC_URI[md5sum] = "d20a9a2e6c2dc0f6fa72fe9669829903"
SRC_URI[sha256sum] = "13689a4c4273c0b9b4aa855764b34b7ad8bf7da1451b7468a5cef82f677b3aaa"

S = "${WORKDIR}/B-Keywords-${PV}"

inherit cpan
inherit cpan-upgrade-check
inherit native
