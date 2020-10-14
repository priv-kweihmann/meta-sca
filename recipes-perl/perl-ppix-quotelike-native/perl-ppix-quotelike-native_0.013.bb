SUMMARY = "Parse Perl string literals and string-literal-like things"
HOMEPAGE = "https://metacpan.org/pod/PPIx::QuoteLike"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=48;md5=f65adea87f7327e8fde90145fc4d610c"

DEPENDS += "libmodule-build-perl-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-QuoteLike-${PV}.tar.gz"

SRC_URI[md5sum] = "b768aca21d88f5d79afd3ded8e1991a8"
SRC_URI[sha256sum] = "8d1e33838278d252ab6f586840fcee70e19bb7352035ba85fd322475262d1817"

S = "${WORKDIR}/PPIx-QuoteLike-${PV}"

inherit native
inherit cpan_build
