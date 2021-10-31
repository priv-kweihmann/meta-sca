SUMMARY = "Parse Perl string literals and string-literal-like things"
HOMEPAGE = "https://metacpan.org/pod/PPIx::QuoteLike"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=48;md5=f65adea87f7327e8fde90145fc4d610c"

DEPENDS += "libmodule-build-perl-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-QuoteLike-${PV}.tar.gz"

SRC_URI[md5sum] = "57b0814ba2d3d47704a0611d9c0df998"
SRC_URI[sha256sum] = "e6ac523deb76c70b9994b24f4401e2bc1eca31c6ee8dc3143cd8fe7f8e4f2fff"

S = "${WORKDIR}/PPIx-QuoteLike-${PV}"

inherit cpan_build
inherit cpan-upgrade-check
inherit native
