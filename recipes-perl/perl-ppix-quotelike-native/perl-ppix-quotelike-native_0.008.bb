SUMMARY = "Parse Perl string literals and string-literal-like things"
HOMEPAGE = "https://metacpan.org/pod/PPIx::QuoteLike"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-QuoteLike-${PV}.tar.gz"

SRC_URI[md5sum] = "9e2a6eca8cb777e738f301a5a11aa463"
SRC_URI[sha256sum] = "e42b0d3f92e696bec90e6610845ba93cb9bf347c2248193ed2c77eb75b63f437"

S = "${WORKDIR}/PPIx-QuoteLike-${PV}"

DEPENDS += "\
            libmodule-build-perl-native \
            "

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM  = "file://README;beginline=48;md5=f65adea87f7327e8fde90145fc4d610c"

inherit native
inherit cpan_build
