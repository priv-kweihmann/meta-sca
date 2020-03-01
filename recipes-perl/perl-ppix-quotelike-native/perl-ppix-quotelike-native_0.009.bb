SUMMARY = "Parse Perl string literals and string-literal-like things"
HOMEPAGE = "https://metacpan.org/pod/PPIx::QuoteLike"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-QuoteLike-${PV}.tar.gz"

SRC_URI[md5sum] = "7e8124a3f38bf44857119345c0c48676"
SRC_URI[sha256sum] = "7b2ac4faf15cf5b6d72110d8142ad75847611c0c48d858ba1ba97a04233e6920"

S = "${WORKDIR}/PPIx-QuoteLike-${PV}"

DEPENDS += "\
            libmodule-build-perl-native \
            "

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM  = "file://README;beginline=48;md5=f65adea87f7327e8fde90145fc4d610c"

inherit native
inherit cpan_build
