SUMMARY = "Parse Perl string literals and string-literal-like things"
HOMEPAGE = "https://metacpan.org/pod/PPIx::QuoteLike"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=48;md5=f65adea87f7327e8fde90145fc4d610c"

DEPENDS += "libmodule-build-perl-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-QuoteLike-${PV}.tar.gz"

SRC_URI[md5sum] = "6a7d30b649f03144d3c27b23db0db2d0"
SRC_URI[sha256sum] = "ca351c2ab437569afb8a32bd4a83f564532121a0da3858fa73b26d127d860b9b"

S = "${WORKDIR}/PPIx-QuoteLike-${PV}"

inherit native
inherit cpan_build
